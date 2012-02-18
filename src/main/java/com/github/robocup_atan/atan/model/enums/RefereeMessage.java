package com.github.robocup_atan.atan.model.enums;

/**
 * An enum for referee messages.
 * @author Atan
 */
public enum RefereeMessage {

    /**
     * Half time.
     */
    HALF_TIME,

    /**
     * No more time remaining.
     */
    TIME_UP,

    /**
     * Second half elapsed with no opposition team present.
     */
    TIME_UP_WITHOUT_A_TEAM,

    /**
     * Extra time.
     */
    TIME_EXTENDED,

    /**
     * Ball was dropped somewhere.
     */
    DROP_BALL,

    /**
     * We were offside.
     */
    OFFSIDE_OWN,

    /**
     * They were offside.
     */
    OFFSIDE_OTHER,

    /**
     * We commited a foul.
     */
    FOUL_OWN,

    /**
     * They commited a foul.
     */
    FOUL_OTHER,

    // <editor-fold defaultstate="collapsed" desc="Raw data for trainer/coach">

    /**
     * Right team went offside.
     */
    OFFSIDE_R,

    /**
     * Left team went offside.
     */
    OFFSIDE_L,

    /**
     * Right team commited a foul.
     */
    FOUL_R,

    /**
     * Left team commited a foul.
     */
    FOUL_L;

    // </editor-fold>
}
