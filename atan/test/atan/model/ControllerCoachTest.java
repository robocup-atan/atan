/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.model;

import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.ServerParams;
import atan.model.enums.Warning;
import java.util.HashMap;
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
public class ControllerCoachTest {

    public ControllerCoachTest() {
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
     * Test of infoSeePlayerOwn method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeePlayerOwn() {
        System.out.println("infoSeePlayerOwn");
        int number = 0;
        boolean goalie = false;
        double x = 0.0;
        double y = 0.0;
        double deltaX = 0.0;
        double deltaY = 0.0;
        double bodyAngle = 0.0;
        double neckAngle = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeePlayerOwn(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeePlayerOther method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeePlayerOther() {
        System.out.println("infoSeePlayerOther");
        int number = 0;
        boolean goalie = false;
        double x = 0.0;
        double y = 0.0;
        double deltaX = 0.0;
        double deltaY = 0.0;
        double bodyAngle = 0.0;
        double neckAngle = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeePlayerOther(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeGoalOwn method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeeGoalOwn() {
        System.out.println("infoSeeGoalOwn");
        double x = 0.0;
        double y = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeeGoalOwn(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeGoalOther method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeeGoalOther() {
        System.out.println("infoSeeGoalOther");
        double x = 0.0;
        double y = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeeGoalOther(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeBall method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeeBall() {
        System.out.println("infoSeeBall");
        double x = 0.0;
        double y = 0.0;
        double deltaX = 0.0;
        double deltaY = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeeBall(x, y, deltaX, deltaY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearTeamNames method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearTeamNames() {
        System.out.println("infoHearTeamNames");
        String teamWest = "";
        String teamEast = "";
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearTeamNames(teamWest, teamEast);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearReferee method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearReferee() {
        System.out.println("infoHearReferee");
        RefereeMessage refereeMessage = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearReferee(refereeMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearPlayMode method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearPlayMode() {
        System.out.println("infoHearPlayMode");
        PlayMode playMode = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearPlayMode(playMode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearPlayer method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearPlayer() {
        System.out.println("infoHearPlayer");
        double direction = 0.0;
        String message = "";
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearPlayer(direction, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearError method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearError() {
        System.out.println("infoHearError");
        Errors error = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearError(error);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearOk method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearOk() {
        System.out.println("infoHearOk");
        Ok ok = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearOk(ok);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearWarning method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearWarning() {
        System.out.println("infoHearWarning");
        Warning warning = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearWarning(warning);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoPlayerType method, of class ControllerCoach.
     */
    @Test
    public void testInfoPlayerType() {
        System.out.println("infoPlayerType");
        int id = 0;
        double playerSpeedMax = 0.0;
        double staminaIncMax = 0.0;
        double playerDecay = 0.0;
        double inertiaMoment = 0.0;
        double dashPowerRate = 0.0;
        double playerSize = 0.0;
        double kickableMargin = 0.0;
        double kickRand = 0.0;
        double extraStamina = 0.0;
        double effortMax = 0.0;
        double effortMin = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoPlayerType(id, playerSpeedMax, staminaIncMax, playerDecay, inertiaMoment, dashPowerRate, playerSize, kickableMargin, kickRand, extraStamina, effortMax, effortMin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoCPTOwn method, of class ControllerCoach.
     */
    @Test
    public void testInfoCPTOwn() {
        System.out.println("infoCPTOwn");
        int unum = 0;
        int type = 0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoCPTOwn(unum, type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoCPTOther method, of class ControllerCoach.
     */
    @Test
    public void testInfoCPTOther() {
        System.out.println("infoCPTOther");
        int unum = 0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoCPTOther(unum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoPlayerParam method, of class ControllerCoach.
     */
    @Test
    public void testInfoPlayerParam() {
        System.out.println("infoPlayerParam");
        double allowMultDefaultType = 0.0;
        double dashPowerRateDeltaMax = 0.0;
        double dashPowerRateDeltaMin = 0.0;
        double effortMaxDeltaFactor = 0.0;
        double effortMinDeltaFactor = 0.0;
        double extraStaminaDeltaMax = 0.0;
        double extraStaminaDeltaMin = 0.0;
        double inertiaMomentDeltaFactor = 0.0;
        double kickRandDeltaFactor = 0.0;
        double kickableMarginDeltaMax = 0.0;
        double kickableMarginDeltaMin = 0.0;
        double newDashPowerRateDeltaMax = 0.0;
        double newDashPowerRateDeltaMin = 0.0;
        double newStaminaIncMaxDeltaFactor = 0.0;
        double playerDecayDeltaMax = 0.0;
        double playerDecayDeltaMin = 0.0;
        double playerTypes = 0.0;
        double ptMax = 0.0;
        double randomSeed = 0.0;
        double staminaIncMaxDeltaFactor = 0.0;
        double subsMax = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoPlayerParam(allowMultDefaultType, dashPowerRateDeltaMax, dashPowerRateDeltaMin, effortMaxDeltaFactor, effortMinDeltaFactor, extraStaminaDeltaMax, extraStaminaDeltaMin, inertiaMomentDeltaFactor, kickRandDeltaFactor, kickableMarginDeltaMax, kickableMarginDeltaMin, newDashPowerRateDeltaMax, newDashPowerRateDeltaMin, newStaminaIncMaxDeltaFactor, playerDecayDeltaMax, playerDecayDeltaMin, playerTypes, ptMax, randomSeed, staminaIncMaxDeltaFactor, subsMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoServerParam method, of class ControllerCoach.
     */
    @Test
    public void testInfoServerParam() {
        System.out.println("infoServerParam");
        HashMap<ServerParams, Object> info = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoServerParam(info);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoach method, of class ControllerCoach.
     */
    @Test
    public void testSetCoach() {
        System.out.println("setCoach");
        ActionsCoach c = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.setCoach(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoach method, of class ControllerCoach.
     */
    @Test
    public void testGetCoach() {
        System.out.println("getCoach");
        ControllerCoach instance = new ControllerCoachImpl();
        ActionsCoach expResult = null;
        ActionsCoach result = instance.getCoach();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ControllerCoachImpl implements ControllerCoach {

        public void infoSeePlayerOwn(int number, boolean goalie, double x, double y, double deltaX, double deltaY, double bodyAngle, double neckAngle) {
        }

        public void infoSeePlayerOther(int number, boolean goalie, double x, double y, double deltaX, double deltaY, double bodyAngle, double neckAngle) {
        }

        public void infoSeeGoalOwn(double x, double y) {
        }

        public void infoSeeGoalOther(double x, double y) {
        }

        public void infoSeeBall(double x, double y, double deltaX, double deltaY) {
        }

        public void infoHearTeamNames(String teamWest, String teamEast) {
        }

        public void infoHearReferee(RefereeMessage refereeMessage) {
        }

        public void infoHearPlayMode(PlayMode playMode) {
        }

        public void infoHearPlayer(double direction, String message) {
        }

        public void infoHearError(Errors error) {
        }

        public void infoHearOk(Ok ok) {
        }

        public void infoHearWarning(Warning warning) {
        }

        public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay, double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin, double kickRand, double extraStamina, double effortMax, double effortMin) {
        }

        public void infoCPTOwn(int unum, int type) {
        }

        public void infoCPTOther(int unum) {
        }

        public void infoPlayerParam(double allowMultDefaultType, double dashPowerRateDeltaMax, double dashPowerRateDeltaMin, double effortMaxDeltaFactor, double effortMinDeltaFactor, double extraStaminaDeltaMax, double extraStaminaDeltaMin, double inertiaMomentDeltaFactor, double kickRandDeltaFactor, double kickableMarginDeltaMax, double kickableMarginDeltaMin, double newDashPowerRateDeltaMax, double newDashPowerRateDeltaMin, double newStaminaIncMaxDeltaFactor, double playerDecayDeltaMax, double playerDecayDeltaMin, double playerTypes, double ptMax, double randomSeed, double staminaIncMaxDeltaFactor, double subsMax) {
        }

        public void infoServerParam(HashMap<ServerParams, Object> info) {
        }

        public void setCoach(ActionsCoach c) {
        }

        public ActionsCoach getCoach() {
            return null;
        }
    }

}