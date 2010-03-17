package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoachTest.ControllerCoachImpl;

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
    private SServerCoachImpl testSSCoach;

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
    public void setUp() {
        testSSCoach = new SServerCoachImpl();
    }

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
        SServerCoach instance  = testSSCoach;
        String       expResult = null;
        String       result    = instance.getInitMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of connect method, of class SServerCoach.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        SServerCoach instance = testSSCoach;
        instance.connect();
    }

    /**
     * Test of start method, of class SServerCoach.
     */
    @Test(expected = Error.class)
    public void testStart() {
        System.out.println("start");
        SServerCoach instance = testSSCoach;
        instance.start();
    }

    /**
     * Test of received method, of class SServerCoach.
     * @throws Exception
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String       msg      = "";
        SServerCoach instance = testSSCoach;
        instance.received(msg);
    }

    /**
     * Test of eye method, of class SServerCoach.
     */
    @Test
    public void testEye() {
        System.out.println("eye");
        boolean      eyeOn    = false;
        SServerCoach instance = testSSCoach;
        instance.eye(eyeOn);
    }

    /**
     * Test of look method, of class SServerCoach.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        SServerCoach instance = testSSCoach;
        instance.look();
    }

    /**
     * Test of getTeamNames method, of class SServerCoach.
     */
    @Test
    public void testGetTeamNames() {
        System.out.println("getTeamNames");
        SServerCoach instance = testSSCoach;
        instance.getTeamNames();
    }

    /**
     * Test of changePlayerType method, of class SServerCoach.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testChangePlayerType() {
        System.out.println("changePlayerType");
        int          unum       = 0;
        int          playerType = 0;
        SServerCoach instance   = testSSCoach;
        instance.changePlayerType(unum, playerType);
    }

    /**
     * Test of say method, of class SServerCoach.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String       message  = "";
        SServerCoach instance = testSSCoach;
        instance.say(message);
    }

    /**
     * Test of teamGraphic method, of class SServerCoach.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testTeamGraphic() {
        System.out.println("teamGraphic");
        XPMImage     xpm      = null;
        SServerCoach instance = testSSCoach;
        instance.teamGraphic(xpm);
    }

    /**
     * Test of bye method, of class SServerCoach.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerCoach instance = testSSCoach;
        instance.bye();
    }

    /**
     * Test of handleError method, of class SServerCoach.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String       error    = "";
        SServerCoach instance = testSSCoach;
        instance.handleError(error);
    }

    /**
     * Test of isTeamEast method, of class SServerCoach.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        SServerCoach instance  = testSSCoach;
        boolean      expResult = false;
        boolean      result    = instance.isTeamEast();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeamEast method, of class SServerCoach.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean      is       = false;
        SServerCoach instance = testSSCoach;
        instance.setTeamEast(is);
    }

    /**
     * Test of getTeamName method, of class SServerCoach.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        SServerCoach instance  = testSSCoach;
        String       expResult = "TestTeam";
        String       result    = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     *
     * @author Atan
     */
    public static class SServerCoachImpl extends SServerCoach {

        /**
         *
         */
        public SServerCoachImpl() {
            super("TestTeam", new ControllerCoachImpl());
        }
    }
}
