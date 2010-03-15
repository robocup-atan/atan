package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.PlayMode;

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
public class SServerTrainerTest {

    /**
     *
     */
    public SServerTrainerTest() {}

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
     * Test of getInitMessage method, of class SServerTrainer.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        SServerTrainer instance  = null;
        String         expResult = "";
        String         result    = instance.getInitMessage();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connect method, of class SServerTrainer.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        SServerTrainer instance = null;
        instance.connect();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class SServerTrainer.
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String         msg      = "";
        SServerTrainer instance = null;
        instance.received(msg);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayMode method, of class SServerTrainer.
     */
    @Test
    public void testChangePlayMode() {
        System.out.println("changePlayMode");
        PlayMode       playMode = null;
        SServerTrainer instance = null;
        instance.changePlayMode(playMode);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of movePlayer method, of class SServerTrainer.
     */
    @Test
    public void testMovePlayer() {
        System.out.println("movePlayer");
        ActionsPlayer  p        = null;
        double         x        = 0.0;
        double         y        = 0.0;
        SServerTrainer instance = null;
        instance.movePlayer(p, x, y);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBall method, of class SServerTrainer.
     */
    @Test
    public void testMoveBall() {
        System.out.println("moveBall");
        double         x        = 0.0;
        double         y        = 0.0;
        SServerTrainer instance = null;
        instance.moveBall(x, y);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBall method, of class SServerTrainer.
     */
    @Test
    public void testCheckBall() {
        System.out.println("checkBall");
        SServerTrainer instance = null;
        instance.checkBall();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startGame method, of class SServerTrainer.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        SServerTrainer instance = null;
        instance.startGame();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recover method, of class SServerTrainer.
     */
    @Test
    public void testRecover() {
        System.out.println("recover");
        SServerTrainer instance = null;
        instance.recover();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eye method, of class SServerTrainer.
     */
    @Test
    public void testEye() {
        System.out.println("eye");
        boolean        eyeOn    = false;
        SServerTrainer instance = null;
        instance.eye(eyeOn);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ear method, of class SServerTrainer.
     */
    @Test
    public void testEar() {
        System.out.println("ear");
        boolean        earOn    = false;
        SServerTrainer instance = null;
        instance.ear(earOn);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of look method, of class SServerTrainer.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        SServerTrainer instance = null;
        instance.look();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamNames method, of class SServerTrainer.
     */
    @Test
    public void testTeamNames() {
        System.out.println("teamNames");
        SServerTrainer instance = null;
        instance.teamNames();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayerType method, of class SServerTrainer.
     */
    @Test
    public void testChangePlayerType() {
        System.out.println("changePlayerType");
        String         teamName   = "";
        int            unum       = 0;
        int            playerType = 0;
        SServerTrainer instance   = null;
        instance.changePlayerType(teamName, unum, playerType);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class SServerTrainer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String         message  = "";
        SServerTrainer instance = null;
        instance.say(message);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bye method, of class SServerTrainer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerTrainer instance = null;
        instance.bye();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleError method, of class SServerTrainer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String         error    = "";
        SServerTrainer instance = null;
        instance.handleError(error);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
