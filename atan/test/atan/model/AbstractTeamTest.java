package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.Properties;

/**
 *
 * @author Atan
 */
public class AbstractTeamTest {

    /**
     *
     */
    public AbstractTeamTest() {}

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
     * Test of getTeamName method, of class AbstractTeam.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        AbstractTeam instance  = null;
        String       expResult = "";
        String       result    = instance.getTeamName();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProperties method, of class AbstractTeam.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        AbstractTeam instance  = null;
        Properties   expResult = null;
        Properties   result    = instance.getProperties();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewControllerPlayer method, of class AbstractTeam.
     */
    @Test
    public void testGetNewControllerPlayer() {
        System.out.println("getNewControllerPlayer");
        int              i         = 0;
        AbstractTeam     instance  = null;
        ControllerPlayer expResult = null;
        ControllerPlayer result    = instance.getNewControllerPlayer(i);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewControllerCoach method, of class AbstractTeam.
     */
    @Test
    public void testGetNewControllerCoach() {
        System.out.println("getNewControllerCoach");
        AbstractTeam    instance  = null;
        ControllerCoach expResult = null;
        ControllerCoach result    = instance.getNewControllerCoach();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewPlayers method, of class AbstractTeam.
     */
    @Test
    public void testCreateNewPlayers() {
        System.out.println("createNewPlayers");
        AbstractTeam instance = null;
        instance.createNewPlayers();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewCoach method, of class AbstractTeam.
     */
    @Test
    public void testCreateNewCoach() {
        System.out.println("createNewCoach");
        AbstractTeam instance = null;
        instance.createNewCoach();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of killAll method, of class AbstractTeam.
     */
    @Test
    public void testKillAll() {
        System.out.println("killAll");
        AbstractTeam instance = null;
        instance.killAll();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectAll method, of class AbstractTeam.
     */
    @Test
    public void testConnectAll() {
        System.out.println("connectAll");
        AbstractTeam instance = null;
        instance.connectAll();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class AbstractTeam.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        int          index    = 0;
        AbstractTeam instance = null;
        instance.connect(index);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class AbstractTeam.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractTeam instance  = null;
        int          expResult = 0;
        int          result    = instance.size();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     * @author author
     */
    public class AbstractTeamImpl extends AbstractTeam {

        /**
         *
         */
        public AbstractTeamImpl() {
            super("");
        }

        /**
         *
         * @param i
         * @return
         */
        public ControllerPlayer getNewControllerPlayer(int i) {
            return null;
        }

        /**
         *
         * @return
         */
        public ControllerCoach getNewControllerCoach() {
            return null;
        }
    }
}
