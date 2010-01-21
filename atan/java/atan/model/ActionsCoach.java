package atan.model;

/**
 * Interface for an abstract ActionsCoach. To be used by Controller.
 * @author Atan
 */
public interface ActionsCoach {

    /**
     * Turns on or off the sending of "(see_global ...)" information from the server.
     */
    public void eye();    // TODO Take an on/off parameter

    /**
     * This command provides information about the positions of the following objects on the field.
     * The left and right goals? (Do they move?)
     * The ball.
     * All active players.
     */
    public void look();

    /**
     * This command broadcasts the message throughout the field. Any player
     * near enough (specified with audio_cut_dist default 50.0 meters), with
     * enough hearing capacity will hear the message.
     * @param message A valid String to say.
     */
    public void say(String message);

    /**
     * This command changes a specified players type.
     * @param unum //TODO Implement
     * @param playerType //TODO Implement
     */
    public void changePlayerType(Object unum, Object playerType);

    /**
     * This command sends a team graphic to the SServer.
     * @param x The x coordinate of this tile.
     * @param y The y coordinate of this tile.
     * @param xpm
     */
    public void teamGraphic(int x, int y, Object xpm);    // TODO Implement this.

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
