package com.github.robocup_atan.atan.model.enums;

/**
 * An enum for errors.
 *
 * @author Atan
 */
public enum Errors {

    /**
     * Tried setting the game mode to an invalid mode.
     */
    ILLEGAL_MODE,

    /**
     * The command sent to the server is in an invalid form.
     */
    ILLEGAL_COMMAND_FORM,

    /**
     * The object passed to the server is in an invalid form.
     */
    ILLEGAL_OBJECT_FORM,

    /**
     * The server cannot connect any more teams or players. (usually not used, NO_MORE_TEAM_OR_PLAYER_OR_GOALIE instead)
     */
    NO_MORE_TEAM_OR_PLAYER,

    /**
     * The server cannot connect any more teams or players or goalie's.
     */
    NO_MORE_TEAM_OR_PLAYER_OR_GOALIE,

    /**
     * The server cannot connect any more players or goalie's.
     * Or an illegal client version was sent to SServer.
     */
    NO_MORE_PLAYER_OR_GOALIE_OR_ILLEGAL_CLIENT_VERSION,

    /**
     * Error reconnecting to the server.
     */
    RECONNECT,

    /**
     * The command sent to the server is completely unknown.
     */
    UNKNOWN_COMMAND,

    /**
     * We tried to perform too many moves in one turn.
     */
    TOO_MANY_MOVES,

    /**
     * We have said too many things, wait to say again.
     */
    SAID_TOO_MANY_MESSAGES;
}
