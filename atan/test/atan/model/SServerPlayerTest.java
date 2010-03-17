package atan.model;

//~--- non-JDK imports --------------------------------------------------------

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
public class SServerPlayerTest {
    private SServerPlayer sserverPlayerTest;

    /**
     *
     */
    public SServerPlayerTest() {}

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
        sserverPlayerTest = new SServerPlayerImpl();
    }

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of getInitMessage method, of class SServerPlayer.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = null;
        String        result    = instance.getInitMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of connect method, of class SServerPlayer.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        String        version  = "13";
        boolean       isGoalie = false;
        SServerPlayer instance = sserverPlayerTest;
        instance.connect(version, isGoalie);
    }

    /**
     * Test of start method, of class SServerPlayer.
     */
    @Test(expected = Error.class)
    public void testStart() {
        System.out.println("start");
        SServerPlayer instance = sserverPlayerTest;
        instance.start();
    }

    /**
     * Test of received method, of class SServerPlayer.
     * @throws Exception
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String        msg      = "";
        SServerPlayer instance = sserverPlayerTest;
        instance.received(msg);
    }

    /**
     * Test of setTeamEast method, of class SServerPlayer.
     */
    @Test
    public void testSetTeamEast() {
        System.out.println("setTeamEast");
        boolean       is       = false;
        SServerPlayer instance = sserverPlayerTest;
        instance.setTeamEast(is);
    }

    /**
     * Test of dash method, of class SServerPlayer.
     */
    @Test
    public void testDash() {
        System.out.println("dash");
        int           power    = 0;
        SServerPlayer instance = sserverPlayerTest;
        instance.dash(power);
    }

    /**
     * Test of kick method, of class SServerPlayer.
     */
    @Test
    public void testKick() {
        System.out.println("kick");
        int           power     = 0;
        double        direction = 0.0;
        SServerPlayer instance  = sserverPlayerTest;
        instance.kick(power, direction);
    }

    /**
     * Test of move method, of class SServerPlayer.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        int           x        = 0;
        int           y        = 0;
        SServerPlayer instance = sserverPlayerTest;
        instance.move(x, y);
    }

    /**
     * Test of say method, of class SServerPlayer.
     */
    @Test
    public void testSay() {
        System.out.println("say");
        String        message  = "";
        SServerPlayer instance = sserverPlayerTest;
        instance.say(message);
    }

    /**
     * Test of turn method, of class SServerPlayer.
     */
    @Test
    public void testTurn() {
        System.out.println("turn");
        double        angle    = 0.0;
        SServerPlayer instance = sserverPlayerTest;
        instance.turn(angle);
    }

    /**
     * Test of turnNeck method, of class SServerPlayer.
     */
    @Test
    public void testTurnNeck() {
        System.out.println("turnNeck");
        double        angle    = 0.0;
        SServerPlayer instance = sserverPlayerTest;
        instance.turnNeck(angle);
    }

    /**
     * Test of catchBall method, of class SServerPlayer.
     */
    @Test
    public void testCatchBall() {
        System.out.println("catchBall");
        double        direction = 0.0;
        SServerPlayer instance  = sserverPlayerTest;
        instance.catchBall(direction);
    }

    /**
     * Test of changeViewMode method, of class SServerPlayer.
     */
    @Test
    public void testChangeViewMode() {
        System.out.println("changeViewMode");
        ViewQuality   quality  = ViewQuality.HIGH;
        ViewAngle     angle    = ViewAngle.NORMAL;
        SServerPlayer instance = sserverPlayerTest;
        instance.changeViewMode(quality, angle);
    }

    /**
     * Test of bye method, of class SServerPlayer.
     */
    @Test
    public void testBye() {
        System.out.println("bye");
        SServerPlayer instance = sserverPlayerTest;
        instance.bye();
    }

    /**
     * Test of getTeamName method, of class SServerPlayer.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "TestTeam";
        String        result    = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class SServerPlayer.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int           num      = 0;
        SServerPlayer instance = sserverPlayerTest;
        instance.setNumber(num);
    }

    /**
     * Test of getNumber method, of class SServerPlayer.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        SServerPlayer instance  = sserverPlayerTest;
        int           expResult = -1;
        int           result    = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of isTeamEast method, of class SServerPlayer.
     */
    @Test
    public void testIsTeamEast() {
        System.out.println("isTeamEast");
        SServerPlayer instance  = sserverPlayerTest;
        boolean       expResult = false;
        boolean       result    = instance.isTeamEast();
        assertEquals(expResult, result);
    }

    /**
     * Test of toListString method, of class SServerPlayer.
     */
    @Test
    public void testToListString() {
        System.out.println("toListString");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "atan.model.SServerPlayerTest$ControllerPlayerImpl";
        String        result    = instance.toListString();
        assertEquals(expResult, result);
    }

    /**
     * Test of toStateString method, of class SServerPlayer.
     */
    @Test
    public void testToStateString() {
        System.out.println("toStateString");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "Host: localhost:6000\nTeam Name: TestTeam\nNumber: -1\nRunning: false"
                                  + "\nControllerPlayer Class: atan.model.SServerPlayerTest$ControllerPlayerImpl\n";
        String result = instance.toStateString();
        assertEquals(expResult, result);
    }

    /**
     * Test of handleError method, of class SServerPlayer.
     */
    @Test
    public void testHandleError() {
        System.out.println("handleError");
        String        error    = "";
        SServerPlayer instance = sserverPlayerTest;
        instance.handleError(error);
    }

    /**
     * Test of getDescription method, of class SServerPlayer.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        SServerPlayer instance  = sserverPlayerTest;
        String        expResult = "TestTeam <undefined>";
        String        result    = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     *
     *     @author Atan
     */
    public static class ControllerPlayerImpl implements ControllerPlayer {
        private ActionsPlayer aPlayer;
        private String        type;

        /**
         *
         */
        @Override
        public void preInfo() {}

        /**
         *
         */
        @Override
        public void postInfo() {}

        /**
         *
         * @return
         */
        @Override
        public ActionsPlayer getPlayer() {
            return aPlayer;
        }

        /**
         *
         * @param c
         */
        @Override
        public void setPlayer(ActionsPlayer c) {
            aPlayer = c;
        }

        /**
         *
         * @return
         */
        @Override
        public String getType() {
            return type;
        }

        /**
         *
         * @param newType
         */
        @Override
        public void setType(String newType) {
            type = newType;
        }

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagRight(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagLeft(Flag flag, double distance, double direction, double distChange, double dirChange,
                                    double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                   double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagCenter(Flag flag, double distance, double direction, double distChange,
                                      double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction, double distChange,
                                         double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagCornerOther(Flag flag, double distance, double direction, double distChange,
                                           double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction, double distChange,
                                          double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction, double distChange,
                double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction, double distChange,
                                       double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param flag
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeFlagGoalOther(Flag flag, double distance, double direction, double distChange,
                                         double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param line
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeLine(Line line, double distance, double direction, double distChange, double dirChange,
                                double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param number
         * @param goalie
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeePlayerOther(int number, boolean goalie, double distance, double direction,
                                       double distChange, double dirChange, double bodyFacingDirection,
                                       double headFacingDirection) {}

        /**
         *
         * @param number
         * @param goalie
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeePlayerOwn(int number, boolean goalie, double distance, double direction, double distChange,
                                     double dirChange, double bodyFacingDirection, double headFacingDirection) {}

        /**
         *
         * @param distance
         * @param direction
         * @param distChange
         * @param dirChange
         * @param bodyFacingDirection
         * @param headFacingDirection
         */
        @Override
        public void infoSeeBall(double distance, double direction, double distChange, double dirChange,
                                double bodyFacingDirection, double headFacingDirection) {}

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
         * @param viewQuality
         * @param viewAngle
         * @param stamina
         * @param unknown
         * @param effort
         * @param speedAmount
         * @param speedDirection
         * @param headAngle
         * @param kickCount
         * @param dashCount
         * @param turnCount
         * @param sayCount
         * @param turnNeckCount
         * @param catchCount
         * @param moveCount
         * @param changeViewCount
         */
        @Override
        public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina, double unknown,
                                  double effort, double speedAmount, double speedDirection, double headAngle,
                                  int kickCount, int dashCount, int turnCount, int sayCount, int turnNeckCount,
                                  int catchCount, int moveCount, int changeViewCount) {}

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
    }

    /**
     *
     * @author author
     */
    public static class SServerPlayerImpl extends SServerPlayer {

        /**
         *
         */
        public SServerPlayerImpl() {
            super("TestTeam", new ControllerPlayerImpl());
        }
    }
}
