package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Player;
import atan.model.ViewAngle;
import atan.model.ViewQuality;

//~--- JDK imports ------------------------------------------------------------

import java.io.PrintWriter;

/**
 * A dummy implementation of Player that does noting by default.
 */
public class DummyPlayer implements Player {
    private StringBuffer buf        = new StringBuffer();
    private boolean      isTeamEast = true;
    private String       name       = "teamEast";
    private int          number;

    /**
     * Constructs ...
     */
    public DummyPlayer() {}

    /**
     * Method description
     * @param direction
     */
    @Override
    public void catchBall(double direction) {}

    /**
     * Method description
     * @param qal
     * @param angle
     */
    @Override
    public void changeViewMode(ViewQuality qal, ViewAngle angle) {}

    /**
     * Method description
     * @param power
     */
    @Override
    public void dash(int power) {}

    /**
     * Method description
     * @param x
     * @param y
     */
    @Override
    public void move(int x, int y) {}

    /**
     * Method description
     * @param message
     */
    @Override
    public void say(String message) {}

    /**
     * Method description
     */
    @Override
    public void senseBody() {}

    /**
     * Method description
     * @param angle
     */
    @Override
    public void turn(double angle) {}

    /**
     * Method description
     * @param angle
     */
    @Override
    public void turnNeck(double angle) {}

    /**
     * Method description
     * @param error
     */
    @Override
    public void handleError(String error) {
        buf.append("|error");
        buf.append("|");
        buf.append(error);
    }

    /**
     * Method description
     * @return
     */
    @Override
    public boolean isTeamEast() {
        return isTeamEast;
    }

    /**
     * Method description
     * @return
     */
    @Override
    public String getTeamName() {
        return name;
    }

    /**
     * Method description
     * @param n
     */
    public void setTeamName(String n) {
        name = n;
    }

    /**
     * Method description
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
     * Method description
     * @return
     */
    public String getBuffer() {
        return buf.toString();
    }

    /**
     * Method description
     */
    public void resetBuffer() {
        buf = new StringBuffer();
    }

    /**
     * Method description
     * @param num
     */
    @Override
    public void setNumber(int num) {
        number = num;
    }

    /**
     * Method description
     * @return
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * Method description
     */
    @Override
    public void bye() {}

    /**
     * Method description
     * @param power
     * @param direction
     */
    @Override
    public void kick(int power, double direction) {}

    /**
     * Method description
     * @return
     */
    public PrintWriter getLogger() {
        return new PrintWriter(System.out);
    }

    /**
     * Method description
     * @return
     */
    public int getLoglevel() {
        return 0;
    }
}
