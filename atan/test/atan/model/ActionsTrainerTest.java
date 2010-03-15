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
public class ActionsTrainerTest {

    /**
     *
     */
    public ActionsTrainerTest() {}

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
     * Test of changePlayMode method, of class ActionsTrainer.
     */
    @Test
    public void testChangePlayMode() {
        System.out.println("changePlayMode");
        PlayMode       playMode = null;
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.changePlayMode(playMode);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of movePlayer method, of class ActionsTrainer.
     */
    @Test
    public void testMovePlayer() {
        System.out.println("movePlayer");
        ActionsPlayer  p        = null;
        double         x        = 0.0;
        double         y        = 0.0;
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.movePlayer(p, x, y);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBall method, of class ActionsTrainer.
     */
    @Test
    public void testMoveBall() {
        System.out.println("moveBall");
        double         x        = 0.0;
        double         y        = 0.0;
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.moveBall(x, y);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBall method, of class ActionsTrainer.
     */
    @Test
    public void testCheckBall() {
        System.out.println("checkBall");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.checkBall();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startGame method, of class ActionsTrainer.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.startGame();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recover method, of class ActionsTrainer.
     */
    @Test
    public void testRecover() {
        System.out.println("recover");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.recover();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eye method, of class ActionsTrainer.
     */
    @Test
    public void testEye() {
        System.out.println("eye");
        boolean        eyeOn    = false;
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.eye(eyeOn);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ear method, of class ActionsTrainer.
     */
    @Test
    public void testEar() {
        System.out.println("ear");
        boolean        earOn    = false;
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.ear(earOn);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class ActionsTrainer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String         message  = "";
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.say(message);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayerType method, of class ActionsTrainer.
     */
    @Test
    public void testChangePlayerType() {
        System.out.println("changePlayerType");
        String         teamName   = "";
        int            unum       = 0;
        int            playerType = 0;
        ActionsTrainer instance   = new ActionsTrainerImpl();
        instance.changePlayerType(teamName, unum, playerType);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of look method, of class ActionsTrainer.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.look();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamNames method, of class ActionsTrainer.
     */
    @Test
    public void testTeamNames() {
        System.out.println("teamNames");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.teamNames();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bye method, of class ActionsTrainer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.bye();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleError method, of class ActionsTrainer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String         error    = "";
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.handleError(error);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     * @author author
     */
    public class ActionsTrainerImpl implements ActionsTrainer {

        /**
         *
         * @param playMode
         */
        public void changePlayMode(PlayMode playMode) {}

        /**
         *
         * @param p
         * @param x
         * @param y
         */
        public void movePlayer(ActionsPlayer p, double x, double y) {}

        /**
         *
         * @param x
         * @param y
         */
        public void moveBall(double x, double y) {}

        /**
         *
         */
        public void checkBall() {}

        /**
         *
         */
        public void startGame() {}

        /**
         *
         */
        public void recover() {}

        /**
         *
         * @param eyeOn
         */
        public void eye(boolean eyeOn) {}

        /**
         *
         * @param earOn
         */
        public void ear(boolean earOn) {}

        /**
         *
         * @param message
         */
        public void say(String message) {}

        /**
         *
         * @param teamName
         * @param unum
         * @param playerType
         */
        public void changePlayerType(String teamName, int unum, int playerType) {}

        /**
         *
         */
        public void look() {}

        /**
         *
         */
        public void teamNames() {}

        /**
         *
         */
        public void bye() {}

        /**
         *
         * @param error
         */
        public void handleError(String error) {}
    }
}
