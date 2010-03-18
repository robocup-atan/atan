package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ActionsCoach;
import atan.model.ControllerCoach;
import atan.model.XPMImage;
import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.ServerParams;
import atan.model.enums.Warning;

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashMap;

/**
 * @author Atan
 */
public class Coach implements ControllerCoach {
    private static Logger log = Logger.getLogger(Coach.class);
    private ActionsCoach  coach;

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearError(Errors error) {
        log.error(error);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearOk(Ok ok) {
        log.info(ok);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearPlayMode(PlayMode playMode) {
        log.info(playMode);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearPlayer(double direction, String message) {
        log.info(message + "from " + direction);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearReferee(RefereeMessage refereeMessage) {
        log.info(refereeMessage);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearWarning(Warning warning) {
        log.warn(warning);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay,
                               double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin,
                               double kickRand, double extraStamina, double effortMax, double effortMin) {
        log.info("player type");
    }

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
                                double staminaIncMaxDeltaFactor, double subsMax) {
        log.info("player param");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoCPTOther(int unum) {
        log.info("change player type other");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoCPTOwn(int unum, int type) {
        log.info("change player type own");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoServerParam(HashMap<ServerParams, Object> info) {
        log.info("server param");
        XPMImage xpm = new XPMImage();
        coach.teamGraphic(xpm);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeBall(double x, double y, double deltaX, double deltaY) {
        log.info("see ball");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeePlayerOther(int number, boolean goalie, double x, double y, double deltaX, double deltaY,
                                   double bodyAngle, double neckAngle) {
        log.info("see player other");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeePlayerOwn(int number, boolean goalie, double x, double y, double deltaX, double deltaY,
                                 double bodyAngle, double neckAngle) {
        log.info("see player own");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void setCoach(ActionsCoach c) {
        coach = c;
    }

    /**
     * @inheritDoc
     */
    @Override
    public ActionsCoach getCoach() {
        return coach;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeGoalOther(double x, double y) {
        log.info("see goal other");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeGoalOwn(double x, double y) {
        log.info("see goal own");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoHearTeamNames(String teamWest, String teamEast) {
        log.info("Team names" + teamWest + " " + teamEast);
    }
}
