package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayerTest.ControllerPlayerImpl;
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
    private SServerPlayer sserverPlayerTest;

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
    public void setUp() {
        sserverPlayerTest = new SServerPlayerImpl();
    }

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
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = null;
        String        result    = instance.getInitMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of connect method, of class SServerPlayer.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        String        version  = "13";
        boolean       isGoalie = false;
        SServerPlayer instance = sserverPlayerTest;
        instance.connect(version, isGoalie);
    }

    /**
     * Test of start method, of class SServerPlayer.
     */
    @Test(expected = Error.class)
    public void testStart() {
        System.out.println("start");
        SServerPlayer instance = sserverPlayerTest;
        instance.start();
    }

    /**
     * Test of received method, of class SServerPlayer.
     * @throws Exception
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String        msg      = "";
        SServerPlayer instance = sserverPlayerTest;
        instance.received(msg);
    }

    /**
     * Test of setTeamEast method, of class SServerPlayer.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean       is       = false;
        SServerPlayer instance = sserverPlayerTest;
        instance.setTeamEast(is);
    }

    /**
     * Test of dash method, of class SServerPlayer.
     */
    @Test
    public void testDash() {
        System.out.println("dash");
        int           power    = 0;
        SServerPlayer instance = sserverPlayerTest;
        instance.dash(power);
    }

    /**
     * Test of kick method, of class SServerPlayer.
     */
    @Test
    public void testKick() {
        System.out.println("kick");
        int           power     = 0;
        double        direction = 0.0;
        SServerPlayer instance  = sserverPlayerTest;
        instance.kick(power, direction);
    }

    /**
     * Test of move method, of class SServerPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int           x        = 0;
        int           y        = 0;
        SServerPlayer instance = sserverPlayerTest;
        instance.move(x, y);
    }

    /**
     * Test of say method, of class SServerPlayer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String        message  = "";
        SServerPlayer instance = sserverPlayerTest;
        instance.say(message);
    }

    /**
     * Test of turn method, of class SServerPlayer.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        double        angle    = 0.0;
        SServerPlayer instance = sserverPlayerTest;
        instance.turn(angle);
    }

    /**
     * Test of turnNeck method, of class SServerPlayer.
     */
    @Test
    public void testTurnNeck() {
        System.out.println("turnNeck");
        double        angle    = 0.0;
        SServerPlayer instance = sserverPlayerTest;
        instance.turnNeck(angle);
    }

    /**
     * Test of catchBall method, of class SServerPlayer.
     */
    @Test
    public void testCatchBall() {
        System.out.println("catchBall");
        double        direction = 0.0;
        SServerPlayer instance  = sserverPlayerTest;
        instance.catchBall(direction);
    }

    /**
     * Test of changeViewMode method, of class SServerPlayer.
     */
    @Test
    public void testChangeViewMode() {
        System.out.println("changeViewMode");
        ViewQuality   quality  = ViewQuality.HIGH;
        ViewAngle     angle    = ViewAngle.NORMAL;
        SServerPlayer instance = sserverPlayerTest;
        instance.changeViewMode(quality, angle);
    }

    /**
     * Test of bye method, of class SServerPlayer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerPlayer instance = sserverPlayerTest;
        instance.bye();
    }

    /**
     * Test of getTeamName method, of class SServerPlayer.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "TestTeam";
        String        result    = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class SServerPlayer.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int           num      = 0;
        SServerPlayer instance = sserverPlayerTest;
        instance.setNumber(num);
    }

    /**
     * Test of getNumber method, of class SServerPlayer.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        SServerPlayer instance  = sserverPlayerTest;
        int           expResult = -1;
        int           result    = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of isTeamEast method, of class SServerPlayer.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        SServerPlayer instance  = sserverPlayerTest;
        boolean       expResult = false;
        boolean       result    = instance.isTeamEast();
        assertEquals(expResult, result);
    }

    /**
     * Test of toListString method, of class SServerPlayer.
     */
    @Test
    public void testToListString() {
        System.out.println("toListString");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "atan.model.ControllerPlayerTest$ControllerPlayerImpl";
        String        result    = instance.toListString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toStateString method, of class SServerPlayer.
     */
    @Test
    public void testToStateString() {
        System.out.println("toStateString");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "Host: localhost:6000\nTeam Name: TestTeam\nNumber: -1\nRunning: false"
                                  + "\nControllerPlayer Class: atan.model.ControllerPlayerTest$ControllerPlayerImpl\n";
        String result = instance.toStateString();
        assertEquals(expResult, result);
    }

    /**
     * Test of handleError method, of class SServerPlayer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String        error    = "";
        SServerPlayer instance = sserverPlayerTest;
        instance.handleError(error);
    }

    /**
     * Test of getDescription method, of class SServerPlayer.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "TestTeam <undefined>";
        String        result    = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     *
     * @author author
     */
    public static class SServerPlayerImpl extends SServerPlayer {

        /**
         *
         */
        public SServerPlayerImpl() {
            super("TestTeam", new ControllerPlayerImpl());
        }
    }
}
