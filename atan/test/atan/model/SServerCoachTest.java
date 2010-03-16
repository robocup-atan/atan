package atan.model;

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
public class SServerCoachTest {

    /**
     *
     */
    public SServerCoachTest() {}

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
     * Test of getInitMessage method, of class SServerCoach.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        SServerCoach instance  = null;
        String       expResult = "";
        String       result    = instance.getInitMessage();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class SServerCoach.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        SServerCoach instance = null;
        instance.connect();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class SServerCoach.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        SServerCoach instance = null;
        instance.start();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class SServerCoach.
     * @throws Exception
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String       msg      = "";
        SServerCoach instance = null;
        instance.received(msg);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eye method, of class SServerCoach.
     */
    @Test
    public void testEye() {
        System.out.println("eye");
        boolean      eyeOn    = false;
        SServerCoach instance = null;
        instance.eye(eyeOn);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of look method, of class SServerCoach.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        SServerCoach instance = null;
        instance.look();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamNames method, of class SServerCoach.
     */
    @Test
    public void testGetTeamNames() {
        System.out.println("getTeamNames");
        SServerCoach instance = null;
        instance.getTeamNames();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayerType method, of class SServerCoach.
     */
    @Test
    public void testChangePlayerType() {
        System.out.println("changePlayerType");
        int          unum       = 0;
        int          playerType = 0;
        SServerCoach instance   = null;
        instance.changePlayerType(unum, playerType);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class SServerCoach.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String       message  = "";
        SServerCoach instance = null;
        instance.say(message);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamGraphic method, of class SServerCoach.
     */
    @Test
    public void testTeamGraphic() {
        System.out.println("teamGraphic");
        XPMImage     xpm      = null;
        SServerCoach instance = null;
        instance.teamGraphic(xpm);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bye method, of class SServerCoach.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerCoach instance = null;
        instance.bye();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleError method, of class SServerCoach.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String       error    = "";
        SServerCoach instance = null;
        instance.handleError(error);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTeamEast method, of class SServerCoach.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        SServerCoach instance  = null;
        boolean      expResult = false;
        boolean      result    = instance.isTeamEast();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamEast method, of class SServerCoach.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean      is       = false;
        SServerCoach instance = null;
        instance.setTeamEast(is);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamName method, of class SServerCoach.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        SServerCoach instance  = null;
        String       expResult = "";
        String       result    = instance.getTeamName();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
