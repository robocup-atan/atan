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
public class WarningTest {

    /**
     *
     */
    public WarningTest() {}

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
     * Test of values method, of class Warning.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Warning[] expResult = {
            Warning.NO_TEAM_FOUND, Warning.NO_SUCH_PLAYER, Warning.CANNOT_SUB_WHILE_PLAYON, Warning.NO_SUBS_LEFT,
            Warning.MAX_OF_THAT_TYPE_ON_FIELD, Warning.CANNOT_CHANGE_GOALIE
        };
        Warning[] result = Warning.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Warning.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String  name      = "NO_TEAM_FOUND";
        Warning expResult = Warning.NO_TEAM_FOUND;
        Warning result    = Warning.valueOf(name);
        assertEquals(expResult, result);
        name      = "NO_SUCH_PLAYER";
        expResult = Warning.NO_SUCH_PLAYER;
        result    = Warning.valueOf(name);
        assertEquals(expResult, result);
        name      = "CANNOT_SUB_WHILE_PLAYON";
        expResult = Warning.CANNOT_SUB_WHILE_PLAYON;
        result    = Warning.valueOf(name);
        assertEquals(expResult, result);
        name      = "NO_SUBS_LEFT";
        expResult = Warning.NO_SUBS_LEFT;
        result    = Warning.valueOf(name);
        assertEquals(expResult, result);
        name      = "MAX_OF_THAT_TYPE_ON_FIELD";
        expResult = Warning.MAX_OF_THAT_TYPE_ON_FIELD;
        result    = Warning.valueOf(name);
        assertEquals(expResult, result);
        name      = "CANNOT_CHANGE_GOALIE";
        expResult = Warning.CANNOT_CHANGE_GOALIE;
        result    = Warning.valueOf(name);
        assertEquals(expResult, result);
    }
}
