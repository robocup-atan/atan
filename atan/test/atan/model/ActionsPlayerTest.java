/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.model;

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
 * @author Nick
 */
public class ActionsPlayerTest {

    public ActionsPlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of dash method, of class ActionsPlayer.
     */
    @Test
    public void testDash() {
        System.out.println("dash");
        int power = 0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.dash(power);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class ActionsPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int x = 0;
        int y = 0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.move(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kick method, of class ActionsPlayer.
     */
    @Test
    public void testKick() {
        System.out.println("kick");
        int power = 0;
        double direction = 0.0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.kick(power, direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of say method, of class ActionsPlayer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String message = "";
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.say(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of senseBody method, of class ActionsPlayer.
     */
    @Test
    public void testSenseBody() {
        System.out.println("senseBody");
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.senseBody();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turn method, of class ActionsPlayer.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        double angle = 0.0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.turn(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnNeck method, of class ActionsPlayer.
     */
    @Test
    public void testTurnNeck() {
        System.out.println("turnNeck");
        double angle = 0.0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.turnNeck(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of catchBall method, of class ActionsPlayer.
     */
    @Test
    public void testCatchBall() {
        System.out.println("catchBall");
        double direction = 0.0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.catchBall(direction);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeViewMode method, of class ActionsPlayer.
     */
    @Test
    public void testChangeViewMode() {
        System.out.println("changeViewMode");
        ViewQuality quality = null;
        ViewAngle angle = null;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.changeViewMode(quality, angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bye method, of class ActionsPlayer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.bye();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of handleError method, of class ActionsPlayer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String error = "";
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.handleError(error);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeamName method, of class ActionsPlayer.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        ActionsPlayer instance = new ActionsPlayerImpl();
        String expResult = "";
        String result = instance.getTeamName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTeamEast method, of class ActionsPlayer.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        ActionsPlayer instance = new ActionsPlayerImpl();
        boolean expResult = false;
        boolean result = instance.isTeamEast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTeamEast method, of class ActionsPlayer.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean is = false;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.setTeamEast(is);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class ActionsPlayer.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int num = 0;
        ActionsPlayer instance = new ActionsPlayerImpl();
        instance.setNumber(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class ActionsPlayer.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        ActionsPlayer instance = new ActionsPlayerImpl();
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ActionsPlayerImpl implements ActionsPlayer {

        public void dash(int power) {
        }

        public void move(int x, int y) {
        }

        public void kick(int power, double direction) {
        }

        public void say(String message) {
        }

        public void senseBody() {
        }

        public void turn(double angle) {
        }

        public void turnNeck(double angle) {
        }

        public void catchBall(double direction) {
        }

        public void changeViewMode(ViewQuality quality, ViewAngle angle) {
        }

        public void bye() {
        }

        public void handleError(String error) {
        }

        public String getTeamName() {
            return "";
        }

        public boolean isTeamEast() {
            return false;
        }

        public void setTeamEast(boolean is) {
        }

        public void setNumber(int num) {
        }

        public int getNumber() {
            return 0;
        }
    }

}