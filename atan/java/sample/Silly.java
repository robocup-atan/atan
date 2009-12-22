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

/**
 * Class description
 * @author Atan
 */
public class Silly implements Controller {
    private static Logger log         = Logger.getLogger(Silly.class);
    private double        distBall    = 1000;
    private double        minDistLine = 1000;
    private Player        player;

    /**
     * Method description
     */
    public void preInfo() {
        distBall    = 1000;
        minDistLine = 1000;
    }

    /**
     * Method description
     */
    public void postInfo() {
        if (distBall < 10) {
            getPlayer().turn(10.0);
            getPlayer().dash(5);
        } else if (minDistLine < 10) {
            getPlayer().turn(-90.0);
        } else {
            getPlayer().dash(50);
        }
        log.info("I am a silly Client");
    }

    /**
     * Method description
     * @return
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Method description
     * @param p
     */
    public void setPlayer(Player p) {
        player = p;
    }

    /**
     * Method description
     * @param id
     * @param dist
     * @param dir
     */
    public void infoSeeLine(Line id, double dist, double dir) {
        if (dist < minDistLine) {
            minDistLine = dist;
        }
    }

    /**
     * Method description
     * @param dist
     * @param dir
     */
    public void infoSeeBall(double dist, double dir) {
        distBall = dist;
    }

    /**
     * Method description
     * @param playMode
     */
    public void infoHearPlayMode(PlayMode playMode) {
        if (playMode == PlayMode.BEFORE_KICK_OFF) {
            getPlayer().move(-30, 30);
        }
    }

    /**
     * Method description
     * @param msg
     */
    public void infoHearReferee(RefereeMessage msg) {}

    /**
     * Method description
     * @param parm1
     * @param parm2
     */
    public void infoHear(double parm1, String parm2) {}

    /**
     * Method description
     * @param parm1
     * @param parm2
     * @param parm3
     * @param parm4
     * @param parm5
     * @param parm6
     * @param parm7
     * @param parm8
     * @param parm9
     * @param parm10
     */
    public void infoSenseBody(ViewQuality parm1, ViewAngle parm2, double parm3, double parm4, double parm5, int parm6,
                              int parm7, int parm8, int parm9, int parm10) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagRight(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagLeft(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagOwn(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagOther(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagCenter(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagCornerOther(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param flag
     * @param distance
     * @param direction
     */
    public void infoSeeFlagGoalOther(Flag flag, double distance, double direction) {}

    /**
     * Method description
     * @param num
     * @param distance
     * @param direction
     */
    public void infoSeePlayerOther(int num, double distance, double direction) {}

    /**
     * Method description
     * @param num
     * @param distance
     * @param direction
     */
    public void infoSeePlayerOwn(int num, double distance, double direction) {}
}
