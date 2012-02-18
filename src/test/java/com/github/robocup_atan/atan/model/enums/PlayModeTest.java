package com.github.robocup_atan.atan.model.enums;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.PlayMode;
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
public class PlayModeTest {

    /**
     *
     */
    public PlayModeTest() {}

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
     * Test of values method, of class PlayMode.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        PlayMode[] expResult = {
            PlayMode.BEFORE_KICK_OFF, PlayMode.TIME_OVER, PlayMode.PLAY_ON, PlayMode.KICK_OFF_OWN,
            PlayMode.KICK_OFF_OTHER, PlayMode.KICK_IN_OWN, PlayMode.KICK_IN_OTHER, PlayMode.FREE_KICK_OWN,
            PlayMode.FREE_KICK_OTHER, PlayMode.FREE_KICK_FAULT_OWN, PlayMode.FREE_KICK_FAULT_OTHER,
            PlayMode.CORNER_KICK_OWN, PlayMode.CORNER_KICK_OTHER, PlayMode.GOAL_KICK_OWN, PlayMode.GOAL_KICK_OTHER,
            PlayMode.GOAL_OWN, PlayMode.GOAL_OTHER, PlayMode.KICK_OFF_L, PlayMode.KICK_OFF_R, PlayMode.KICK_IN_L,
            PlayMode.KICK_IN_R, PlayMode.FREE_KICK_R, PlayMode.FREE_KICK_L, PlayMode.FREE_KICK_FAULT_L,
            PlayMode.FREE_KICK_FAULT_R, PlayMode.CORNER_KICK_R, PlayMode.CORNER_KICK_L, PlayMode.GOAL_KICK_R,
            PlayMode.GOAL_KICK_L, PlayMode.GOAL_R, PlayMode.GOAL_L
        };
        PlayMode[] result = PlayMode.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class PlayMode.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String   name      = "FREE_KICK_R";
        PlayMode expResult = PlayMode.FREE_KICK_R;
        PlayMode result    = PlayMode.valueOf(name);
        assertEquals(expResult, result);
        System.out.println("valueOf");
        name      = "TIME_OVER";
        expResult = PlayMode.TIME_OVER;
        result    = PlayMode.valueOf(name);
        assertEquals(expResult, result);
        System.out.println("valueOf");
        name      = "GOAL_OTHER";
        expResult = PlayMode.GOAL_OTHER;
        result    = PlayMode.valueOf(name);
    }
}
