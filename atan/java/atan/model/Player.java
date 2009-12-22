package atan.model;

/**
 * Interface for an abstract soccer player. To be used by Controller.
 */
public interface Player {

    /**
     * Method description
     * @param power
     */
    public void dash(int power);

    /**
     * Method description
     * @param x
     * @param y
     */
    public void move(int x, int y);

    /**
     * Method description
     * @param power
     * @param direction
     */
    public void kick(int power, double direction);

    /**
     * Method description
     * @param message
     */
    public void say(String message);

    /**
     * Method description
     */
    public void senseBody();

    /**
     * Method description
     * @param angle
     */
    public void turn(double angle);

    /**
     * Method description
     * @param angle
     */
    public void turnNeck(double angle);

    /**
     * Method description
     * @param direction
     */
    public void catchBall(double direction);

    /**
     * Method description
     * @param quality
     * @param angle
     */
    public void changeViewMode(ViewQuality quality, ViewAngle angle);

    /**
     * Method description
     */
    public void bye();

    /**
     * Method description
     * @param error
     */
    public void handleError(String error);

    /**
     * Method description
     * @return
     */
    public String getTeamName();

    /**
     * Method description
     * @return
     */
    public boolean isTeamEast();

    /**
     * Method description
     * @param is
     */
    public void setTeamEast(boolean is);

    /**
     * Method description
     * @param num
     */
    public void setNumber(int num);

    /**
     * Method description
     * @return
     */
    public int getNumber();
}
