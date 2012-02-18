package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ActionsPlayer;
import com.github.robocup_atan.atan.model.enums.ViewAngle;
import com.github.robocup_atan.atan.model.enums.ViewQuality;

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
public class ActionsPlayerTest {

    /**
     *
     */
    public ActionsPlayerTest() {}

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
     * Test of dash method, of class ActionsPlayer.
     */
    @Test
    public void testDash() {
        System.out.println("dash");
        int           power    = 50;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.dash(power);
    }

    /**
     * Test of move method, of class ActionsPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int           x        = 0;
        int           y        = 0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.move(x, y);
    }

    /**
     * Test of kick method, of class ActionsPlayer.
     */
    @Test
    public void testKick() {
        System.out.println("kick");
        int           power     = 10;
        double        direction = 0.0;
        ActionsPlayer instance  = new ActionsPlayerImpl();
        instance.kick(power, direction);
    }

    /**
     * Test of say method, of class ActionsPlayer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String        message  = "Test";
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.say(message);
    }

    /**
     * Test of turn method, of class ActionsPlayer.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        double        angle    = 0.0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.turn(angle);
    }

    /**
     * Test of turnNeck method, of class ActionsPlayer.
     */
    @Test
    public void testTurnNeck() {
        System.out.println("turnNeck");
        double        angle    = 0.0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.turnNeck(angle);
    }

    /**
     * Test of catchBall method, of class ActionsPlayer.
     */
    @Test
    public void testCatchBall() {
        System.out.println("catchBall");
        double        direction = 0.0;
        ActionsPlayer instance  = new ActionsPlayerImpl();
        instance.catchBall(direction);
    }

    /**
     * Test of changeViewMode method, of class ActionsPlayer.
     */
    @Test
    public void testChangeViewMode() {
        System.out.println("changeViewMode");
        ViewQuality   quality  = null;
        ViewAngle     angle    = null;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.changeViewMode(quality, angle);
    }

    /**
     * Test of bye method, of class ActionsPlayer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.bye();
    }

    /**
     * Test of handleError method, of class ActionsPlayer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String        error    = "";
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.handleError(error);
    }

    /**
     * Test of getTeamName method, of class ActionsPlayer.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        ActionsPlayer instance  = new ActionsPlayerImpl();
        String        expResult = "";
        String        result    = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     * Test of isTeamEast method, of class ActionsPlayer.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        ActionsPlayer instance  = new ActionsPlayerImpl();
        boolean       expResult = false;
        boolean       result    = instance.isTeamEast();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeamEast method, of class ActionsPlayer.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean       is       = false;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.setTeamEast(is);
    }

    /**
     * Test of setNumber method, of class ActionsPlayer.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int           num      = 0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.setNumber(num);
    }

    /**
     * Test of getNumber method, of class ActionsPlayer.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        ActionsPlayer instance  = new ActionsPlayerImpl();
        int           expResult = 0;
        int           result    = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     *
     * @author Atan
     */
    public static class ActionsPlayerImpl implements ActionsPlayer {

        /**
         *
         * @param power
         */
        @Override
        public void dash(int power) {}

        /**
         *
         * @param x
         * @param y
         */
        @Override
        public void move(int x, int y) {}

        /**
         *
         * @param power
         * @param direction
         */
        @Override
        public void kick(int power, double direction) {}

        /**
         *
         * @param message
         */
        @Override
        public void say(String message) {}

        /**
         *
         */
        public void senseBody() {}

        /**
         *
         * @param angle
         */
        @Override
        public void turn(double angle) {}

        /**
         *
         * @param angle
         */
        @Override
        public void turnNeck(double angle) {}

        /**
         *
         * @param direction
         */
        @Override
        public void catchBall(double direction) {}

        /**
         *
         * @param quality
         * @param angle
         */
        @Override
        public void changeViewMode(ViewQuality quality, ViewAngle angle) {}

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

        /**
         *
         * @return
         */
        @Override
        public String getTeamName() {
            return "";
        }

        /**
         *
         * @return
         */
        @Override
        public boolean isTeamEast() {
            return false;
        }

        /**
         *
         * @param is
         */
        @Override
        public void setTeamEast(boolean is) {}

        /**
         *
         * @param num
         */
        @Override
        public void setNumber(int num) {}

        /**
         *
         * @return
         */
        @Override
        public int getNumber() {
            return 0;
        }
    }
}
