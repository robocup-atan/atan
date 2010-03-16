//~RoboCup Project - Nick James (nsj3), Daniel Wood (dw224), Stuart Wood (sw262)

package atan.model;

//~--- non-JDK imports --------------------------------------------------------

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
public class SServerCoachTest {
    private SServerCoachImpl testSSCoach;

    /**
     *
     */
    public SServerCoachTest() {}

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
    public void setUp() {
        testSSCoach = new SServerCoachImpl();
    }

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of getInitMessage method, of class SServerCoach.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        SServerCoach instance  = testSSCoach;
        String       expResult = null;
        String       result    = instance.getInitMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of connect method, of class SServerCoach.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        SServerCoach instance = testSSCoach;
        instance.connect();
    }

    /**
     * Test of start method, of class SServerCoach.
     */
    @Test(expected = Error.class)
    public void testStart() {
        System.out.println("start");
        SServerCoach instance = testSSCoach;
        instance.start();
    }

    /**
     * Test of received method, of class SServerCoach.
     * @throws Exception
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String       msg      = "";
        SServerCoach instance = testSSCoach;
        instance.received(msg);
    }

    /**
     * Test of eye method, of class SServerCoach.
     */
    @Test
    public void testEye() {
        System.out.println("eye");
        boolean      eyeOn    = false;
        SServerCoach instance = testSSCoach;
        instance.eye(eyeOn);
    }

    /**
     * Test of look method, of class SServerCoach.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        SServerCoach instance = testSSCoach;
        instance.look();
    }

    /**
     * Test of getTeamNames method, of class SServerCoach.
     */
    @Test
    public void testGetTeamNames() {
        System.out.println("getTeamNames");
        SServerCoach instance = testSSCoach;
        instance.getTeamNames();
    }

    /**
     * Test of changePlayerType method, of class SServerCoach.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testChangePlayerType() {
        System.out.println("changePlayerType");
        int          unum       = 0;
        int          playerType = 0;
        SServerCoach instance   = testSSCoach;
        instance.changePlayerType(unum, playerType);
    }

    /**
     * Test of say method, of class SServerCoach.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String       message  = "";
        SServerCoach instance = testSSCoach;
        instance.say(message);
    }

    /**
     * Test of teamGraphic method, of class SServerCoach.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testTeamGraphic() {
        System.out.println("teamGraphic");
        XPMImage     xpm      = null;
        SServerCoach instance = testSSCoach;
        instance.teamGraphic(xpm);
    }

    /**
     * Test of bye method, of class SServerCoach.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerCoach instance = testSSCoach;
        instance.bye();
    }

    /**
     * Test of handleError method, of class SServerCoach.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String       error    = "";
        SServerCoach instance = testSSCoach;
        instance.handleError(error);
    }

    /**
     * Test of isTeamEast method, of class SServerCoach.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        SServerCoach instance  = testSSCoach;
        boolean      expResult = false;
        boolean      result    = instance.isTeamEast();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTeamEast method, of class SServerCoach.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean      is       = false;
        SServerCoach instance = testSSCoach;
        instance.setTeamEast(is);
    }

    /**
     * Test of getTeamName method, of class SServerCoach.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        SServerCoach instance  = testSSCoach;
        String       expResult = "TestTeam";
        String       result    = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     *
     *     @author Atan
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

    /**
     *
     * @author Atan
     */
    public static class SServerCoachImpl extends SServerCoach {

        /**
         *
         */
        public SServerCoachImpl() {
            super("TestTeam", new ControllerCoachImpl());
        }
    }
}
