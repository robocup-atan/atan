package com.github.robocup_atan.atan.model.enums;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.Errors;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p>ErrorsTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class ErrorsTest {

    /**
     * <p>Constructor for ErrorsTest.</p>
     */
    public ErrorsTest() {}

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     * <p>tearDownClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     * <p>setUp.</p>
     */
    @Before
    public void setUp() {}

    /**
     * <p>tearDown.</p>
     */
    @After
    public void tearDown() {}

    /**
     * Test of values method, of class Errors.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Errors[] expResult = {
            Errors.ILLEGAL_MODE, Errors.ILLEGAL_COMMAND_FORM, Errors.ILLEGAL_OBJECT_FORM, Errors.NO_MORE_TEAM_OR_PLAYER,
            Errors.NO_MORE_TEAM_OR_PLAYER_OR_GOALIE, Errors.NO_MORE_PLAYER_OR_GOALIE_OR_ILLEGAL_CLIENT_VERSION,
            Errors.RECONNECT, Errors.UNKNOWN_COMMAND, Errors.TOO_MANY_MOVES, Errors.SAID_TOO_MANY_MESSAGES
        };
        Errors[] result = Errors.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Errors.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name      = "NO_MORE_PLAYER_OR_GOALIE_OR_ILLEGAL_CLIENT_VERSION";
        Errors expResult = Errors.NO_MORE_PLAYER_OR_GOALIE_OR_ILLEGAL_CLIENT_VERSION;
        Errors result    = Errors.valueOf(name);
        assertEquals(expResult, result);
        name      = "ILLEGAL_OBJECT_FORM";
        expResult = Errors.ILLEGAL_OBJECT_FORM;
        result    = Errors.valueOf(name);
        assertEquals(expResult, result);
    }
}
