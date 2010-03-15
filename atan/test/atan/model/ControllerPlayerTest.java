/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.model;

import atan.model.enums.Errors;
import atan.model.enums.Flag;
import atan.model.enums.Line;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.ServerParams;
import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;
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
public class ControllerPlayerTest {

    public ControllerPlayerTest() {
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
     * Test of preInfo method, of class ControllerPlayer.
     */
    @Test
    public void testPreInfo() {
        System.out.println("preInfo");
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.preInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postInfo method, of class ControllerPlayer.
     */
    @Test
    public void testPostInfo() {
        System.out.println("postInfo");
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.postInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlayer method, of class ControllerPlayer.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        ControllerPlayer instance = new ControllerPlayerImpl();
        ActionsPlayer expResult = null;
        ActionsPlayer result = instance.getPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayer method, of class ControllerPlayer.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        ActionsPlayer c = null;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.setPlayer(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class ControllerPlayer.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        ControllerPlayer instance = new ControllerPlayerImpl();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class ControllerPlayer.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String newType = "";
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.setType(newType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagRight method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagRight() {
        System.out.println("infoSeeFlagRight");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagRight(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagLeft method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagLeft() {
        System.out.println("infoSeeFlagLeft");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagLeft(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagOwn() {
        System.out.println("infoSeeFlagOwn");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagOther() {
        System.out.println("infoSeeFlagOther");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagCenter method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagCenter() {
        System.out.println("infoSeeFlagCenter");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagCenter(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagCornerOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagCornerOwn() {
        System.out.println("infoSeeFlagCornerOwn");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagCornerOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagCornerOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagCornerOther() {
        System.out.println("infoSeeFlagCornerOther");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagCornerOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagPenaltyOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagPenaltyOwn() {
        System.out.println("infoSeeFlagPenaltyOwn");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagPenaltyOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagPenaltyOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagPenaltyOther() {
        System.out.println("infoSeeFlagPenaltyOther");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagPenaltyOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagGoalOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagGoalOwn() {
        System.out.println("infoSeeFlagGoalOwn");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagGoalOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeFlagGoalOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagGoalOther() {
        System.out.println("infoSeeFlagGoalOther");
        Flag flag = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeFlagGoalOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeLine method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeLine() {
        System.out.println("infoSeeLine");
        Line line = null;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeLine(line, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeePlayerOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeePlayerOther() {
        System.out.println("infoSeePlayerOther");
        int number = 0;
        boolean goalie = false;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeePlayerOther(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeePlayerOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeePlayerOwn() {
        System.out.println("infoSeePlayerOwn");
        int number = 0;
        boolean goalie = false;
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeePlayerOwn(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSeeBall method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeBall() {
        System.out.println("infoSeeBall");
        double distance = 0.0;
        double direction = 0.0;
        double distChange = 0.0;
        double dirChange = 0.0;
        double bodyFacingDirection = 0.0;
        double headFacingDirection = 0.0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSeeBall(distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearReferee method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearReferee() {
        System.out.println("infoHearReferee");
        RefereeMessage refereeMessage = null;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoHearReferee(refereeMessage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearPlayMode method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearPlayMode() {
        System.out.println("infoHearPlayMode");
        PlayMode playMode = null;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoHearPlayMode(playMode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearPlayer method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearPlayer() {
        System.out.println("infoHearPlayer");
        double direction = 0.0;
        String message = "";
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoHearPlayer(direction, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearError method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearError() {
        System.out.println("infoHearError");
        Errors error = null;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoHearError(error);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearOk method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearOk() {
        System.out.println("infoHearOk");
        Ok ok = null;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoHearOk(ok);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoHearWarning method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearWarning() {
        System.out.println("infoHearWarning");
        Warning warning = null;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoHearWarning(warning);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoSenseBody method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSenseBody() {
        System.out.println("infoSenseBody");
        ViewQuality viewQuality = null;
        ViewAngle viewAngle = null;
        double stamina = 0.0;
        double unknown = 0.0;
        double effort = 0.0;
        double speedAmount = 0.0;
        double speedDirection = 0.0;
        double headAngle = 0.0;
        int kickCount = 0;
        int dashCount = 0;
        int turnCount = 0;
        int sayCount = 0;
        int turnNeckCount = 0;
        int catchCount = 0;
        int moveCount = 0;
        int changeViewCount = 0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoSenseBody(viewQuality, viewAngle, stamina, unknown, effort, speedAmount, speedDirection, headAngle, kickCount, dashCount, turnCount, sayCount, turnNeckCount, catchCount, moveCount, changeViewCount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoCPTOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoCPTOwn() {
        System.out.println("infoCPTOwn");
        int unum = 0;
        int type = 0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoCPTOwn(unum, type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoCPTOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoCPTOther() {
        System.out.println("infoCPTOther");
        int unum = 0;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoCPTOther(unum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoPlayerType method, of class ControllerPlayer.
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
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoPlayerType(id, playerSpeedMax, staminaIncMax, playerDecay, inertiaMoment, dashPowerRate, playerSize, kickableMargin, kickRand, extraStamina, effortMax, effortMin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoPlayerParam method, of class ControllerPlayer.
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
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoPlayerParam(allowMultDefaultType, dashPowerRateDeltaMax, dashPowerRateDeltaMin, effortMaxDeltaFactor, effortMinDeltaFactor, extraStaminaDeltaMax, extraStaminaDeltaMin, inertiaMomentDeltaFactor, kickRandDeltaFactor, kickableMarginDeltaMax, kickableMarginDeltaMin, newDashPowerRateDeltaMax, newDashPowerRateDeltaMin, newStaminaIncMaxDeltaFactor, playerDecayDeltaMax, playerDecayDeltaMin, playerTypes, ptMax, randomSeed, staminaIncMaxDeltaFactor, subsMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of infoServerParam method, of class ControllerPlayer.
     */
    @Test
    public void testInfoServerParam() {
        System.out.println("infoServerParam");
        HashMap<ServerParams, Object> info = null;
        ControllerPlayer instance = new ControllerPlayerImpl();
        instance.infoServerParam(info);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ControllerPlayerImpl implements ControllerPlayer {

        public void preInfo() {
        }

        public void postInfo() {
        }

        public ActionsPlayer getPlayer() {
            return null;
        }

        public void setPlayer(ActionsPlayer c) {
        }

        public String getType() {
            return "";
        }

        public void setType(String newType) {
        }

        public void infoSeeFlagRight(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagLeft(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagOwn(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagOther(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagCenter(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagCornerOther(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeFlagGoalOther(Flag flag, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeLine(Line line, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeePlayerOther(int number, boolean goalie, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeePlayerOwn(int number, boolean goalie, double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
        }

        public void infoSeeBall(double distance, double direction, double distChange, double dirChange, double bodyFacingDirection, double headFacingDirection) {
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

        public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina, double unknown, double effort, double speedAmount, double speedDirection, double headAngle, int kickCount, int dashCount, int turnCount, int sayCount, int turnNeckCount, int catchCount, int moveCount, int changeViewCount) {
        }

        public void infoCPTOwn(int unum, int type) {
        }

        public void infoCPTOther(int unum) {
        }

        public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay, double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin, double kickRand, double extraStamina, double effortMax, double effortMin) {
        }

        public void infoPlayerParam(double allowMultDefaultType, double dashPowerRateDeltaMax, double dashPowerRateDeltaMin, double effortMaxDeltaFactor, double effortMinDeltaFactor, double extraStaminaDeltaMax, double extraStaminaDeltaMin, double inertiaMomentDeltaFactor, double kickRandDeltaFactor, double kickableMarginDeltaMax, double kickableMarginDeltaMin, double newDashPowerRateDeltaMax, double newDashPowerRateDeltaMin, double newStaminaIncMaxDeltaFactor, double playerDecayDeltaMax, double playerDecayDeltaMin, double playerTypes, double ptMax, double randomSeed, double staminaIncMaxDeltaFactor, double subsMax) {
        }

        public void infoServerParam(HashMap<ServerParams, Object> info) {
        }
    }

}