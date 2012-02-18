package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ActionsPlayer;
import com.github.robocup_atan.atan.model.SServerTrainer;
import com.github.robocup_atan.atan.model.ControllerTrainerTest.ControllerTrainerImpl;
import com.github.robocup_atan.atan.model.enums.PlayMode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p>SServerTrainerTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class SServerTrainerTest {
    private SServerTrainerImpl testSSTrainer;

    /**
     * <p>Constructor for SServerTrainerTest.</p>
     */
    public SServerTrainerTest() {}

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
    public void setUp() {
        testSSTrainer = new SServerTrainerImpl();
    }

    /**
     * <p>tearDown.</p>
     */
    @After
    public void tearDown() {}

    /**
     * Test of getInitMessage method, of class SServerTrainer.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        SServerTrainer instance  = testSSTrainer;
        String         expResult = null;
        String         result    = instance.getInitMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of connect method, of class SServerTrainer.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        SServerTrainer instance = testSSTrainer;
        instance.connect();
    }

    /**
     * Test of received method, of class SServerTrainer.
     *
     * @throws java.lang.Exception if any.
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String         msg      = null;
        SServerTrainer instance = testSSTrainer;
        instance.received(msg);
    }

    /**
     * Test of changePlayMode method, of class SServerTrainer.
     */
    @Test
    public void testChangePlayMode() {
        System.out.println("changePlayMode");
        PlayMode       playMode = PlayMode.FREE_KICK_FAULT_R;
        SServerTrainer instance = testSSTrainer;
        instance.changePlayMode(playMode);
    }

    /**
     * Test of movePlayer method, of class SServerTrainer.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testMovePlayer() {
        System.out.println("movePlayer");
        ActionsPlayer  p        = null;
        double         x        = 0.0;
        double         y        = 0.0;
        SServerTrainer instance = testSSTrainer;
        instance.movePlayer(p, x, y);
    }

    /**
     * Test of moveBall method, of class SServerTrainer.
     */
    @Test
    public void testMoveBall() {
        System.out.println("moveBall");
        double         x        = 0.0;
        double         y        = 0.0;
        SServerTrainer instance = testSSTrainer;
        instance.moveBall(x, y);
    }

    /**
     * Test of checkBall method, of class SServerTrainer.
     */
    @Test
    public void testCheckBall() {
        System.out.println("checkBall");
        SServerTrainer instance = testSSTrainer;
        instance.checkBall();
    }

    /**
     * Test of startGame method, of class SServerTrainer.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        SServerTrainer instance = testSSTrainer;
        instance.startGame();
    }

    /**
     * Test of recover method, of class SServerTrainer.
     */
    @Test
    public void testRecover() {
        System.out.println("recover");
        SServerTrainer instance = testSSTrainer;
        instance.recover();
    }

    /**
     * Test of eye method, of class SServerTrainer.
     */
    @Test
    public void testEye() {
        System.out.println("eye");
        boolean        eyeOn    = false;
        SServerTrainer instance = testSSTrainer;
        instance.eye(eyeOn);
    }

    /**
     * Test of ear method, of class SServerTrainer.
     */
    @Test
    public void testEar() {
        System.out.println("ear");
        boolean        earOn    = true;
        SServerTrainer instance = testSSTrainer;
        instance.ear(earOn);
    }

    /**
     * Test of look method, of class SServerTrainer.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        SServerTrainer instance = testSSTrainer;
        instance.look();
    }

    /**
     * Test of teamNames method, of class SServerTrainer.
     */
    @Test
    public void testTeamNames() {
        System.out.println("teamNames");
        SServerTrainer instance = testSSTrainer;
        instance.teamNames();
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
        SServerTrainer instance   = testSSTrainer;
        instance.changePlayerType(teamName, unum, playerType);
    }

    /**
     * Test of say method, of class SServerTrainer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String         message  = "Test";
        SServerTrainer instance = testSSTrainer;
        instance.say(message);
    }

    /**
     * Test of bye method, of class SServerTrainer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerTrainer instance = testSSTrainer;
        instance.bye();
    }

    /**
     * Test of handleError method, of class SServerTrainer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String         error    = "Error";
        SServerTrainer instance = testSSTrainer;
        instance.handleError(error);
    }

    /**
     *
     * @author Atan
     */
    public static class SServerTrainerImpl extends SServerTrainer {

        /**
         *
         */
        public SServerTrainerImpl() {
            super("TestTeam", new ControllerTrainerImpl());
        }
    }
}
