package atan.model;

/**
 * An enum for PlayMode
 * @author Nick James
 */
public enum PlayMode {

    /**
     * The mode of a game before it starts.
     */
    BEFORE_KICK_OFF,

    /**
     * The time has finished.
     */
    TIME_OVER,

    /**
     * The default play mode.
     */
    PLAY_ON,

    /**
     * We get kick off!
     */
    KICK_OFF_OWN,

    /**
     * They get kick off.
     */
    KICK_OFF_OTHER,

    /**
     * We get a kick in.
     */
    KICK_IN_OWN,

    /**
     * They get a kick in.
     */
    KICK_IN_OTHER,

    /**
     * We get a free kick.
     */
    FREE_KICK_OWN,

    /**
     * They get a free kick.
     */
    FREE_KICK_OTHER,

    /**
     * We commited a free kick fault.
     */
    FREE_KICK_FAULT_OWN,

    /**
     * They commited a free kick fault.
     */
    FREE_KICK_FAULT_OTHER,

    /**
     * We get a corner kick.
     */
    CORNER_KICK_OWN,

    /**
     * They get a corner kick.
     */
    CORNER_KICK_OTHER,

    /**
     * We get a goal kick.
     */
    GOAL_KICK_OWN,

    /**
     * They get a goal kick.
     */
    GOAL_KICK_OTHER,

    /**
     * We scored!
     */
    GOAL_OWN,

    /**
     * They scored = (
     */
    GOAL_OTHER,

    // <editor-fold defaultstate="collapsed" desc="Raw data for trainer/coach">

    /**
     *
     */
    KICK_OFF_L,

    /**
     *
     */
    KICK_OFF_R,

    /**
     *
     */
    KICK_IN_L,

    /**
     *
     */
    KICK_IN_R,

    /**
     *
     */
    FREE_KICK_R,

    /**
     *
     */
    FREE_KICK_L,

    /**
     *
     */
    FREE_KICK_FAULT_L,

    /**
     *
     */
    FREE_KICK_FAULT_R,

    /**
     *
     */
    CORNER_KICK_R,

    /**
     *
     */
    CORNER_KICK_L,

    /**
     *
     */
    GOAL_KICK_R,

    /**
     *
     */
    GOAL_KICK_L,

    /**
     *
     */
    GOAL_R,

    /**
     *
     */
    GOAL_L;

    // </editor-fold>
}
