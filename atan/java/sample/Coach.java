package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ActionsCoach;
import atan.model.ControllerCoach;
import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.Warning;

import org.apache.log4j.Logger;

/**
 *
 * @author Atan
 */
public class Coach implements ControllerCoach {
    private static Logger log = Logger.getLogger(Coach.class);
    private ActionsCoach  coach;

    /**
     *
     * @param error
     */
    @Override
    public void infoHearError(Errors error) {
        log.error(error);
    }

    /**
     *
     * @param ok
     */
    @Override
    public void infoHearOk(Ok ok) {
        log.info(ok);
    }

    /**
     *
     * @param playMode
     */
    @Override
    public void infoHearPlayMode(PlayMode playMode) {
        log.info(playMode);
    }

    /**
     *
     * @param direction
     * @param message
     */
    @Override
    public void infoHearPlayer(double direction, String message) {
        log.info(message + "from " + direction);
    }

    /**
     *
     * @param refereeMessage
     */
    @Override
    public void infoHearReferee(RefereeMessage refereeMessage) {
        log.info(refereeMessage);
    }

    /**
     *
     * @param warning
     */
    @Override
    public void infoHearWarning(Warning warning) {
        log.warn(warning);
    }

    /**
     *
     */
    @Override
    public void infoServerParam() {
        log.info("server param");
    }

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
                               double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin,
                               double kickRand, double extraStamina, double effortMax, double effortMin) {
        log.info("player type");
    }

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
     *
     * @param unum
     */
    @Override
    public void infoCPTOther(int unum) {
        log.info("change player type other");
    }

    /**
     *
     * @param unum
     * @param type
     */
    @Override
    public void infoCPTOwn(int unum, int type) {
        log.info("change player type own");
    }
}
