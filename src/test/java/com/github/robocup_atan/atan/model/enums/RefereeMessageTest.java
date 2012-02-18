package com.github.robocup_atan.atan.model.enums;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.RefereeMessage;
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
public class RefereeMessageTest {

    /**
     *
     */
    public RefereeMessageTest() {}

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
     * Test of values method, of class RefereeMessage.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        RefereeMessage[] expResult = {
            RefereeMessage.HALF_TIME, RefereeMessage.TIME_UP, RefereeMessage.TIME_UP_WITHOUT_A_TEAM,
            RefereeMessage.TIME_EXTENDED, RefereeMessage.DROP_BALL, RefereeMessage.OFFSIDE_OWN,
            RefereeMessage.OFFSIDE_OTHER, RefereeMessage.FOUL_OWN, RefereeMessage.FOUL_OTHER, RefereeMessage.OFFSIDE_R,
            RefereeMessage.OFFSIDE_L, RefereeMessage.FOUL_R, RefereeMessage.FOUL_L
        };
        RefereeMessage[] result = RefereeMessage.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class RefereeMessage.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String         name      = "TIME_EXTENDED";
        RefereeMessage expResult = RefereeMessage.TIME_EXTENDED;
        RefereeMessage result    = RefereeMessage.valueOf(name);
        assertEquals(expResult, result);
        name      = "DROP_BALL";
        expResult = RefereeMessage.DROP_BALL;
        result    = RefereeMessage.valueOf(name);
        assertEquals(expResult, result);
        name      = "OFFSIDE_R";
        expResult = RefereeMessage.OFFSIDE_R;
        result    = RefereeMessage.valueOf(name);
        assertEquals(expResult, result);
        name      = "FOUL_R";
        expResult = RefereeMessage.FOUL_L;
        result    = RefereeMessage.valueOf(name);
        assertFalse(result.equals(expResult));
    }
}
