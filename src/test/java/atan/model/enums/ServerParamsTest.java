package atan.model.enums;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Atan
 */
public class ServerParamsTest {

    /**
     *
     */
    public ServerParamsTest() {}

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     *
     */
    @Before
    public void setUp() {}

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of values method, of class ServerParams.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ServerParams[] expResult = {
            ServerParams.AUDIO_CUT_DIST, ServerParams.AUTO_MODE, ServerParams.BACK_DASH_RATE, ServerParams.BACK_PASSES,
            ServerParams.BALL_ACCEL_MAX, ServerParams.BALL_DECAY, ServerParams.BALL_RAND, ServerParams.BALL_SIZE,
            ServerParams.BALL_SPEED_MAX, ServerParams.BALL_STUCK_AREA, ServerParams.BALL_WEIGHT,
            ServerParams.CATCH_BAN_CYCLE, ServerParams.CATCH_PROBABILITY, ServerParams.CATCHABLE_AREA_L,
            ServerParams.CATCHABLE_AREA_W, ServerParams.CKICK_MARGIN, ServerParams.CLANG_ADVICE_WIN,
            ServerParams.CLANG_DEFINE_WIN, ServerParams.CLANG_DEL_WIN, ServerParams.CLANG_INFO_WIN,
            ServerParams.CLANG_MESS_DELAY, ServerParams.CLANG_MESS_PER_CYCLE, ServerParams.CLANG_META_WIN,
            ServerParams.CLANG_RULE_WIN, ServerParams.CLANG_WIN_SIZE, ServerParams.COACH, ServerParams.COACH_PORT,
            ServerParams.COACH_W_REFEREE, ServerParams.CONNECT_WAIT, ServerParams.CONTROL_RADIUS,
            ServerParams.DASH_ANGLE_STEP, ServerParams.DASH_POWER_RATE, ServerParams.DROP_BALL_TIME,
            ServerParams.EFFORT_DEC, ServerParams.EFFORT_DEC_THR, ServerParams.EFFORT_INC, ServerParams.EFFORT_INC_THR,
            ServerParams.EFFORT_INIT, ServerParams.EFFORT_MIN, ServerParams.EXTRA_HALF_TIME, ServerParams.EXTRA_STAMINA,
            ServerParams.FORBID_KICK_OFF_OFFSIDE, ServerParams.FREE_KICK_FAULTS, ServerParams.FREEFORM_SEND_PERIOD,
            ServerParams.FREEFORM_WAIT_PERIOD, ServerParams.FULLSTATE_L, ServerParams.FULLSTATE_R,
            ServerParams.GAME_LOG_COMPRESSION, ServerParams.GAME_LOG_DATED, ServerParams.GAME_LOG_DIR,
            ServerParams.GAME_LOG_FIXED, ServerParams.GAME_LOG_FIXED_NAME, ServerParams.GAME_LOG_VERSION,
            ServerParams.GAME_LOGGING, ServerParams.GAME_OVER_WAIT, ServerParams.GOAL_WIDTH,
            ServerParams.GOALIE_MAX_MOVES, ServerParams.HALF_TIME, ServerParams.HEAR_DECAY, ServerParams.HEAR_INC,
            ServerParams.HEAR_MAX, ServerParams.INERTIA_MOMENT, ServerParams.KEEPAWAY, ServerParams.KEEPAWAY_LENGTH,
            ServerParams.KEEPAWAY_LOG_DATED, ServerParams.KEEPAWAY_LOG_DIR, ServerParams.KEEPAWAY_LOG_FIXED,
            ServerParams.KEEPAWAY_LOG_FIXED_NAME, ServerParams.KEEPAWAY_LOGGING, ServerParams.KEEPAWAY_START,
            ServerParams.KEEPAWAY_WIDTH, ServerParams.KICK_OFF_WAIT, ServerParams.KICK_POWER_RATE,
            ServerParams.KICK_RAND, ServerParams.KICK_RAND_FACTOR_L, ServerParams.KICK_RAND_FACTOR_R,
            ServerParams.KICKABLE_MARGIN, ServerParams.LANDMARK_FILE, ServerParams.LOG_DATE_FORMAT,
            ServerParams.LOG_TIMES, ServerParams.MAX_BACK_TACKLE_POWER, ServerParams.MAX_DASH_ANGLE,
            ServerParams.MAX_DASH_POWER, ServerParams.MAX_GOAL_KICKS, ServerParams.MAX_TACKLE_POWER,
            ServerParams.MAXMOMENT, ServerParams.MAXNECKANG, ServerParams.MAXNECKMOMENT, ServerParams.MAXPOWER,
            ServerParams.MIN_DASH_ANGLE, ServerParams.MIN_DASH_POWER, ServerParams.MINMOMENT, ServerParams.MINNECKANG,
            ServerParams.MINNECKMOMENT, ServerParams.MINPOWER, ServerParams.NR_EXTRA_HALFS,
            ServerParams.NR_NORMAL_HALFS, ServerParams.OFFSIDE_ACTIVE_AREA_SIZE, ServerParams.OFFSIDE_KICK_MARGIN,
            ServerParams.OLCOACH_PORT, ServerParams.OLD_COACH_HEAR, ServerParams.PEN_ALLOW_MULT_KICKS,
            ServerParams.PEN_BEFORE_SETUP_WAIT, ServerParams.PEN_COACH_MOVES_PLAYERS, ServerParams.PEN_DIST_X,
            ServerParams.PEN_MAX_EXTRA_KICKS, ServerParams.PEN_MAX_GOALIE_DIST_X, ServerParams.PEN_NR_KICKS,
            ServerParams.PEN_RANDOM_WINNER, ServerParams.PEN_READY_WAIT, ServerParams.PEN_SETUP_WAIT,
            ServerParams.PEN_TAKEN_WAIT, ServerParams.PENALTY_SHOOT_OUTS, ServerParams.PLAYER_ACCEL_MAX,
            ServerParams.PLAYER_DECAY, ServerParams.PLAYER_RAND, ServerParams.PLAYER_SIZE,
            ServerParams.PLAYER_SPEED_MAX, ServerParams.PLAYER_SPEED_MAX_MIN, ServerParams.PLAYER_WEIGHT,
            ServerParams.POINT_TO_BAN, ServerParams.POINT_TO_DURATION, ServerParams.PORT, ServerParams.PRAND_FACTOR_L,
            ServerParams.PRAND_FACTOR_R, ServerParams.PROFILE, ServerParams.PROPER_GOAL_KICKS,
            ServerParams.QUANTIZE_STEP, ServerParams.QUANTIZE_STEP_L, ServerParams.RECORD_MESSAGES,
            ServerParams.RECOVER_DEC, ServerParams.RECOVER_DEC_THR, ServerParams.RECOVER_INIT, ServerParams.RECOVER_MIN,
            ServerParams.RECV_STEP, ServerParams.SAY_COACH_CNT_MAX, ServerParams.SAY_COACH_MSG_SIZE,
            ServerParams.SAY_MSG_SIZE, ServerParams.SEND_COMMS, ServerParams.SEND_STEP, ServerParams.SEND_VI_STEP,
            ServerParams.SENSE_BODY_STEP, ServerParams.SIDE_DASH_RATE, ServerParams.SIMULATOR_STEP,
            ServerParams.SLOW_DOWN_FACTOR, ServerParams.SLOWNESS_ON_TOP_FOR_LEFT_TEAM,
            ServerParams.SLOWNESS_ON_TOP_FOR_RIGHT_TEAM, ServerParams.STAMINA_CAPACITY, ServerParams.STAMINA_INC_MAX,
            ServerParams.STAMINA_MAX, ServerParams.START_GOAL_L, ServerParams.START_GOAL_R,
            ServerParams.STOPPED_BALL_VEL, ServerParams.SYNCH_MICRO_SLEEP, ServerParams.SYNCH_MODE,
            ServerParams.SYNCH_OFFSET, ServerParams.SYNCH_SEE_OFFSET, ServerParams.TACKLE_BACK_DIST,
            ServerParams.TACKLE_CYCLES, ServerParams.TACKLE_DIST, ServerParams.TACKLE_EXPONENT,
            ServerParams.TACKLE_POWER_RATE, ServerParams.TACKLE_WIDTH, ServerParams.TEAM_ACTUATOR_NOISE,
            ServerParams.TEAM_L_START, ServerParams.TEAM_R_START, ServerParams.TEXT_LOG_COMPRESSION,
            ServerParams.TEXT_LOG_DATED, ServerParams.TEXT_LOG_DIR, ServerParams.TEXT_LOG_FIXED,
            ServerParams.TEXT_LOG_FIXED_NAME, ServerParams.TEXT_LOGGING, ServerParams.USE_OFFSIDE, ServerParams.VERBOSE,
            ServerParams.VISIBLE_ANGLE, ServerParams.VISIBLE_DISTANCE, ServerParams.WIND_ANG, ServerParams.WIND_DIR,
            ServerParams.WIND_FORCE, ServerParams.WIND_NONE, ServerParams.WIND_RAND, ServerParams.WIND_RANDOM
        };
        ServerParams[] result = ServerParams.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class ServerParams.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String       name      = "BACK_PASSES";
        ServerParams expResult = ServerParams.BACK_PASSES;
        ServerParams result    = ServerParams.valueOf(name);
        assertEquals(expResult, result);
        name      = "CATCH_PROBABILITY";
        expResult = ServerParams.CATCH_PROBABILITY;
        result    = ServerParams.valueOf(name);
        assertEquals(expResult, result);
        name      = "PEN_NR_KICKS";
        expResult = ServerParams.PEN_NR_KICKS;
        result    = ServerParams.valueOf(name);
        assertEquals(expResult, result);
        name      = "PRAND_FACTOR_L";
        expResult = ServerParams.PRAND_FACTOR_R;
        result    = ServerParams.valueOf(name);
        assertFalse(result.equals(expResult));
    }
}
