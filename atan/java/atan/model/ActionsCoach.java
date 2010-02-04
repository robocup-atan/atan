package atan.model;

/**
 * Interface for an abstract ActionsCoach. To be used by Controller.
 * @author Atan
 */
public interface ActionsCoach {

    /**
     * Turns on or off the sending of "(see_global ...)" information from the server.
     * @param eyeOn True to turn (see_global on, false to turn it off.
     */
    public void eye(boolean eyeOn);

    /**
     * This command provides information about the positions of the following objects on the field.
     * The left and right goals? (Do they move?)
     * The ball.
     * All active players.
     * This is the same data as from (see_global, but it is only received when look in invoked.
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
     * Each time a player is substituted by some other player type, its stamina,
     * recovery and effort is reset to the initial (maximum) value of the respective player type.
     * @param unum The players uniform number (1~11 on pitch usually, subs <= 14).
     * @param playerType A player type between 0 (the standard player) and 18. However, player.conf can change this.
     */
    public abstract void changePlayerType(int unum, int playerType);

    /**
     * This command sends a team graphic to the SServer.
     * @param x The x coordinate of this tile.
     * @param y The y coordinate of this tile.
     * @param xpm
     */
    public void teamGraphic(int x, int y, Object xpm);    // TODO Implement xpm image.

    /**
     * This command provides information about the names of both teams and which side they are playing on.
     */
    public void getTeamNames();

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
     * Is the coach with the east of west team?
     * @return True if east.
     */
    public boolean isTeamEast();

    /**
     * Sets the team as east or west.
     * @param is true if east.
     */
    public void setTeamEast(boolean is);

    /**
     * Returns the team name the coach is connected to.
     * @return The team name.
     */
    public String getTeamName();
}
