package atan.model;

/**
 * An enum for errors.
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
     * The object passed to the server is in aninvalid form.
     */
    ILLEGAL_OBJECT_FORM,

    /**
     * The server cannot connect any more teams or players. (usually not used, NO_MORE_TEAM_OR_PLAYER_OR_GOALIE instead)
     */
    NO_MORE_TEAM_OR_PLAYER,

    /**
     * The server cannot connect any more teams or players or goalies.
     */
    NO_MORE_TEAM_OR_PLAYER_OR_GOALIE,

    /**
     * Error reconnecting to the server.
     */
    RECONNECT,

    /**
     * The command sent to the server is completly unknown.
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
