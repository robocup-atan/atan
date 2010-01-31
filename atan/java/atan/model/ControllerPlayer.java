package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.Errors;
import atan.model.enums.Flag;
import atan.model.enums.Line;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.ServerParams;
import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;
import atan.model.enums.Warning;

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
     * @return ActionsPlayer.
     */
    public ActionsPlayer getPlayer();

    /**
     * Sets the player that the controller is controlling.
     * @param c ActionsPlayer.
     */
    public void setPlayer(ActionsPlayer c);

    /**
     * Get the players type, if set.
     * @return The players type (any string).
     */
    public String getType();

    /**
     * Set the players type.
     * @param newType what the type will now be
     */
    public void setType(String newType);

    /**
     * The controller is informed when one of the flags along the right touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     * @param flag possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, MID,
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagRight(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags along the left touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     * @param flag possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, MID
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagLeft(Flag flag, double distance, double direction, double distChange, double dirChange,
                                double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags behind our teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     * @param flag possible values: LEFT_10, LEFT_20, LEFT_30, MID,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                               double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags behind the other teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     * @param flag possible values: LEFT_10, LEFT_20, LEFT_30, MID,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when one of the flags on the center line are
     * in sight.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagCenter(Flag flag, double distance, double direction, double distChange, double dirChange,
                                  double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of our teams corner flags is
     * in sight.
     * @param flag possible values: LEFT, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams corner flags is
     * in sight.
     * @param flag possible values: LEFT, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagCornerOther(Flag flag, double distance, double direction, double distChange,
                                       double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of our teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the centre point between these corners.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction, double distChange,
                                      double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the centre point between these corners.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction, double distChange,
            double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of our teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                   double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of the flag.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFlagGoalOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the pitch lines are in sight.
     *
     * @param line
     * @param distance The distance to the line.
     * @param direction The direction of the line.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeLine(Line line, double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of the other teams players is in sight.
     * @param number The ID of the player (from 1 to 11)
     * @param goalie If the seen player is a goalie. False if unknown.
     * @param distance The distance to the player.
     * @param direction The direction of the player.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeePlayerOther(int number, boolean goalie, double distance, double direction, double distChange,
                                   double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that one of it's own team is in sight.
     * @param number The ID of the player (from 1 to 11)
     * @param goalie If the seen player is a goalie. False if unknown.
     * @param distance The distance to the player.
     * @param direction The direction of the player.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeePlayerOwn(int number, boolean goalie, double distance, double direction, double distChange,
                                 double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed that the Ball is in sight.
     * @param distance The distance to the ball.
     * @param direction The direction of the ball.
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeBall(double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection);

    /**
     * The controller is informed when a referee message is broadcast.
     * @param refereeMessage possible values: FOUL_OWN, FOUL_OTHER,
     * HALF_TIME, TIME_UP, TIME_UP_WITHOUT_A_TEAM,
     * TIME_EXTENDED, DROP_BALL, OFFSIDE_OWN, OFFSIDE_OTHER
     */
    public void infoHearReferee(RefereeMessage refereeMessage);

    /**
     * The controller is informed when a play mode message is broadcast.
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
     * The player is informed when it hears an error message.
     * @param error The error to handle
     */
    public void infoHearError(Errors error);

    /**
     * The player is informed when it hears an ok message.
     * @param ok The message to handle.
     */
    public void infoHearOk(Ok ok);

    /**
     * The player is informed when it hears a warning.
     * @param warning The warning to handle.
     */
    public void infoHearWarning(Warning warning);

    /**
     * @param viewQuality possible values: HIGH, LOW
     * @param viewAngle possible values: NARROW, NORMAL, WIDE
     * @param stamina
     * @param unknown
     * @param effort
     * @param speedAmount
     * @param speedDirection
     * @param headAngle
     * @param dashCount
     * @param kickCount
     * @param turnCount
     * @param sayCount
     * @param turnNeckCount
     * @param catchCount
     * @param moveCount
     * @param changeViewCount
     */
    public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina, double unknown,
                              double effort, double speedAmount, double speedDirection, double headAngle,
                              int kickCount, int dashCount, int turnCount, int sayCount, int turnNeckCount,
                              int catchCount, int moveCount, int changeViewCount);

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
     * The player is informed when the player type message is received.
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
     * The player is informed when the player param message is received.
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
}
