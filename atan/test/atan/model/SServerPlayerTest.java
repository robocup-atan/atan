package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;

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
public class SServerPlayerTest {

    /**
     *
     */
    public SServerPlayerTest() {}

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
     * Test of getInitMessage method, of class SServerPlayer.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        SServerPlayer instance  = null;
        String        expResult = "";
        String        result    = instance.getInitMessage();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class SServerPlayer.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        String        version  = "";
        boolean       isGoalie = false;
        SServerPlayer instance = null;
        instance.connect(version, isGoalie);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class SServerPlayer.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        SServerPlayer instance = null;
        instance.start();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class SServerPlayer.
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String        msg      = "";
        SServerPlayer instance = null;
        instance.received(msg);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamEast method, of class SServerPlayer.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean       is       = false;
        SServerPlayer instance = null;
        instance.setTeamEast(is);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dash method, of class SServerPlayer.
     */
    @Test
    public void testDash() {
        System.out.println("dash");
        int           power    = 0;
        SServerPlayer instance = null;
        instance.dash(power);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kick method, of class SServerPlayer.
     */
    @Test
    public void testKick() {
        System.out.println("kick");
        int           power     = 0;
        double        direction = 0.0;
        SServerPlayer instance  = null;
        instance.kick(power, direction);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class SServerPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int           x        = 0;
        int           y        = 0;
        SServerPlayer instance = null;
        instance.move(x, y);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class SServerPlayer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String        message  = "";
        SServerPlayer instance = null;
        instance.say(message);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turn method, of class SServerPlayer.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        double        angle    = 0.0;
        SServerPlayer instance = null;
        instance.turn(angle);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnNeck method, of class SServerPlayer.
     */
    @Test
    public void testTurnNeck() {
        System.out.println("turnNeck");
        double        angle    = 0.0;
        SServerPlayer instance = null;
        instance.turnNeck(angle);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of catchBall method, of class SServerPlayer.
     */
    @Test
    public void testCatchBall() {
        System.out.println("catchBall");
        double        direction = 0.0;
        SServerPlayer instance  = null;
        instance.catchBall(direction);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeViewMode method, of class SServerPlayer.
     */
    @Test
    public void testChangeViewMode() {
        System.out.println("changeViewMode");
        ViewQuality   quality  = null;
        ViewAngle     angle    = null;
        SServerPlayer instance = null;
        instance.changeViewMode(quality, angle);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bye method, of class SServerPlayer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerPlayer instance = null;
        instance.bye();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamName method, of class SServerPlayer.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        SServerPlayer instance  = null;
        String        expResult = "";
        String        result    = instance.getTeamName();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class SServerPlayer.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int           num      = 0;
        SServerPlayer instance = null;
        instance.setNumber(num);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class SServerPlayer.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        SServerPlayer instance  = null;
        int           expResult = 0;
        int           result    = instance.getNumber();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTeamEast method, of class SServerPlayer.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        SServerPlayer instance  = null;
        boolean       expResult = false;
        boolean       result    = instance.isTeamEast();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toListString method, of class SServerPlayer.
     */
    @Test
    public void testToListString() {
        System.out.println("toListString");
        SServerPlayer instance  = null;
        String        expResult = "";
        String        result    = instance.toListString();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStateString method, of class SServerPlayer.
     */
    @Test
    public void testToStateString() {
        System.out.println("toStateString");
        SServerPlayer instance  = null;
        String        expResult = "";
        String        result    = instance.toStateString();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleError method, of class SServerPlayer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String        error    = "";
        SServerPlayer instance = null;
        instance.handleError(error);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class SServerPlayer.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        SServerPlayer instance  = null;
        String        expResult = "";
        String        result    = instance.getDescription();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
