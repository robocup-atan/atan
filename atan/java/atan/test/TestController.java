package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Flag;
import atan.model.Line;
import atan.model.PlayMode;
import atan.model.Player;
import atan.model.RefereeMessage;
import atan.model.ViewAngle;
import atan.model.ViewQuality;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashSet;
import java.util.Set;

/**
 * Class description
 * @author Atan
 */
public class TestController implements Controller {
    private Set result = new HashSet();

    /**
     * Constructs ...
     */
    public TestController() {}

    /**
     * Method description
     */
    public void preInfo() {}

    /**
     * Method description
     */
    public void postInfo() {}

    /**
     * Method description
     * @return
     */
    Set getResult() {
        return result;
    }

    /**
     * Method description
     * @return
     */
    public Player getPlayer() {
        return new DummyPlayer();
    }

    /**
     * Method description
     * @param p
     */
    public void setPlayer(Player p) {}

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagRight(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagRight");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagLeft(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagLeft");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagOwn(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagOwn");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagOther(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagOther");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagCenter(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagCenter");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagCornerOwn(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagCornerOwn");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagCornerOther(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagCornerOther");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagPenaltyOwn(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagPenaltyOwn");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagPenaltyOther(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagPenaltyOther");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagGoalOwn(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagGoalOwn");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeFlagGoalOther(Flag id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagGoalOther");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param id
     * @param distance
     * @param direction
     */
    public void infoSeeLine(Line id, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeLine");
        b.append("|");
        b.append(id);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param number
     * @param distance
     * @param direction
     */
    public void infoSeePlayerOther(int number, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeePlayerOther");
        b.append("|");
        b.append(number);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param number
     * @param distance
     * @param direction
     */
    public void infoSeePlayerOwn(int number, double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeePlayerOwn");
        b.append("|");
        b.append(number);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param distance
     * @param direction
     */
    public void infoSeeBall(double distance, double direction) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeBall");
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param message
     */
    public void infoHearReferee(RefereeMessage message) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoHearReferee");
        b.append("|");
        b.append(message);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param message
     */
    public void infoHearPlayMode(PlayMode message) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoHearPlayMode");
        b.append("|");
        b.append(message);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param direction
     * @param message
     */
    public void infoHear(double direction, String message) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoHear");
        b.append("|");
        b.append(direction);
        b.append("|");
        b.append(message);
        result.add(b.toString());
    }

    /**
     * Method description
     * @param viewQual
     * @param viewAngle
     * @param stamina
     * @param speed
     * @param headAngle
     * @param kickCount
     * @param dashCount
     * @param turnCount
     * @param sayCount
     * @param turnNeckCount
     */
    public void infoSenseBody(ViewQuality viewQual, ViewAngle viewAngle, double stamina, double speed,
                              double headAngle, int kickCount, int dashCount, int turnCount, int sayCount,
                              int turnNeckCount) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSenseBody");
        b.append("|");
        b.append(viewQual);
        b.append("|");
        b.append(viewAngle);
        b.append("|");
        b.append(stamina);
        b.append("|");
        b.append(speed);
        b.append("|");
        b.append(headAngle);
        b.append("|");
        b.append(kickCount);
        b.append("|");
        b.append(dashCount);
        b.append("|");
        b.append(turnCount);
        b.append("|");
        b.append(sayCount);
        b.append("|");
        b.append(turnNeckCount);
        result.add(b.toString());
    }
}
