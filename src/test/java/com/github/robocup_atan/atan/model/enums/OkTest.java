package com.github.robocup_atan.atan.model.enums;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.Ok;
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
public class OkTest {

    /**
     *
     */
    public OkTest() {}

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
     * Test of values method, of class Ok.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Ok[] expResult = {
            Ok.MOVE, Ok.CHANGE_MODE, Ok.CHECK_BALL, Ok.START, Ok.RECOVER, Ok.EAR_ON, Ok.EAR_OFF, Ok.SAY,
            Ok.CHANGE_PLAYER_TYPE, Ok.LOOK, Ok.TEAM_NAMES, Ok.TEAM_GRAPHIC, Ok.EYE_ON, Ok.EYE_OFF
        };
        Ok[] result = Ok.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Ok.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name      = "START";
        Ok     expResult = Ok.START;
        Ok     result    = Ok.valueOf(name);
        assertEquals(expResult, result);
        name      = "EAR_OFF";
        expResult = Ok.EAR_OFF;
        result    = Ok.valueOf(name);
        assertEquals(expResult, result);
        name      = "EYE_ON";
        expResult = Ok.EYE_ON;
        result    = Ok.valueOf(name);
        assertEquals(expResult, result);
        name      = "TEAM_NAMES";
        expResult = Ok.TEAM_NAMES;
        result    = Ok.valueOf(name);
        assertEquals(expResult, result);
        name      = "EYE_OFF";
        expResult = Ok.EAR_OFF;
        result    = Ok.valueOf(name);
        assertFalse(result.equals(expResult));
    }
}
