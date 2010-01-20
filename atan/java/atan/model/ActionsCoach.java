package atan.model;

/**
 * Interface for an abstract ActionsCoach. To be used by Controller.
 * @author Atan
 */
public interface ActionsCoach {

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
     * This command provides information about the names of both teams and which side they are playing on.
     */
    public void teamNames();

    /**
     * This is used to disconnect a coach from the server.
     * The server will not respond.
     */
    public void bye();

    /**
     * The method used to show errors.
     * @param error The error to show.
     */
    public void handleError(String error);

    /**
     * @return
     */
    public boolean isTeamEast();

    /**
     * @param is
     */
    public void isTeamEast(boolean is);
}
