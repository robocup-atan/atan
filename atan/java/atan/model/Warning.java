package atan.model;

/**
 * An enum for warnings.
 * @author Atan
 */
public enum Warning {

    /**
     * The team you tried to access doesn't exist.
     */
    NO_TEAM_FOUND,

    /**
     * The player you tried to access doesn't exist.
     */
    NO_SUCH_PLAYER,

    /**
     * Can now substitute a player whilst game mode is play on.
     */
    CANNOT_SUB_WHILE_PLAYON,

    /**
     * You have no substitutes left.
     */
    NO_SUBS_LEFT,

    /**
     * You already have the maximum type of that player on the field.
     */
    MAX_OF_THAT_TYPE_ON_FIELD,

    /**
     * You cannot substitute the goalie.
     */
    CANNOT_CHANGE_GOALIE;
}
