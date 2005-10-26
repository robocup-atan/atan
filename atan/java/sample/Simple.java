package sample;

import java.util.Random;

import org.apache.log4j.Logger;

import atan.model.Controller;
import atan.model.Flag;
import atan.model.Line;
import atan.model.PlayMode;
import atan.model.Player;
import atan.model.RefereeMessage;
import atan.model.ViewAngle;
import atan.model.ViewQuality;

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

	private static Logger log = Logger.getLogger(Simple.class);

	private Random random = null;

	private static int count = 0;

	private boolean canSeeNothing = true;

	private boolean canSeeOwnGoal = false;

	private double distanceOwnGoal;

	private double directionOwnGoal;

	private boolean canSeeBall = false;

	private double distanceBall;

	private double directionBall;

	private Player player;

	private int logcount = 0;

	public Simple() {
		random = new Random(System.currentTimeMillis() + count);
		count++;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player p) {
		player = p;
	}

	/**
	 * Reset the state of the controller.
	 */
	public void preInfo() {
		canSeeOwnGoal = false;
		canSeeBall = false;
		canSeeNothing = true;
	}

	/**
	 * Controls the client by interpreting the state of the controller.
	 */
	public void postInfo() {
		if (canSeeNothing)
			canSeeNothingAction();
		else if (canSeeOwnGoal) {
			if ((distanceOwnGoal < 40) && (distanceOwnGoal > 10))
				canSeeOwnGoalAction();
			else if (canSeeBall)
				canSeeBallAction();
			else
				canSeeAnythingAction();
		} else if (canSeeBall)
			canSeeBallAction();
		else
			canSeeAnythingAction();
	}

	private void canSeeBallAction() {
		getPlayer().dash(this.randomDashValueFast());
		turnTowardBall();
		if (distanceBall < 0.7)
			getPlayer().kick(50, randomKickDirectionValue());
		if (log.isDebugEnabled()) {
			log.debug("b(" + directionBall + "," + distanceBall + ")");
		}
	}

	private void canSeeAnythingAction() {
		getPlayer().dash(this.randomDashValueSlow());
		getPlayer().turn(20);
		if (log.isDebugEnabled()) {
			log.debug("a");
		}
	}

	private void canSeeNothingAction() {
		getPlayer().turn(180);
		if (log.isDebugEnabled()) {
			log.debug("n");
		}
	}

	private void canSeeOwnGoalAction() {
		getPlayer().dash(this.randomDashValueFast());
		turnTowardOwnGoal();
		if (log.isDebugEnabled()) {
			log.debug("g(" + directionOwnGoal + "," + distanceOwnGoal + ")");
		}
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagRight(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagLeft(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagOwn(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagOther(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagCenter(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagCornerOther(Flag id, double distance,
			double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagCornerOwn(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagPenaltyOwn(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagPenaltyOther(Flag id, double distance,
			double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that the own goal is in sight and about its
	 * distance and direction. This information is stored in the controllers
	 * state to be interpreted in postInfo().
	 */
	public void infoSeeFlagGoalOwn(Flag id, double distance, double direction) {
		canSeeNothing = false;
		if (id == Flag.FLAG_CENTER) {
			this.canSeeOwnGoal = true;
			this.distanceOwnGoal = distance;
			this.directionOwnGoal = direction;
		}
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeFlagGoalOther(Flag id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeeLine(Line id, double distance, double direction) {
		canSeeNothing = false;
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeePlayerOther(int number, double distance, double direction) {
	}

	/**
	 * The controller is informed that any object is in sight.
	 */
	public void infoSeePlayerOwn(int number, double distance, double direction) {
	}

	/**
	 * The controller is informed that the ball is in sight and about its
	 * distance and direction. This information is stored in the controllers
	 * state to be interpreted in postInfo().
	 */
	public void infoSeeBall(double distance, double direction) {
		canSeeNothing = false;
		this.canSeeBall = true;
		this.distanceBall = distance;
		this.directionBall = direction;
	}

	public void infoHearReferee(RefereeMessage refereeMessage) {
	}

	/**
	 * If the controller hears that the server is in before kick off mode it
	 * moves to a position that depends on the clients nummber.
	 */
	public void infoHearPlayMode(PlayMode playMode) {
		if (playMode == PlayMode.BEFORE_KICK_OFF) {
			this.pause(1000);
			switch (this.getPlayer().getNumber()) {
			case 1:
				this.getPlayer().move(-10, 0);
				break;
			case 2:
				this.getPlayer().move(-10, 10);
				break;
			case 3:
				this.getPlayer().move(-10, -10);
				break;
			case 4:
				this.getPlayer().move(-20, 0);
				break;
			case 5:
				this.getPlayer().move(-20, 10);
				break;
			case 6:
				this.getPlayer().move(-20, -10);
				break;
			case 7:
				this.getPlayer().move(-20, 20);
				break;
			case 8:
				this.getPlayer().move(-20, -20);
				break;
			case 9:
				this.getPlayer().move(-30, 0);
				break;
			case 10:
				this.getPlayer().move(-40, 10);
				break;
			case 11:
				this.getPlayer().move(-40, -10);
				break;
			default:
				throw new Error("number must be initialized before move");
			}
		}
	}

	public void infoHear(double direction, String message) {
	}

	public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle,
			double stamina, double speed, double headAngle, int kickCount,
			int dashCount, int turnCount, int sayCount, int turnNeckCount) {
	}

	private int randomDashValueFast() {
		return 30 + (int) (random.nextDouble() * 100.0);
	}

	private int randomDashValueSlow() {
		return -10 + (int) (random.nextDouble() * 50.0);
	}

	private void turnTowardBall() {
		getPlayer().turn(directionBall);
	}

	private void turnTowardOwnGoal() {
		getPlayer().turn(directionOwnGoal);
	}

	private int randomKickDirectionValue() {
		return -45 + (int) (random.nextDouble() * 90.0);
	}

	private synchronized void pause(int ms) {
		try {
			this.wait(ms);
		} catch (InterruptedException ex) {
		}
	}
}