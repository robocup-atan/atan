package com.github.robocup_atan.atan.model.enums;

/**
 * An enum for warnings.
 *
 * @author Atan
 */
public enum Warning {

    /**
     * You cannot substitute the goalie.
     */
    CANNOT_CHANGE_GOALIE,

    /**
     * You cannot substitute the goalie during penalty shootouts.
     */
    CANNOT_CHANGE_GOALIE_WHILE_PENALTY_TAKEN,

    /**
     * You cannot substitute the goalie whilst game mode is play on.
     */
    CANNOT_CHANGE_GOALIE_WHILE_PLAYON,

    /**
     * Cannot say whilst game mode is play on.
     */
    CANNOT_SAY_WHILE_PLAYON,

    /**
     * Cannot substitute a player during penalty shootouts.
     */
    CANNOT_SUB_WHILE_PENALTY_SHOOTOUTS,

    /**
     * Cannot substitute a player whilst game mode is play on.
     */
    CANNOT_SUB_WHILE_PLAYON,

    /**
     * Compression isn't supported.
     */
    COMPRESSION_UNSUPPORTED,

    /**
     * The XPM tile location sent to the server was invalid.
     */
    INVALID_TILE_LOCATION,

    /**
     * The XPM tile size sent to the server was an invalid size.
     */
    INVALID_TILE_SIZE,

    /**
     * You already have the maximum type of that player on the field.
     */
    MAX_OF_THAT_TYPE_ON_FIELD,

    /**
     * The message you sent wasn't null terminated.
     */
    MESSAGE_NOT_NULL_TERMINATED,

    /**
     * There are no players of that type left.
     */
    NO_LEFT_OF_THAT_TYPE,

    /**
     * You have no substitutes left.
     */
    NO_SUBS_LEFT,

    /**
     * The player you tried to access doesn't exist.
     */
    NO_SUCH_PLAYER,

    /**
     * The team you tried to access doesn't exist.
     */
    NO_TEAM_FOUND,

    /**
     * This action can only be performed before kick off.
     */
    ONLY_BEFORE_KICK_OFF;
}
