package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;

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
public class SimplySillyTeamTest {

    /**
     *
     */
    public SimplySillyTeamTest() {}

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
     * Test of getNewControllerPlayer method, of class SimplySillyTeam.
     */
    @Test
    public void testGetNewControllerPlayer() {
        System.out.println("getNewControllerPlayer");
        int              number    = 0;
        SimplySillyTeam  instance  = null;
        ControllerPlayer expResult = null;
        ControllerPlayer result    = instance.getNewControllerPlayer(number);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewControllerCoach method, of class SimplySillyTeam.
     */
    @Test
    public void testGetNewControllerCoach() {
        System.out.println("getNewControllerCoach");
        SimplySillyTeam instance  = null;
        ControllerCoach expResult = null;
        ControllerCoach result    = instance.getNewControllerCoach();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
