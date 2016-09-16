package com.github.robocup_atan.atan.model.enums;

/**
 * An enum for referee messages.
 *
 * @author Atan modified by @author Rene Kremer
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

    /**
     * Right team went offside.
     */
    OFFSIDE_R,

    /**
     * Left team went offside.
     */
    OFFSIDE_L,
    
    /**
     * Back Pass for the other side.
     */
    BACK_PASS_OTHER,
    /**
     * Back Pass for us.
     */
    BACK_PASS_OWN,
    /**
     * Foul Charge for the other team.
     */
    FOUL_CHARGE_OTHER,
    /**
     * Foul Charge for our own team.
     */
    FOUL_CHARGE_OWN,
    /**
     * Our goalie catched the ball.
     */
    GOAL_CATCH_OWN,
    /**
     * Their goalie catched the ball.
     */
    GOAL_CATCH_OTHER,

    /**
     * Right team commited a foul.
     */
    FOUL_R,

    /**
     * Left team commited a foul.
     */
    FOUL_L;
}
