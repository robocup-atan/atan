package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ActionsPlayer;
import com.github.robocup_atan.atan.model.ActionsTrainer;
import com.github.robocup_atan.atan.model.enums.PlayMode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p>ActionsTrainerTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class ActionsTrainerTest {

    /**
     * <p>Constructor for ActionsTrainerTest.</p>
     */
    public ActionsTrainerTest() {}

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
    public void setUp() {}

    /**
     * <p>tearDown.</p>
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
    }

    /**
     * Test of checkBall method, of class ActionsTrainer.
     */
    @Test
    public void testCheckBall() {
        System.out.println("checkBall");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.checkBall();
    }

    /**
     * Test of startGame method, of class ActionsTrainer.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.startGame();
    }

    /**
     * Test of recover method, of class ActionsTrainer.
     */
    @Test
    public void testRecover() {
        System.out.println("recover");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.recover();
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
    }

    /**
     * Test of look method, of class ActionsTrainer.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.look();
    }

    /**
     * Test of teamNames method, of class ActionsTrainer.
     */
    @Test
    public void testTeamNames() {
        System.out.println("teamNames");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.teamNames();
    }

    /**
     * Test of bye method, of class ActionsTrainer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        ActionsTrainer instance = new ActionsTrainerImpl();
        instance.bye();
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
    }

    /**
     *
     * @author Atan
     */
    public class ActionsTrainerImpl implements ActionsTrainer {

        /**
         *
         * @param playMode
         */
        @Override
        public void changePlayMode(PlayMode playMode) {}

        /**
         *
         * @param p
         * @param x
         * @param y
         */
        @Override
        public void movePlayer(ActionsPlayer p, double x, double y) {}

        /**
         *
         * @param x
         * @param y
         */
        @Override
        public void moveBall(double x, double y) {}

        /**
         *
         */
        @Override
        public void checkBall() {}

        /**
         *
         */
        @Override
        public void startGame() {}

        /**
         *
         */
        @Override
        public void recover() {}

        /**
         *
         * @param eyeOn
         */
        @Override
        public void eye(boolean eyeOn) {}

        /**
         *
         * @param earOn
         */
        @Override
        public void ear(boolean earOn) {}

        /**
         *
         * @param message
         */
        @Override
        public void say(String message) {}

        /**
         *
         * @param teamName
         * @param unum
         * @param playerType
         */
        @Override
        public void changePlayerType(String teamName, int unum, int playerType) {}

        /**
         *
         */
        @Override
        public void look() {}

        /**
         *
         */
        @Override
        public void teamNames() {}

        /**
         *
         */
        @Override
        public void bye() {}

        /**
         *
         * @param error
         */
        @Override
        public void handleError(String error) {}
    }
}
