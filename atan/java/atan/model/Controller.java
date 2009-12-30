package atan.model;

/**
 * Interface that has to be implemented in order to control players. The methods
 * are run in a cycle whenever a see command arrives from SServer. At first preInfo()
 * is invoked. then the info*() methods are called according to what kind of objects
 * are currently seen or what other commands where received from the server. At last
 * postInfo() is called. All objects are relative to the current side of the controller.
 *
 * @author Atan
 */
public interface Controller {

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
    public Player getPlayer();

    /**
     * Sets the player that the controller is controlling.
     * @param c ActionsPlayer.
     */
    public void setPlayer(Player c);

    /**
     * The controller is informed when one of the flags along the right touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     * @param flag possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, MID,
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagRight(Flag flag, double distance, double direction);

    /**
     * The controller is informed when one of the flags along the left touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     * @param flag possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, MID
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagLeft(Flag flag, double distance, double direction);

    /**
     * The controller is informed when one of the flags behind our teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     * @param flag possible values: LEFT_10, LEFT_20, LEFT_30, MID,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagOwn(Flag flag, double distance, double direction);

    /**
     * The controller is informed when one of the flags behind the other teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     * @param flag possible values: LEFT_10, LEFT_20, LEFT_30, MID,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagOther(Flag flag, double distance, double direction);

    /**
     * The controller is informed when one of the flags on the center line are
     * in sight.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagCenter(Flag flag, double distance, double direction);

    /**
     * The controller is informed that one of our teams corner flags is
     * in sight.
     * @param flag possible values: LEFT, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction);

    /**
     * The controller is informed that one of the other teams corner flags is
     * in sight.
     * @param flag possible values: LEFT, RIGHT
     * @param distance The disnance to the flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagCornerOther(Flag flag, double distance, double direction);

    /**
     * The controller is informed that one of our teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the center point between these corners.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     */
    public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction);

    /**
     * The controller is informed that one of the other teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the center point between these corners.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     */
    public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction);

    /**
     * The controller is informed that one of our teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distane to this flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction);

    /**
     * The controller is informed that one of the other teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     * @param flag possible values: LEFT, CENTER, RIGHT
     * @param distance The distane to this flag.
     * @param direction The direction of the flag.
     */
    public void infoSeeFlagGoalOther(Flag flag, double distance, double direction);

    /**
     * The controller is informed that one of the pitch lines are in sight.
     *
     * @param line
     * @param distance The distance to the line.
     * @param direction The direction of the line.
     */
    public void infoSeeLine(Line line, double distance, double direction);

    /**
     * The controller is informed that one of the other teams players is in sight.
     * @param number The ID of the player (from 1 to 11)
     * @param distance The distance to the player.
     * @param direction
     */
    public void infoSeePlayerOther(int number, double distance, double direction);

    /**
     * The controller is informed that one of it's own team is in sight.
     * @param number The ID of the player (from 1 to 11)
     * @param distance The distance to the player.
     * @param direction The direction of the player.
     */
    public void infoSeePlayerOwn(int number, double distance, double direction);

    /**
     * The controller is informed that the Ball is in sight.
     * @param distance The distance to the ball.
     * @param direction The direction of the ball.
     */
    public void infoSeeBall(double distance, double direction);

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
     * @param viewQuality possible values: HIGH, LOW
     * @param viewAngle possible values: NARROW, NORMAL, WIDE
     * @param stamina
     * @param speed
     * @param headAngle
     * @param kickCount
     * @param dashCount
     * @param turnCount
     * @param sayCount
     * @param turnNeckCount
     */
    public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina, double speed,
                              double headAngle, int kickCount, int dashCount, int turnCount, int sayCount,
                              int turnNeckCount);
}
