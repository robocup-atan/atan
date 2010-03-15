package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ActionsPlayer;
import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;

//~--- JDK imports ------------------------------------------------------------

import java.io.PrintWriter;

/**
 * A dummy implementation of ActionsPlayer that does noting by default.
 */
public class DummyPlayer implements ActionsPlayer {
    private StringBuffer buf        = new StringBuffer();
    private boolean      isTeamEast = true;
    private String       name       = "teamEast";
    private int          number;

    /**
     *
     */
    public DummyPlayer() {}

    /**
     *
     * @param direction
     */
    @Override
    public void catchBall(double direction) {}

    /**
     *
     * @param qal
     * @param angle
     */
    @Override
    public void changeViewMode(ViewQuality qal, ViewAngle angle) {}

    /**
     *
     * @param power
     */
    @Override
    public void dash(int power) {}

    /**
     *
     * @param x
     * @param y
     */
    @Override
    public void move(int x, int y) {}

    /**
     *
     * @param message
     */
    @Override
    public void say(String message) {}

    /**
     *
     */
    @Override
    public void senseBody() {}

    /**
     *
     * @param angle
     */
    @Override
    public void turn(double angle) {}

    /**
     *
     * @param angle
     */
    @Override
    public void turnNeck(double angle) {}

    /**
     *
     * @param error
     */
    @Override
    public void handleError(String error) {
        buf.append("|error");
        buf.append("|");
        buf.append(error);
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isTeamEast() {
        return isTeamEast;
    }

    /**
     *
     * @return
     */
    @Override
    public String getTeamName() {
        return name;
    }

    /**
     *
     * @param n
     */
    public void setTeamName(String n) {
        name = n;
    }

    /**
     *
     * @param isTeamEast
     */
    @Override
    public void setTeamEast(boolean isTeamEast) {
        this.isTeamEast = isTeamEast;
        buf.append("|isTeamEast");
        buf.append("|");
        if (isTeamEast) {
            buf.append("true");
        } else {
            buf.append("false");
        }
    }

    /**
     *
     * @return
     */
    public String getBuffer() {
        return buf.toString();
    }

    /**
     *
     */
    public void resetBuffer() {
        buf = new StringBuffer();
    }

    /**
     *
     * @param num
     */
    @Override
    public void setNumber(int num) {
        number = num;
    }

    /**
     *
     * @return
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     *
     */
    @Override
    public void bye() {}

    /**
     *
     * @param power
     * @param direction
     */
    @Override
    public void kick(int power, double direction) {}

    /**
     *
     * @return
     */
    public PrintWriter getLogger() {
        return new PrintWriter(System.out);
    }

    /**
     *
     * @return
     */
    public int getLoglevel() {
        return 0;
    }
}
