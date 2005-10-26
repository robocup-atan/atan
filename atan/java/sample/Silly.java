package sample;

import org.apache.log4j.Logger;

import atan.model.Controller;
import atan.model.Flag;
import atan.model.Line;
import atan.model.PlayMode;
import atan.model.Player;
import atan.model.RefereeMessage;
import atan.model.ViewAngle;
import atan.model.ViewQuality;

public class Silly implements Controller {

	private static Logger log = Logger.getLogger(Silly.class);

	private double distBall = 1000;

	private double minDistLine = 1000;

	private Player player;

	public void preInfo() {
		distBall = 1000;
		minDistLine = 1000;
	}

	public void postInfo() {
		if (distBall < 10) {
			getPlayer().turn(10.0);
			getPlayer().dash(5);
		} else if (minDistLine < 10)
			getPlayer().turn(-90.0);
		else
			getPlayer().dash(50);
		log.info("I am a silly Client");
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player p) {
		player = p;
	}

	public void infoSeeLine(Line id, double dist, double dir) {
		if (dist < minDistLine)
			minDistLine = dist;
	}

	public void infoSeeBall(double dist, double dir) {
		distBall = dist;
	}

	public void infoHearPlayMode(PlayMode playMode) {
		if (playMode == PlayMode.BEFORE_KICK_OFF)
			getPlayer().move(-30, 30);
	}

	public void infoHearReferee(RefereeMessage msg) {
	}

	public void infoHear(double parm1, String parm2) {
	}

	public void infoSenseBody(ViewQuality parm1, ViewAngle parm2, double parm3, double parm4,
			double parm5, int parm6, int parm7, int parm8, int parm9, int parm10) {
	}

	public void infoSeeFlagRight(Flag flag, double distance, double direction) {
	}

	public void infoSeeFlagLeft(Flag flag, double distance, double direction) {
	}

	public void infoSeeFlagOwn(Flag flag, double distance, double direction) {
	}

	public void infoSeeFlagOther(Flag flag, double distance, double direction) {
	}

	public void infoSeeFlagCenter(Flag flag, double distance, double direction) {
	}

	public void infoSeeFlagCornerOwn(Flag flag, double distance,
			double direction) {
	}

	public void infoSeeFlagCornerOther(Flag flag, double distance,
			double direction) {
	}

	public void infoSeeFlagPenaltyOwn(Flag flag, double distance,
			double direction) {
	}

	public void infoSeeFlagPenaltyOther(Flag flag, double distance,
			double direction) {
	}

	public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction) {
	}

	public void infoSeeFlagGoalOther(Flag flag, double distance,
			double direction) {
	}

	public void infoSeePlayerOther(int num, double distance, double direction) {
	}

	public void infoSeePlayerOwn(int num, double distance, double direction) {
	}
}
