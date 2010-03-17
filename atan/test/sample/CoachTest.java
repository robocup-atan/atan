package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ActionsCoach;
import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.ServerParams;
import atan.model.enums.Warning;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashMap;

/**
 *
 * @author Atan
 */
public class CoachTest {

    /**
     *
     */
    public CoachTest() {}

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
     * Test of infoHearError method, of class Coach.
     */
    @Test
    public void testInfoHearError() {
        System.out.println("infoHearError");
        Errors error    = null;
        Coach  instance = new Coach();
        instance.infoHearError(error);
    }

    /**
     * Test of infoHearOk method, of class Coach.
     */
    @Test
    public void testInfoHearOk() {
        System.out.println("infoHearOk");
        Ok    ok       = null;
        Coach instance = new Coach();
        instance.infoHearOk(ok);
    }

    /**
     * Test of infoHearPlayMode method, of class Coach.
     */
    @Test
    public void testInfoHearPlayMode() {
        System.out.println("infoHearPlayMode");
        PlayMode playMode = null;
        Coach    instance = new Coach();
        instance.infoHearPlayMode(playMode);
    }

    /**
     * Test of infoHearPlayer method, of class Coach.
     */
    @Test
    public void testInfoHearPlayer() {
        System.out.println("infoHearPlayer");
        double direction = 0.0;
        String message   = "";
        Coach  instance  = new Coach();
        instance.infoHearPlayer(direction, message);
    }

    /**
     * Test of infoHearReferee method, of class Coach.
     */
    @Test
    public void testInfoHearReferee() {
        System.out.println("infoHearReferee");
        RefereeMessage refereeMessage = null;
        Coach          instance       = new Coach();
        instance.infoHearReferee(refereeMessage);
    }

    /**
     * Test of infoHearWarning method, of class Coach.
     */
    @Test
    public void testInfoHearWarning() {
        System.out.println("infoHearWarning");
        Warning warning  = null;
        Coach   instance = new Coach();
        instance.infoHearWarning(warning);
    }

    /**
     * Test of infoPlayerType method, of class Coach.
     */
    @Test
    public void testInfoPlayerType() {
        System.out.println("infoPlayerType");
        int    id             = 0;
        double playerSpeedMax = 0.0;
        double staminaIncMax  = 0.0;
        double playerDecay    = 0.0;
        double inertiaMoment  = 0.0;
        double dashPowerRate  = 0.0;
        double playerSize     = 0.0;
        double kickableMargin = 0.0;
        double kickRand       = 0.0;
        double extraStamina   = 0.0;
        double effortMax      = 0.0;
        double effortMin      = 0.0;
        Coach  instance       = new Coach();
        instance.infoPlayerType(id, playerSpeedMax, staminaIncMax, playerDecay, inertiaMoment, dashPowerRate,
                                playerSize, kickableMargin, kickRand, extraStamina, effortMax, effortMin);
    }

    /**
     * Test of infoPlayerParam method, of class Coach.
     */
    @Test
    public void testInfoPlayerParam() {
        System.out.println("infoPlayerParam");
        double allowMultDefaultType        = 0.0;
        double dashPowerRateDeltaMax       = 0.0;
        double dashPowerRateDeltaMin       = 0.0;
        double effortMaxDeltaFactor        = 0.0;
        double effortMinDeltaFactor        = 0.0;
        double extraStaminaDeltaMax        = 0.0;
        double extraStaminaDeltaMin        = 0.0;
        double inertiaMomentDeltaFactor    = 0.0;
        double kickRandDeltaFactor         = 0.0;
        double kickableMarginDeltaMax      = 0.0;
        double kickableMarginDeltaMin      = 0.0;
        double newDashPowerRateDeltaMax    = 0.0;
        double newDashPowerRateDeltaMin    = 0.0;
        double newStaminaIncMaxDeltaFactor = 0.0;
        double playerDecayDeltaMax         = 0.0;
        double playerDecayDeltaMin         = 0.0;
        double playerTypes                 = 0.0;
        double ptMax                       = 0.0;
        double randomSeed                  = 0.0;
        double staminaIncMaxDeltaFactor    = 0.0;
        double subsMax                     = 0.0;
        Coach  instance                    = new Coach();
        instance.infoPlayerParam(allowMultDefaultType, dashPowerRateDeltaMax, dashPowerRateDeltaMin,
                                 effortMaxDeltaFactor, effortMinDeltaFactor, extraStaminaDeltaMax,
                                 extraStaminaDeltaMin, inertiaMomentDeltaFactor, kickRandDeltaFactor,
                                 kickableMarginDeltaMax, kickableMarginDeltaMin, newDashPowerRateDeltaMax,
                                 newDashPowerRateDeltaMin, newStaminaIncMaxDeltaFactor, playerDecayDeltaMax,
                                 playerDecayDeltaMin, playerTypes, ptMax, randomSeed, staminaIncMaxDeltaFactor,
                                 subsMax);
    }

    /**
     * Test of infoCPTOther method, of class Coach.
     */
    @Test
    public void testInfoCPTOther() {
        System.out.println("infoCPTOther");
        int   unum     = 0;
        Coach instance = new Coach();
        instance.infoCPTOther(unum);
    }

    /**
     * Test of infoCPTOwn method, of class Coach.
     */
    @Test
    public void testInfoCPTOwn() {
        System.out.println("infoCPTOwn");
        int   unum     = 0;
        int   type     = 0;
        Coach instance = new Coach();
        instance.infoCPTOwn(unum, type);
    }

    /**
     * Test of infoServerParam method, of class Coach.
     */
    @Test
    public void testInfoServerParam() {
        System.out.println("infoServerParam");
        HashMap<ServerParams, Object> info     = null;
        Coach                         instance = new Coach();
        instance.infoServerParam(info);
    }

    /**
     * Test of infoSeeBall method, of class Coach.
     */
    @Test
    public void testInfoSeeBall() {
        System.out.println("infoSeeBall");
        double x        = 0.0;
        double y        = 0.0;
        double deltaX   = 0.0;
        double deltaY   = 0.0;
        Coach  instance = new Coach();
        instance.infoSeeBall(x, y, deltaX, deltaY);
    }

    /**
     * Test of infoSeePlayerOther method, of class Coach.
     */
    @Test
    public void testInfoSeePlayerOther() {
        System.out.println("infoSeePlayerOther");
        int     number    = 0;
        boolean goalie    = false;
        double  x         = 0.0;
        double  y         = 0.0;
        double  deltaX    = 0.0;
        double  deltaY    = 0.0;
        double  bodyAngle = 0.0;
        double  neckAngle = 0.0;
        Coach   instance  = new Coach();
        instance.infoSeePlayerOther(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of infoSeePlayerOwn method, of class Coach.
     */
    @Test
    public void testInfoSeePlayerOwn() {
        System.out.println("infoSeePlayerOwn");
        int     number    = 0;
        boolean goalie    = false;
        double  x         = 0.0;
        double  y         = 0.0;
        double  deltaX    = 0.0;
        double  deltaY    = 0.0;
        double  bodyAngle = 0.0;
        double  neckAngle = 0.0;
        Coach   instance  = new Coach();
        instance.infoSeePlayerOwn(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of setCoach method, of class Coach.
     */
    @Test
    public void testSetCoach() {
        System.out.println("setCoach");
        ActionsCoach c        = null;
        Coach        instance = new Coach();
        instance.setCoach(c);
    }

    /**
     * Test of getCoach method, of class Coach.
     */
    @Test
    public void testGetCoach() {
        System.out.println("getCoach");
        Coach        instance  = new Coach();
        ActionsCoach expResult = null;
        ActionsCoach result    = instance.getCoach();
        assertEquals(expResult, result);
    }

    /**
     * Test of infoSeeGoalOther method, of class Coach.
     */
    @Test
    public void testInfoSeeGoalOther() {
        System.out.println("infoSeeGoalOther");
        double x        = 0.0;
        double y        = 0.0;
        Coach  instance = new Coach();
        instance.infoSeeGoalOther(x, y);
    }

    /**
     * Test of infoSeeGoalOwn method, of class Coach.
     */
    @Test
    public void testInfoSeeGoalOwn() {
        System.out.println("infoSeeGoalOwn");
        double x        = 0.0;
        double y        = 0.0;
        Coach  instance = new Coach();
        instance.infoSeeGoalOwn(x, y);
    }

    /**
     * Test of infoHearTeamNames method, of class Coach.
     */
    @Test
    public void testInfoHearTeamNames() {
        System.out.println("infoHearTeamNames");
        String teamWest = "";
        String teamEast = "";
        Coach  instance = new Coach();
        instance.infoHearTeamNames(teamWest, teamEast);
    }
}
