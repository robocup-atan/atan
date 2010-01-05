package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Flag;
import atan.model.Line;
import atan.model.PlayMode;
import atan.model.Player;
import atan.model.RefereeMessage;
import atan.model.ViewAngle;
import atan.model.ViewQuality;

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.util.Random;

/**
 * A simple testcontroller. It implements the following simple behaviour. If the
 * client sees nothing (it might be out of the field) it turns 180 degree. If
 * the client sees the own goal and the distance is less than 40 and greater
 * than 10 it turns to his own goal and dashes. If it cannot see the own goal
 * but can see the ball it turns to the ball and dashes. If it sees anything but
 * not the ball or the own goals it dashes a little bit and turns a fixed amount
 * of degree to the right.
 */
public class Simple implements Controller {
    private static int    count         = 0;
    private static Logger log           = Logger.getLogger(Simple.class);
    private int           logcount      = 0;
    private Random        random        = null;
    private boolean       canSeeOwnGoal = false;
    private boolean       canSeeNothing = true;
    private boolean       canSeeBall    = false;
    private double        directionBall;
    private double        directionOwnGoal;
    private double        distanceBall;
    private double        distanceOwnGoal;
    private Player        player;

    /**
     * Constructs a new simple client.
     */
    public Simple() {
        random = new Random(System.currentTimeMillis() + count);
        count++;
    }

    /**
     * Returns the current instance of Player.
     * @return Player.
     */
    @Override
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the player that the controller is controlling.
     * @param p Player.
     */
    @Override
    public void setPlayer(Player p) {
        player = p;
    }

    /**
     * This is the method called before the controller receives all the new visual
     * information, to reset the state of the controller.
     */
    @Override
    public void preInfo() {
        canSeeOwnGoal = false;
        canSeeBall    = false;
        canSeeNothing = true;
    }

    /**
     * This is the method called one all the visual information has been processed.
     */
    @Override
    public void postInfo() {
        if (canSeeNothing) {
            canSeeNothingAction();
        } else if (canSeeOwnGoal) {
            if ((distanceOwnGoal < 40) && (distanceOwnGoal > 10)) {
                canSeeOwnGoalAction();
            } else if (canSeeBall) {
                canSeeBallAction();
            } else {
                canSeeAnythingAction();
            }
        } else if (canSeeBall) {
            canSeeBallAction();
        } else {
            canSeeAnythingAction();
        }
    }

    /**
     * This is the action performed when the player can see the ball.
     * It involves running at it and kicking it...
     */
    private void canSeeBallAction() {
        getPlayer().dash(this.randomDashValueFast());
        turnTowardBall();
        if (distanceBall < 0.7) {
            getPlayer().kick(50, randomKickDirectionValue());
        }
        if (log.isDebugEnabled()) {
            log.debug("b(" + directionBall + "," + distanceBall + ")");
        }
    }

    /**
     * If the player can see anything that is not a ball or a goal, it turns.
     */
    private void canSeeAnythingAction() {
        getPlayer().dash(this.randomDashValueSlow());
        getPlayer().turn(20);
        if (log.isDebugEnabled()) {
            log.debug("a");
        }
    }

    /**
     * If the player can see nothing, it turns 180 degrees.
     */
    private void canSeeNothingAction() {
        getPlayer().turn(180);
        if (log.isDebugEnabled()) {
            log.debug("n");
        }
    }

    /**
     * If the player can see its own goal, it goes and stands by it...
     */
    private void canSeeOwnGoalAction() {
        getPlayer().dash(this.randomDashValueFast());
        turnTowardOwnGoal();
        if (log.isDebugEnabled()) {
            log.debug("g(" + directionOwnGoal + "," + distanceOwnGoal + ")");
        }
    }

    /**
     * The controller is informed when one of the flags along the right touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     * @param id possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, MID,
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagRight(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed when one of the flags along the left touchline
     * is in sight. The flags are positioned 5m behind the touchline.
     * @param id possible values: OWN_50, OWN_40, OWN_30, OWN_20, OWN_10, MID
     * OTHER_10, OTHER_20, OTHER_30, OTHER_40, OTHER_50
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagLeft(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed when one of the flags behind our teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     * @param id possible values: LEFT_10, LEFT_20, LEFT_30, MID,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagOwn(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed when one of the flags behind the other teams
     * goal is in sight. These flags are positioned 5m behind the goal line.
     * @param id possible values: LEFT_10, LEFT_20, LEFT_30, MID,
     * RIGHT_10, RIGHT_20, RIGHT_30
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagOther(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed when one of the flags on the center line are
     * in sight.
     * @param id possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagCenter(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed that one of our teams corner flags is
     * in sight.
     * @param id possible values: LEFT, RIGHT
     * @param distance The distance to the flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagCornerOwn(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed that one of the other teams corner flags is
     * in sight.
     * @param id possible values: LEFT, RIGHT
     * @param distance The disnance to the flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagCornerOther(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed that one of our teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the center point between these corners.
     * @param id possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     */
    @Override
    public void infoSeeFlagPenaltyOwn(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed that one of the other teams penalty box
     * flags is in sight. The flags map the outer most corners of the penalty
     * box and the center point between these corners.
     * @param id possible values: LEFT, CENTER, RIGHT
     * @param distance The distance to this flag.
     * @param direction The direction of this flag.
     */
    @Override
    public void infoSeeFlagPenaltyOther(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed that one of our teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     * @param id possible values: LEFT, CENTER, RIGHT
     * @param distance The distane to this flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagGoalOwn(Flag id, double distance, double direction) {
        canSeeNothing = false;
        if (id == Flag.CENTER) {
            this.canSeeOwnGoal    = true;
            this.distanceOwnGoal  = distance;
            this.directionOwnGoal = direction;
        }
    }

    /**
     * The controller is informed that one of the other teams goal flags
     * is in sight. The flags map the posts of the goal and the center
     * of the goal.
     * @param id possible values: LEFT, CENTER, RIGHT
     * @param distance The distane to this flag.
     * @param direction The direction of the flag.
     */
    @Override
    public void infoSeeFlagGoalOther(Flag id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed that one of the pitch lines are in sight.
     * @param id
     * @param distance The distance to the line.
     * @param direction The direction of the line.
     */
    @Override
    public void infoSeeLine(Line id, double distance, double direction) {
        canSeeNothing = false;
    }

    /**
     * The controller is informed that one of the other teams players is in sight.
     * @param number The ID of the player (from 1 to 11)
     * @param distance The distance to the player.
     * @param direction
     */
    @Override
    public void infoSeePlayerOther(int number, double distance, double direction) {}

    /**
     * The controller is informed that one of it's own team is in sight.
     * @param number The ID of the player (from 1 to 11)
     * @param distance The distance to the player.
     * @param direction The direction of the player.
     */
    @Override
    public void infoSeePlayerOwn(int number, double distance, double direction) {}

    /**
     * The controller is informed that the Ball is in sight.
     * @param distance The distance to the ball.
     * @param direction The direction of the ball.
     */
    @Override
    public void infoSeeBall(double distance, double direction) {
        canSeeNothing      = false;
        this.canSeeBall    = true;
        this.distanceBall  = distance;
        this.directionBall = direction;
    }

    /**
     * The controller is informed when a referee message is broadcast.
     * @param refereeMessage possible values: FOUL_OWN, FOUL_OTHER,
     * HALF_TIME, TIME_UP, TIME_UP_WITHOUT_A_TEAM,
     * TIME_EXTENDED, DROP_BALL, OFFSIDE_OWN, OFFSIDE_OTHER
     */
    @Override
    public void infoHearReferee(RefereeMessage refereeMessage) {}

    /**
     * The controller is informed when a play mode message is broadcast.
     * @param playMode possible values: BEFORE_KICK_OFF, TIME_OVER, PLAY_ON,
     * KICK_OFF_OWN, KICK_OFF_OTHER, FREE_KICK_OWN,
     * FREE_KICK_OTHER, GOAL_KICK_OWN, CORNER_KICK_OTHER,
     * GOAL_KICK_OWN, GOAL_KICK_OTHER, GOAL_OWN, GOAL_OTHER
     */
    @Override
    public void infoHearPlayMode(PlayMode playMode) {
        if (playMode == PlayMode.BEFORE_KICK_OFF) {
            this.pause(1000);
            switch (this.getPlayer().getNumber()) {
                case 1 :
                    this.getPlayer().move(-10, 0);
                    break;
                case 2 :
                    this.getPlayer().move(-10, 10);
                    break;
                case 3 :
                    this.getPlayer().move(-10, -10);
                    break;
                case 4 :
                    this.getPlayer().move(-20, 0);
                    break;
                case 5 :
                    this.getPlayer().move(-20, 10);
                    break;
                case 6 :
                    this.getPlayer().move(-20, -10);
                    break;
                case 7 :
                    this.getPlayer().move(-20, 20);
                    break;
                case 8 :
                    this.getPlayer().move(-20, -20);
                    break;
                case 9 :
                    this.getPlayer().move(-30, 0);
                    break;
                case 10 :
                    this.getPlayer().move(-40, 10);
                    break;
                case 11 :
                    this.getPlayer().move(-40, -10);
                    break;
                default :
                    throw new Error("number must be initialized before move");
            }
        }
    }

    /**
     * The controller is informed when it hears a message from another player.
     * @param direction The direction from which the message originated.
     * @param message The actual message said.
     */
    @Override
    public void infoHearPlayer(double direction, String message) {}

    /**
     * The controller is updated as to the current information about the player it controls.
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
    @Override
    public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina, double speed,
                              double headAngle, int kickCount, int dashCount, int turnCount, int sayCount,
                              int turnNeckCount) {}

    /**
     * Randomly choose a fast dash value.
     * @return
     */
    private int randomDashValueFast() {
        return 30 + (int) (random.nextDouble() * 100.0);
    }

    /**
     * Randomly choose a slow dash value.
     * @return
     */
    private int randomDashValueSlow() {
        return -10 + (int) (random.nextDouble() * 50.0);
    }

    /**
     * Turn towards the ball.
     */
    private void turnTowardBall() {
        getPlayer().turn(directionBall);
    }

    /**
     * Turn towards our goal.
     */
    private void turnTowardOwnGoal() {
        getPlayer().turn(directionOwnGoal);
    }

    /**
     * Randomly choose a kick direction.
     * @return
     */
    private int randomKickDirectionValue() {
        return -45 + (int) (random.nextDouble() * 90.0);
    }

    /**
     * Method description
     * @param ms
     */
    private synchronized void pause(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {}
    }
}
