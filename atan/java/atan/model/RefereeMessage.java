package atan.model;

/**
 * An enum for referee messages.
 * @author Nick James
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
     *
     */
    OFFSIDE_R,

    /**
     *
     */
    OFFSIDE_L,

    /**
     *
     */
    FOUL_R,

    /**
     *
     */
    FOUL_L;

    // </editor-fold>
}
