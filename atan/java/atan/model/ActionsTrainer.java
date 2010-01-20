package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.PlayMode;

/**
 * Interface for an abstract ActionsTrainer. To be used by Controller.
 * @author Atan
 */
public interface ActionsTrainer {

    /**
     * Changes the play mode of the current game.
     * @param playMode
     */
    public void changePlayMode(PlayMode playMode);

    /**
     * Moves the given player to the given location.
     * @param p The player to move.
     * @param x The x coordinate.
     * @param y The y coordinate.
     */
    public void movePlayer(ActionsPlayer p, double x, double y);

    /**
     * Moves the ball to the given coordinates.
     * @param x The x coordinate.
     * @param y The y coordinate.
     */
    public void moveBall(double x, double y);

    /**
     * Checks the current status of the ball.
     */
    public void checkBall();

    /**
     * Starts the game.
     */
    public void startGame();

    /**
     * Recovers the players stamina, recovery, effort and hear capacity to the values at the beginning of the game.
     */
    public void recover();

    /**
     * Turns on or off the sending of auditory information to the trainer.
     */
    public void ear();

    /**
     * Turns on or off the sending of "(see_global ...)" information from the server.
     */
    public void eye();

    /**
     * This command provides information about the positions of the following objects on the field.
     * The left and right goals? (Do they move?)
     * The ball.
     * All active players.
     */
    public void look();

    /**
     * This command provedes information about the names of both teams and which side they are playing on.
     */
    public void teamNames();

    /**
     * This is used to disconnect a trainer from the server.
     * The server will not respond.
     */
    public void bye();

    /**
     * The method used to show errors.
     * @param error The error to show.
     */
    public void handleError(String error);
}
