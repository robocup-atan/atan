package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ActionsPlayer;
import atan.model.ControllerPlayer;
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

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashMap;

/**
 * 
 * @author author
 */
public class Silly implements ControllerPlayer {
    private static Logger log         = Logger.getLogger(Silly.class);
    private double        distBall    = 1000;
    private double        minDistLine = 1000;
    private ActionsPlayer player;

    /**
     * @inheritDoc
     */
    @Override
    public void preInfo() {
        distBall    = 1000;
        minDistLine = 1000;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void postInfo() {
        if (distBall < 10) {
            getPlayer().turn(10.0);
            getPlayer().dash(5);
        } else if (minDistLine < 10) {
            getPlayer().turn(-90.0);
        } else {
            getPlayer().dash(50);
        }
        log.info("I am a silly Client");
    }

    /**
     * @inheritDoc
     */
    @Override
    public ActionsPlayer getPlayer() {
        return player;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void setPlayer(ActionsPlayer p) {
        player = p;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeLine(Line line, double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection) {
        if (distance < minDistLine) {
            minDistLine = distance;
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeBall(double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection) {
        distBall = distance;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearReferee(RefereeMessage refereeMessage) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearPlayMode(PlayMode playMode) {
        if (playMode == PlayMode.BEFORE_KICK_OFF) {
            getPlayer().move(-30, 30);
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearPlayer(double direction, String string) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina, double unknown,
                              double effort, double speedAmount, double speedDirection, double headAngle,
                              int kickCount, int dashCount, int turnCount, int sayCount, int turnNeckCount,
                              int catchCount, int moveCount, int changeViewCount) {}

    /**
     * @inheritDoc
     */
    @Override
    public String getType() {
        return "Silly";
    }

    /**
     * @inheritDoc
     */
    @Override
    public void setType(String newType) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearError(Errors error) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearOk(Ok ok) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearWarning(Warning warning) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagRight(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagLeft(Flag flag, double distance, double direction, double distChange, double dirChange,
                                double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                               double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagCenter(Flag flag, double distance, double direction, double distChange, double dirChange,
                                  double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagCornerOther(Flag flag, double distance, double direction, double distChange,
                                       double dirChange, double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction, double distChange,
                                      double dirChange, double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction, double distChange,
            double dirChange, double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                   double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFlagGoalOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeePlayerOther(int number, boolean goalie, double distance, double direction, double distChange,
                                   double dirChange, double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeePlayerOwn(int number, boolean goalie, double distance, double direction, double distChange,
                                 double dirChange, double bodyFacingDirection, double headFacingDirection) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoPlayerParam(double allowMultDefaultType, double dashPowerRateDeltaMax,
                                double dashPowerRateDeltaMin, double effortMaxDeltaFactor, double effortMinDeltaFactor,
                                double extraStaminaDeltaMax, double extraStaminaDeltaMin,
                                double inertiaMomentDeltaFactor, double kickRandDeltaFactor,
                                double kickableMarginDeltaMax, double kickableMarginDeltaMin,
                                double newDashPowerRateDeltaMax, double newDashPowerRateDeltaMin,
                                double newStaminaIncMaxDeltaFactor, double playerDecayDeltaMax,
                                double playerDecayDeltaMin, double playerTypes, double ptMax, double randomSeed,
                                double staminaIncMaxDeltaFactor, double subsMax) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay,
                               double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin,
                               double kickRand, double extraStamina, double effortMax, double effortMin) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoCPTOther(int unum) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoCPTOwn(int unum, int type) {}

    /**
     * @inheritDoc
     */
    @Override
    public void infoServerParam(HashMap<ServerParams, Object> info) {}
}
