package sample;

import org.apache.log4j.Logger;

import atan.model.Controller;
import atan.model.Player;

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

    public void infoSeeLine(int id, double dist, double dir) {
        if (dist < minDistLine)
            minDistLine = dist;
    }

    public void infoSeeBall(double dist, double dir) {
        distBall = dist;
    }

    public void infoHearPlayMode(int playMode) {
        if (playMode == Controller.PLAY_MODE_BEFORE_KICK_OFF)
            getPlayer().move(-30, 30);
    }

    public void infoHearReferee(int parm1) {
    }

    public void infoHear(double parm1, String parm2) {
    }

    public void infoSenseBody(int parm1, int parm2, double parm3, double parm4, double parm5, int parm6, int parm7,
            int parm8, int parm9, int parm10) {
    }

    public void infoSeeFlagRight(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagLeft(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagOwn(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagOther(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagCenter(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagCornerOwn(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagCornerOther(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagPenaltyOwn(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagPenaltyOther(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagGoalOwn(int parm1, double parm2, double parm3) {
    }

    public void infoSeeFlagGoalOther(int parm1, double parm2, double parm3) {
    }

    public void infoSeePlayerOther(int parm1, double parm2, double parm3) {
    }

    public void infoSeePlayerOwn(int parm1, double parm2, double parm3) {
    }
}
