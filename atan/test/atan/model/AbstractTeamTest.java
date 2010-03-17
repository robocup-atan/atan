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
import java.util.Properties;

/**
 *
 * @author Atan
 */
public class AbstractTeamTest {
    private ControllerCoachImpl  coachTest;
    private ControllerPlayerImpl playerTest;

    /**
     *
     */
    public AbstractTeamTest() {}

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
        playerTest = new ControllerPlayerImpl();
        coachTest  = new ControllerCoachImpl();
    }

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of getTeamName method, of class AbstractTeam.
     */
    @Test
    public void testGetTeamName() {
        System.out.println("getTeamName");
        AbstractTeam instance  = new AbstractTeamImpl();
        String       expResult = "TestTeam";
        String       result    = instance.getTeamName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProperties method, of class AbstractTeam.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        AbstractTeam instance  = new AbstractTeamImpl();
        Properties   expResult = new Properties();
        Properties   result    = instance.getProperties();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNewControllerPlayer method, of class AbstractTeam.
     */
    @Test
    public void testGetNewControllerPlayer() {
        System.out.println("getNewControllerPlayer");
        int              i         = 0;
        AbstractTeam     instance  = new AbstractTeamImpl();
        ControllerPlayer expResult = playerTest;
        ControllerPlayer result    = instance.getNewControllerPlayer(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNewControllerCoach method, of class AbstractTeam.
     */
    @Test
    public void testGetNewControllerCoach() {
        System.out.println("getNewControllerCoach");
        AbstractTeam    instance  = new AbstractTeamImpl();
        ControllerCoach expResult = coachTest;
        ControllerCoach result    = instance.getNewControllerCoach();
        assertEquals(expResult, result);
    }

    /**
     * Test of createNewPlayers method, of class AbstractTeam.
     */
    @Test
    public void testCreateNewPlayers() {
        System.out.println("createNewPlayers");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.createNewPlayers();
    }

    /**
     * Test of createNewCoach method, of class AbstractTeam.
     */
    @Test
    public void testCreateNewCoach() {
        System.out.println("createNewCoach");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.createNewCoach();
    }

    /**
     * Test of killAll method, of class AbstractTeam.
     */
    @Test
    public void testKillAll() {
        System.out.println("killAll");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.killAll();
    }

    /**
     * Test of connectAll method, of class AbstractTeam.
     */
    @Test
    public void testConnectAll() {
        System.out.println("connectAll");
        AbstractTeam instance = new AbstractTeamImpl();
        instance.connectAll();
    }

    /**
     * Test of connect method, of class AbstractTeam.
     */
    @Test
    public void testConnect() {
        System.out.println("connect");
        int          index    = 0;
        AbstractTeam instance = new AbstractTeamImpl();
        instance.connect(index);
    }

    /**
     * Test of size method, of class AbstractTeam.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        AbstractTeam instance  = new AbstractTeamImpl();
        int          expResult = 11;
        int          result    = instance.size();
        assertEquals(expResult, result);
    }

    /**
     *
     * @author Atan
     */
    public class AbstractTeamImpl extends AbstractTeam {

        /**
         *
         */
        public AbstractTeamImpl() {
            super("TestTeam", 6000, "localhost", true, new Properties());
        }

        /**
         *
         * @param i
         * @return
         */
        @Override
        public ControllerPlayer getNewControllerPlayer(int i) {
            return playerTest;
        }

        /**
         *
         * @return
         */
        @Override
        public ControllerCoach getNewControllerCoach() {
            return coachTest;
        }
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
    public static class ControllerPlayerImpl implements ControllerPlayer {

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
            return null;
        }

        /**
         *
         * @param c
         */
        @Override
        public void setPlayer(ActionsPlayer c) {}

        /**
         *
         * @return
         */
        @Override
        public String getType() {
            return "";
        }

        /**
         *
         * @param newType
         */
        @Override
        public void setType(String newType) {}

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
}
