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
public class ControllerPlayerTest {
    private ControllerPlayer  conPlayer;
    private ActionsPlayerImpl testPlayer;

    /**
     *
     */
    public ControllerPlayerTest() {}

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
        testPlayer = new ActionsPlayerImpl();
        conPlayer  = new ControllerPlayerImpl();
    }

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of preInfo method, of class ControllerPlayer.
     */
    @Test
    public void testPreInfo() {
        System.out.println("preInfo");
        ControllerPlayer instance = conPlayer;
        instance.preInfo();
    }

    /**
     * Test of postInfo method, of class ControllerPlayer.
     */
    @Test
    public void testPostInfo() {
        System.out.println("postInfo");
        ControllerPlayer instance = conPlayer;
        instance.postInfo();
    }

    /**
     * Test of setPlayer method, of class ControllerPlayer.
     */
    @Test
    public void testSetPlayer() {
        System.out.println("setPlayer");
        ActionsPlayer    c        = null;
        ControllerPlayer instance = conPlayer;
        instance.setPlayer(c);
    }

    /**
     * Test of getPlayer method, of class ControllerPlayer.
     */
    @Test
    public void testGetPlayer() {
        System.out.println("getPlayer");
        ControllerPlayer instance  = conPlayer;
        ActionsPlayer    expResult = null;
        ActionsPlayer    result    = instance.getPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setType method, of class ControllerPlayer.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String           newType  = "";
        ControllerPlayer instance = conPlayer;
        instance.setType(newType);
    }

    /**
     * Test of getType method, of class ControllerPlayer.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        ControllerPlayer instance  = conPlayer;
        String           expResult = null;
        String           result    = instance.getType();
        assertEquals(expResult, result);
    }

    /**
     * Test of infoSeeFlagRight method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagRight() {
        System.out.println("infoSeeFlagRight");
        Flag             flag                = Flag.RIGHT;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagRight(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                  headFacingDirection);
    }

    /**
     * Test of infoSeeFlagLeft method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagLeft() {
        System.out.println("infoSeeFlagLeft");
        Flag             flag                = Flag.LEFT;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagLeft(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                 headFacingDirection);
    }

    /**
     * Test of infoSeeFlagOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagOwn() {
        System.out.println("infoSeeFlagOwn");
        Flag             flag                = Flag.OWN_10;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                headFacingDirection);
    }

    /**
     * Test of infoSeeFlagOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagOther() {
        System.out.println("infoSeeFlagOther");
        Flag             flag                = Flag.OTHER_10;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                  headFacingDirection);
    }

    /**
     * Test of infoSeeFlagCenter method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagCenter() {
        System.out.println("infoSeeFlagCenter");
        Flag             flag                = Flag.CENTER;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagCenter(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                   headFacingDirection);
    }

    /**
     * Test of infoSeeFlagCornerOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagCornerOwn() {
        System.out.println("infoSeeFlagCornerOwn");
        Flag             flag                = Flag.LEFT;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagCornerOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                      headFacingDirection);
    }

    /**
     * Test of infoSeeFlagCornerOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagCornerOther() {
        System.out.println("infoSeeFlagCornerOther");
        Flag             flag                = Flag.RIGHT;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagCornerOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                        headFacingDirection);
    }

    /**
     * Test of infoSeeFlagPenaltyOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagPenaltyOwn() {
        System.out.println("infoSeeFlagPenaltyOwn");
        Flag             flag                = Flag.LEFT;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagPenaltyOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
    }

    /**
     * Test of infoSeeFlagPenaltyOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagPenaltyOther() {
        System.out.println("infoSeeFlagPenaltyOther");
        Flag             flag                = Flag.RIGHT;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagPenaltyOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                         headFacingDirection);
    }

    /**
     * Test of infoSeeFlagGoalOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagGoalOwn() {
        System.out.println("infoSeeFlagGoalOwn");
        Flag             flag                = Flag.CENTER;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagGoalOwn(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                    headFacingDirection);
    }

    /**
     * Test of infoSeeFlagGoalOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeFlagGoalOther() {
        System.out.println("infoSeeFlagGoalOther");
        Flag             flag                = Flag.RIGHT;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeFlagGoalOther(flag, distance, direction, distChange, dirChange, bodyFacingDirection,
                                      headFacingDirection);
    }

    /**
     * Test of infoSeeLine method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeLine() {
        System.out.println("infoSeeLine");
        Line             line                = Line.CENTER;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeLine(line, distance, direction, distChange, dirChange, bodyFacingDirection,
                             headFacingDirection);
    }

    /**
     * Test of infoSeePlayerOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeePlayerOther() {
        System.out.println("infoSeePlayerOther");
        int              number              = 0;
        boolean          goalie              = false;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeePlayerOther(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection,
                                    headFacingDirection);
    }

    /**
     * Test of infoSeePlayerOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeePlayerOwn() {
        System.out.println("infoSeePlayerOwn");
        int              number              = 0;
        boolean          goalie              = false;
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeePlayerOwn(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection,
                                  headFacingDirection);
    }

    /**
     * Test of infoSeeBall method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSeeBall() {
        System.out.println("infoSeeBall");
        double           distance            = 0.0;
        double           direction           = 0.0;
        double           distChange          = 0.0;
        double           dirChange           = 0.0;
        double           bodyFacingDirection = 0.0;
        double           headFacingDirection = 0.0;
        ControllerPlayer instance            = conPlayer;
        instance.infoSeeBall(distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
    }

    /**
     * Test of infoHearReferee method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearReferee() {
        System.out.println("infoHearReferee");
        RefereeMessage   refereeMessage = RefereeMessage.DROP_BALL;
        ControllerPlayer instance       = conPlayer;
        instance.infoHearReferee(refereeMessage);
    }

    /**
     * Test of infoHearPlayMode method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearPlayMode() {
        System.out.println("infoHearPlayMode");
        PlayMode         playMode = PlayMode.KICK_OFF_L;
        ControllerPlayer instance = conPlayer;
        instance.infoHearPlayMode(playMode);
    }

    /**
     * Test of infoHearPlayer method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearPlayer() {
        System.out.println("infoHearPlayer");
        double           direction = 0.0;
        String           message   = "Test";
        ControllerPlayer instance  = conPlayer;
        instance.infoHearPlayer(direction, message);
    }

    /**
     * Test of infoHearError method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearError() {
        System.out.println("infoHearError");
        Errors           error    = Errors.NO_MORE_TEAM_OR_PLAYER_OR_GOALIE;
        ControllerPlayer instance = conPlayer;
        instance.infoHearError(error);
    }

    /**
     * Test of infoHearOk method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearOk() {
        System.out.println("infoHearOk");
        Ok               ok       = Ok.SAY;
        ControllerPlayer instance = conPlayer;
        instance.infoHearOk(ok);
    }

    /**
     * Test of infoHearWarning method, of class ControllerPlayer.
     */
    @Test
    public void testInfoHearWarning() {
        System.out.println("infoHearWarning");
        Warning          warning  = Warning.CANNOT_CHANGE_GOALIE;
        ControllerPlayer instance = conPlayer;
        instance.infoHearWarning(warning);
    }

    /**
     * Test of infoSenseBody method, of class ControllerPlayer.
     */
    @Test
    public void testInfoSenseBody() {
        System.out.println("infoSenseBody");
        ViewQuality      viewQuality     = ViewQuality.HIGH;
        ViewAngle        viewAngle       = ViewAngle.NARROW;
        double           stamina         = 0.0;
        double           unknown         = 0.0;
        double           effort          = 0.0;
        double           speedAmount     = 0.0;
        double           speedDirection  = 0.0;
        double           headAngle       = 0.0;
        int              kickCount       = 0;
        int              dashCount       = 0;
        int              turnCount       = 0;
        int              sayCount        = 0;
        int              turnNeckCount   = 0;
        int              catchCount      = 0;
        int              moveCount       = 0;
        int              changeViewCount = 0;
        ControllerPlayer instance        = conPlayer;
        instance.infoSenseBody(viewQuality, viewAngle, stamina, unknown, effort, speedAmount, speedDirection,
                               headAngle, kickCount, dashCount, turnCount, sayCount, turnNeckCount, catchCount,
                               moveCount, changeViewCount);
    }

    /**
     * Test of infoCPTOwn method, of class ControllerPlayer.
     */
    @Test
    public void testInfoCPTOwn() {
        System.out.println("infoCPTOwn");
        int              unum     = 0;
        int              type     = 0;
        ControllerPlayer instance = conPlayer;
        instance.infoCPTOwn(unum, type);
    }

    /**
     * Test of infoCPTOther method, of class ControllerPlayer.
     */
    @Test
    public void testInfoCPTOther() {
        System.out.println("infoCPTOther");
        int              unum     = 0;
        ControllerPlayer instance = conPlayer;
        instance.infoCPTOther(unum);
    }

    /**
     * Test of infoPlayerType method, of class ControllerPlayer.
     */
    @Test
    public void testInfoPlayerType() {
        System.out.println("infoPlayerType");
        int              id             = 0;
        double           playerSpeedMax = 0.0;
        double           staminaIncMax  = 0.0;
        double           playerDecay    = 0.0;
        double           inertiaMoment  = 0.0;
        double           dashPowerRate  = 0.0;
        double           playerSize     = 0.0;
        double           kickableMargin = 0.0;
        double           kickRand       = 0.0;
        double           extraStamina   = 0.0;
        double           effortMax      = 0.0;
        double           effortMin      = 0.0;
        ControllerPlayer instance       = conPlayer;
        instance.infoPlayerType(id, playerSpeedMax, staminaIncMax, playerDecay, inertiaMoment, dashPowerRate,
                                playerSize, kickableMargin, kickRand, extraStamina, effortMax, effortMin);
    }

    /**
     * Test of infoPlayerParam method, of class ControllerPlayer.
     */
    @Test
    public void testInfoPlayerParam() {
        System.out.println("infoPlayerParam");
        double           allowMultDefaultType        = 0.0;
        double           dashPowerRateDeltaMax       = 0.0;
        double           dashPowerRateDeltaMin       = 0.0;
        double           effortMaxDeltaFactor        = 0.0;
        double           effortMinDeltaFactor        = 0.0;
        double           extraStaminaDeltaMax        = 0.0;
        double           extraStaminaDeltaMin        = 0.0;
        double           inertiaMomentDeltaFactor    = 0.0;
        double           kickRandDeltaFactor         = 0.0;
        double           kickableMarginDeltaMax      = 0.0;
        double           kickableMarginDeltaMin      = 0.0;
        double           newDashPowerRateDeltaMax    = 0.0;
        double           newDashPowerRateDeltaMin    = 0.0;
        double           newStaminaIncMaxDeltaFactor = 0.0;
        double           playerDecayDeltaMax         = 0.0;
        double           playerDecayDeltaMin         = 0.0;
        double           playerTypes                 = 0.0;
        double           ptMax                       = 0.0;
        double           randomSeed                  = 0.0;
        double           staminaIncMaxDeltaFactor    = 0.0;
        double           subsMax                     = 0.0;
        ControllerPlayer instance                    = conPlayer;
        instance.infoPlayerParam(allowMultDefaultType, dashPowerRateDeltaMax, dashPowerRateDeltaMin,
                                 effortMaxDeltaFactor, effortMinDeltaFactor, extraStaminaDeltaMax,
                                 extraStaminaDeltaMin, inertiaMomentDeltaFactor, kickRandDeltaFactor,
                                 kickableMarginDeltaMax, kickableMarginDeltaMin, newDashPowerRateDeltaMax,
                                 newDashPowerRateDeltaMin, newStaminaIncMaxDeltaFactor, playerDecayDeltaMax,
                                 playerDecayDeltaMin, playerTypes, ptMax, randomSeed, staminaIncMaxDeltaFactor,
                                 subsMax);
    }

    /**
     * Test of infoServerParam method, of class ControllerPlayer.
     */
    @Test
    public void testInfoServerParam() {
        System.out.println("infoServerParam");
        HashMap<ServerParams, Object> info     = new HashMap<ServerParams, Object>();
        ControllerPlayer              instance = conPlayer;
        instance.infoServerParam(info);
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

    /**
     *
     * @author Atan
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
}
