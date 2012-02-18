package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ActionsCoach;
import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.enums.Errors;
import com.github.robocup_atan.atan.model.enums.Ok;
import com.github.robocup_atan.atan.model.enums.PlayMode;
import com.github.robocup_atan.atan.model.enums.RefereeMessage;
import com.github.robocup_atan.atan.model.enums.ServerParams;
import com.github.robocup_atan.atan.model.enums.Warning;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashMap;

/**
 * <p>ControllerCoachTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class ControllerCoachTest {

    /**
     * <p>Constructor for ControllerCoachTest.</p>
     */
    public ControllerCoachTest() {}

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
     * Test of infoSeePlayerOwn method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeePlayerOwn() {
        System.out.println("infoSeePlayerOwn");
        int             number    = 0;
        boolean         goalie    = false;
        double          x         = 0.0;
        double          y         = 0.0;
        double          deltaX    = 0.0;
        double          deltaY    = 0.0;
        double          bodyAngle = 0.0;
        double          neckAngle = 0.0;
        ControllerCoach instance  = new ControllerCoachImpl();
        instance.infoSeePlayerOwn(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of infoSeePlayerOther method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeePlayerOther() {
        System.out.println("infoSeePlayerOther");
        int             number    = 0;
        boolean         goalie    = false;
        double          x         = 0.0;
        double          y         = 0.0;
        double          deltaX    = 0.0;
        double          deltaY    = 0.0;
        double          bodyAngle = 0.0;
        double          neckAngle = 0.0;
        ControllerCoach instance  = new ControllerCoachImpl();
        instance.infoSeePlayerOther(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * Test of infoSeeGoalOwn method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeeGoalOwn() {
        System.out.println("infoSeeGoalOwn");
        double          x        = 0.0;
        double          y        = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeeGoalOwn(x, y);
    }

    /**
     * Test of infoSeeGoalOther method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeeGoalOther() {
        System.out.println("infoSeeGoalOther");
        double          x        = 0.0;
        double          y        = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeeGoalOther(x, y);
    }

    /**
     * Test of infoSeeBall method, of class ControllerCoach.
     */
    @Test
    public void testInfoSeeBall() {
        System.out.println("infoSeeBall");
        double          x        = 0.0;
        double          y        = 0.0;
        double          deltaX   = 0.0;
        double          deltaY   = 0.0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoSeeBall(x, y, deltaX, deltaY);
    }

    /**
     * Test of infoHearTeamNames method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearTeamNames() {
        System.out.println("infoHearTeamNames");
        String          teamWest = "";
        String          teamEast = "";
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearTeamNames(teamWest, teamEast);
    }

    /**
     * Test of infoHearReferee method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearReferee() {
        System.out.println("infoHearReferee");
        RefereeMessage  refereeMessage = RefereeMessage.FOUL_R;
        ControllerCoach instance       = new ControllerCoachImpl();
        instance.infoHearReferee(refereeMessage);
    }

    /**
     * Test of infoHearPlayMode method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearPlayMode() {
        System.out.println("infoHearPlayMode");
        PlayMode        playMode = PlayMode.CORNER_KICK_OWN;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearPlayMode(playMode);
    }

    /**
     * Test of infoHearPlayer method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearPlayer() {
        System.out.println("infoHearPlayer");
        double          direction = 0.0;
        String          message   = "Test";
        ControllerCoach instance  = new ControllerCoachImpl();
        instance.infoHearPlayer(direction, message);
    }

    /**
     * Test of infoHearError method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearError() {
        System.out.println("infoHearError");
        Errors          error    = Errors.UNKNOWN_COMMAND;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearError(error);
    }

    /**
     * Test of infoHearOk method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearOk() {
        System.out.println("infoHearOk");
        Ok              ok       = Ok.EAR_ON;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearOk(ok);
    }

    /**
     * Test of infoHearWarning method, of class ControllerCoach.
     */
    @Test
    public void testInfoHearWarning() {
        System.out.println("infoHearWarning");
        Warning         warning  = Warning.NO_SUBS_LEFT;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoHearWarning(warning);
    }

    /**
     * Test of infoPlayerType method, of class ControllerCoach.
     */
    @Test
    public void testInfoPlayerType() {
        System.out.println("infoPlayerType");
        int             id             = 0;
        double          playerSpeedMax = 0.0;
        double          staminaIncMax  = 0.0;
        double          playerDecay    = 0.0;
        double          inertiaMoment  = 0.0;
        double          dashPowerRate  = 0.0;
        double          playerSize     = 0.0;
        double          kickableMargin = 0.0;
        double          kickRand       = 0.0;
        double          extraStamina   = 0.0;
        double          effortMax      = 0.0;
        double          effortMin      = 0.0;
        ControllerCoach instance       = new ControllerCoachImpl();
        instance.infoPlayerType(id, playerSpeedMax, staminaIncMax, playerDecay, inertiaMoment, dashPowerRate,
                                playerSize, kickableMargin, kickRand, extraStamina, effortMax, effortMin);
    }

    /**
     * Test of infoCPTOwn method, of class ControllerCoach.
     */
    @Test
    public void testInfoCPTOwn() {
        System.out.println("infoCPTOwn");
        int             unum     = 0;
        int             type     = 0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoCPTOwn(unum, type);
    }

    /**
     * Test of infoCPTOther method, of class ControllerCoach.
     */
    @Test
    public void testInfoCPTOther() {
        System.out.println("infoCPTOther");
        int             unum     = 0;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.infoCPTOther(unum);
    }

    /**
     * Test of infoPlayerParam method, of class ControllerCoach.
     */
    @Test
    public void testInfoPlayerParam() {
        System.out.println("infoPlayerParam");
        double          allowMultDefaultType        = 0.0;
        double          dashPowerRateDeltaMax       = 0.0;
        double          dashPowerRateDeltaMin       = 0.0;
        double          effortMaxDeltaFactor        = 0.0;
        double          effortMinDeltaFactor        = 0.0;
        double          extraStaminaDeltaMax        = 0.0;
        double          extraStaminaDeltaMin        = 0.0;
        double          inertiaMomentDeltaFactor    = 0.0;
        double          kickRandDeltaFactor         = 0.0;
        double          kickableMarginDeltaMax      = 0.0;
        double          kickableMarginDeltaMin      = 0.0;
        double          newDashPowerRateDeltaMax    = 0.0;
        double          newDashPowerRateDeltaMin    = 0.0;
        double          newStaminaIncMaxDeltaFactor = 0.0;
        double          playerDecayDeltaMax         = 0.0;
        double          playerDecayDeltaMin         = 0.0;
        double          playerTypes                 = 0.0;
        double          ptMax                       = 0.0;
        double          randomSeed                  = 0.0;
        double          staminaIncMaxDeltaFactor    = 0.0;
        double          subsMax                     = 0.0;
        ControllerCoach instance                    = new ControllerCoachImpl();
        instance.infoPlayerParam(allowMultDefaultType, dashPowerRateDeltaMax, dashPowerRateDeltaMin,
                                 effortMaxDeltaFactor, effortMinDeltaFactor, extraStaminaDeltaMax,
                                 extraStaminaDeltaMin, inertiaMomentDeltaFactor, kickRandDeltaFactor,
                                 kickableMarginDeltaMax, kickableMarginDeltaMin, newDashPowerRateDeltaMax,
                                 newDashPowerRateDeltaMin, newStaminaIncMaxDeltaFactor, playerDecayDeltaMax,
                                 playerDecayDeltaMin, playerTypes, ptMax, randomSeed, staminaIncMaxDeltaFactor,
                                 subsMax);
    }

    /**
     * Test of infoServerParam method, of class ControllerCoach.
     */
    @Test
    public void testInfoServerParam() {
        System.out.println("infoServerParam");
        HashMap<ServerParams, Object> info     = new HashMap<ServerParams, Object>();
        ControllerCoach               instance = new ControllerCoachImpl();
        instance.infoServerParam(info);
    }

    /**
     * Test of setCoach method, of class ControllerCoach.
     */
    @Test
    public void testSetCoach() {
        System.out.println("setCoach");
        ActionsCoach    c        = null;
        ControllerCoach instance = new ControllerCoachImpl();
        instance.setCoach(c);
    }

    /**
     * Test of getCoach method, of class ControllerCoach.
     */
    @Test
    public void testGetCoach() {
        System.out.println("getCoach");
        ControllerCoach instance  = new ControllerCoachImpl();
        ActionsCoach    expResult = null;
        ActionsCoach    result    = instance.getCoach();
        assertEquals(expResult, result);
    }

    /**
     *
     * @author Atan
     */
    public static class ControllerCoachImpl implements ControllerCoach {

        /**
         *
         * @param number
         * @param goalie
         * @param x
         * @param y
         * @param deltaX
         * @param deltaY
         * @param bodyAngle
         * @param neckAngle
         */
        @Override
        public void infoSeePlayerOwn(int number, boolean goalie, double x, double y, double deltaX, double deltaY,
                                     double bodyAngle, double neckAngle) {}

        /**
         *
         * @param number
         * @param goalie
         * @param x
         * @param y
         * @param deltaX
         * @param deltaY
         * @param bodyAngle
         * @param neckAngle
         */
        @Override
        public void infoSeePlayerOther(int number, boolean goalie, double x, double y, double deltaX, double deltaY,
                                       double bodyAngle, double neckAngle) {}

        /**
         *
         * @param x
         * @param y
         */
        @Override
        public void infoSeeGoalOwn(double x, double y) {}

        /**
         *
         * @param x
         * @param y
         */
        @Override
        public void infoSeeGoalOther(double x, double y) {}

        /**
         *
         * @param x
         * @param y
         * @param deltaX
         * @param deltaY
         */
        @Override
        public void infoSeeBall(double x, double y, double deltaX, double deltaY) {}

        /**
         *
         * @param teamWest
         * @param teamEast
         */
        @Override
        public void infoHearTeamNames(String teamWest, String teamEast) {}

        /**
         *
         * @param refereeMessage
         */
        @Override
        public void infoHearReferee(RefereeMessage refereeMessage) {}

        /**
         *
         * @param playMode
         */
        @Override
        public void infoHearPlayMode(PlayMode playMode) {}

        /**
         *
         * @param direction
         * @param message
         */
        @Override
        public void infoHearPlayer(double direction, String message) {}

        /**
         *
         * @param error
         */
        @Override
        public void infoHearError(Errors error) {}

        /**
         *
         * @param ok
         */
        @Override
        public void infoHearOk(Ok ok) {}

        /**
         *
         * @param warning
         */
        @Override
        public void infoHearWarning(Warning warning) {}

        /**
         *
         * @param id
         * @param playerSpeedMax
         * @param staminaIncMax
         * @param playerDecay
         * @param inertiaMoment
         * @param dashPowerRate
         * @param playerSize
         * @param kickableMargin
         * @param kickRand
         * @param extraStamina
         * @param effortMax
         * @param effortMin
         */
        @Override
        public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay,
                                   double inertiaMoment, double dashPowerRate, double playerSize,
                                   double kickableMargin, double kickRand, double extraStamina, double effortMax,
                                   double effortMin) {}

        /**
         *
         * @param unum
         * @param type
         */
        @Override
        public void infoCPTOwn(int unum, int type) {}

        /**
         *
         * @param unum
         */
        @Override
        public void infoCPTOther(int unum) {}

        /**
         *
         * @param allowMultDefaultType
         * @param dashPowerRateDeltaMax
         * @param dashPowerRateDeltaMin
         * @param effortMaxDeltaFactor
         * @param effortMinDeltaFactor
         * @param extraStaminaDeltaMax
         * @param extraStaminaDeltaMin
         * @param inertiaMomentDeltaFactor
         * @param kickRandDeltaFactor
         * @param kickableMarginDeltaMax
         * @param kickableMarginDeltaMin
         * @param newDashPowerRateDeltaMax
         * @param newDashPowerRateDeltaMin
         * @param newStaminaIncMaxDeltaFactor
         * @param playerDecayDeltaMax
         * @param playerDecayDeltaMin
         * @param playerTypes
         * @param ptMax
         * @param randomSeed
         * @param staminaIncMaxDeltaFactor
         * @param subsMax
         */
        @Override
        public void infoPlayerParam(double allowMultDefaultType, double dashPowerRateDeltaMax,
                                    double dashPowerRateDeltaMin, double effortMaxDeltaFactor,
                                    double effortMinDeltaFactor, double extraStaminaDeltaMax,
                                    double extraStaminaDeltaMin, double inertiaMomentDeltaFactor,
                                    double kickRandDeltaFactor, double kickableMarginDeltaMax,
                                    double kickableMarginDeltaMin, double newDashPowerRateDeltaMax,
                                    double newDashPowerRateDeltaMin, double newStaminaIncMaxDeltaFactor,
                                    double playerDecayDeltaMax, double playerDecayDeltaMin, double playerTypes,
                                    double ptMax, double randomSeed, double staminaIncMaxDeltaFactor, double subsMax) {}

        /**
         *
         * @param info
         */
        @Override
        public void infoServerParam(HashMap<ServerParams, Object> info) {}

        /**
         *
         * @param c
         */
        @Override
        public void setCoach(ActionsCoach c) {}

        /**
         *
         * @return
         */
        @Override
        public ActionsCoach getCoach() {
            return null;
        }
    }
}
