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

    /**
     *
     * @param audioCutDist
     * @param autoMode
     * @param backDashRate
     * @param backPasses
     * @param ballAccelMax
     * @param ballDecay
     * @param ballRand
     * @param ballSize
     * @param ballSpeedMax
     * @param ballStuckArea
     * @param ballWeight
     * @param catchBanCycle
     * @param catchProbability
     * @param catchableAreaL
     * @param catchableAreaW
     * @param ckickMargin
     * @param clangAdviceWin
     * @param clangDefineWin
     * @param clangDelWin
     * @param clangInfoWin
     * @param clangMessDelay
     * @param clangMessPerCycle
     * @param clangMetaWin
     * @param clangRuleWin
     * @param clangWinSize
     * @param coach
     * @param coachPort
     * @param coachWReferee
     * @param connectWait
     * @param controlRadius
     * @param dashAngleStep
     * @param dashPowerRate
     * @param dropBallTime
     * @param effortDec
     * @param effortDecThr
     * @param effortInc
     * @param effortIncThr
     * @param effortInit
     * @param effortMin
     * @param extraHalfTime
     * @param extraStamina
     * @param forbidKickOffOffside
     * @param freeKickFaults
     * @param freeformSendPeriod
     * @param freeformWaitPeriod
     * @param fullstateL
     * @param fullstateR
     * @param gameLogCompression
     * @param gameLogDated
     * @param gameLogDir
     * @param gameLogFixed
     * @param gameLogFixedName
     * @param gameLogVersion
     * @param gameLogging
     * @param gameOverWait
     * @param goalWidth
     * @param goalieMaxMoves
     * @param halfTime
     * @param hearDecay
     * @param hearInc
     * @param hearMax
     * @param inertiaMoment
     * @param keepaway
     * @param keepawayLength
     * @param keepawayLogDated
     * @param keepawayLogDir
     * @param keepawayLogFixed
     * @param keepawayLogFixedName
     * @param keepawayLogging
     * @param keepawayStart
     * @param keepawayWidth
     * @param kickOffWait
     * @param kickPowerRate
     * @param kickRand
     * @param kickRandFactorL
     * @param kickRandFactorR
     * @param kickableMargin
     * @param landmarkFile
     * @param logDateFormat
     * @param logTimes
     * @param maxBackTacklePower
     * @param maxDashAngle
     * @param maxDashPower
     * @param maxGoalKicks
     * @param maxTacklePower
     * @param maxmoment
     * @param maxneckang
     * @param maxneckmoment
     * @param maxpower
     * @param minDashAngle
     * @param minDashPower
     * @param minmoment
     * @param minneckang
     * @param minneckmoment
     * @param minpower
     * @param nrExtraHalfs
     * @param nrNormalHalfs
     * @param offsideActiveAreaSize
     * @param offsideKickMargin
     * @param olcoachPort
     * @param oldCoachHear
     * @param penAllowMultKicks
     * @param penBeforeSetupWait
     * @param penCoachMovesPlayers
     * @param penDistX
     * @param penMaxExtraKicks
     * @param penMaxGoalieDistX
     * @param penNrKicks
     * @param penRandomWinner
     * @param penReadyWait
     * @param penSetupWait
     * @param penTakenWait
     * @param penaltyShootOuts
     * @param playerAccelMax
     * @param playerDecay
     * @param playerRand
     * @param playerSize
     * @param playerSpeedMax
     * @param playerSpeedMaxMin
     * @param playerWeight
     * @param pointToBan
     * @param pointToDuration
     * @param port
     * @param prandFactorL
     * @param prandFactorR
     * @param profile
     * @param properGoalKicks
     * @param quantizeStep
     * @param quantizeStepL
     * @param recordMessages
     * @param recoverDec
     * @param recoverDecThr
     * @param recoverInit
     * @param recoverMin
     * @param recvStep
     * @param sayCoachCntMax
     * @param sayCoachMsgSize
     * @param sayMsgSize
     * @param sendComms
     * @param sendStep
     * @param sendViStep
     * @param senseBodyStep
     * @param sideDashRate
     * @param simulatorStep
     * @param slowDownFactor
     * @param slownessOnTopForLeftTeam
     * @param slownessOnTopForRightTeam
     * @param staminaCapacity
     * @param staminaIncMax
     * @param staminaMax
     * @param startGoalL
     * @param startGoalR
     * @param stoppedBallVel
     * @param synchMicroSleep
     * @param synchMode
     * @param synchOffset
     * @param synchSeeOffset
     * @param tackleBackDist
     * @param tackleCycles
     * @param tackleDist
     * @param tackleExponent
     * @param tacklePowerRate
     * @param tackleWidth
     * @param teamActuatorNoise
     * @param teamLStart
     * @param teamRStart
     * @param textLogCompression
     * @param textLogDated
     * @param textLogDir
     * @param textLogFixed
     * @param textLogFixedName
     * @param textLogging
     * @param useOffside
     * @param verbose
     * @param visibleAngle
     * @param visibleDistance
     * @param windAng
     * @param windDir
     * @param windForce
     * @param windNone
     * @param windRand
     * @param windRandom
     */
    @Override
    public void infoServerParam(double audioCutDist, double autoMode, double backDashRate, double backPasses,
                                double ballAccelMax, double ballDecay, double ballRand, double ballSize,
                                double ballSpeedMax, double ballStuckArea, double ballWeight, double catchBanCycle,
                                double catchProbability, double catchableAreaL, double catchableAreaW,
                                double ckickMargin, double clangAdviceWin, double clangDefineWin, double clangDelWin,
                                double clangInfoWin, double clangMessDelay, double clangMessPerCycle,
                                double clangMetaWin, double clangRuleWin, double clangWinSize, double coach,
                                double coachPort, double coachWReferee, double connectWait, double controlRadius,
                                double dashAngleStep, double dashPowerRate, double dropBallTime, double effortDec,
                                double effortDecThr, double effortInc, double effortIncThr, double effortInit,
                                double effortMin, double extraHalfTime, double extraStamina,
                                double forbidKickOffOffside, double freeKickFaults, double freeformSendPeriod,
                                double freeformWaitPeriod, double fullstateL, double fullstateR,
                                double gameLogCompression, double gameLogDated, String gameLogDir, double gameLogFixed,
                                String gameLogFixedName, double gameLogVersion, double gameLogging,
                                double gameOverWait, double goalWidth, double goalieMaxMoves, double halfTime,
                                double hearDecay, double hearInc, double hearMax, double inertiaMoment,
                                double keepaway, double keepawayLength, double keepawayLogDated, String keepawayLogDir,
                                double keepawayLogFixed, String keepawayLogFixedName, double keepawayLogging,
                                double keepawayStart, double keepawayWidth, double kickOffWait, double kickPowerRate,
                                double kickRand, double kickRandFactorL, double kickRandFactorR, double kickableMargin,
                                String landmarkFile, String logDateFormat, double logTimes, double maxBackTacklePower,
                                double maxDashAngle, double maxDashPower, double maxGoalKicks, double maxTacklePower,
                                double maxmoment, double maxneckang, double maxneckmoment, double maxpower,
                                double minDashAngle, double minDashPower, double minmoment, double minneckang,
                                double minneckmoment, double minpower, double nrExtraHalfs, double nrNormalHalfs,
                                double offsideActiveAreaSize, double offsideKickMargin, double olcoachPort,
                                double oldCoachHear, double penAllowMultKicks, double penBeforeSetupWait,
                                double penCoachMovesPlayers, double penDistX, double penMaxExtraKicks,
                                double penMaxGoalieDistX, double penNrKicks, double penRandomWinner,
                                double penReadyWait, double penSetupWait, double penTakenWait, double penaltyShootOuts,
                                double playerAccelMax, double playerDecay, double playerRand, double playerSize,
                                double playerSpeedMax, double playerSpeedMaxMin, double playerWeight,
                                double pointToBan, double pointToDuration, double port, double prandFactorL,
                                double prandFactorR, double profile, double properGoalKicks, double quantizeStep,
                                double quantizeStepL, double recordMessages, double recoverDec, double recoverDecThr,
                                double recoverInit, double recoverMin, double recvStep, double sayCoachCntMax,
                                double sayCoachMsgSize, double sayMsgSize, double sendComms, double sendStep,
                                double sendViStep, double senseBodyStep, double sideDashRate, double simulatorStep,
                                double slowDownFactor, double slownessOnTopForLeftTeam,
                                double slownessOnTopForRightTeam, double staminaCapacity, double staminaIncMax,
                                double staminaMax, double startGoalL, double startGoalR, double stoppedBallVel,
                                double synchMicroSleep, double synchMode, double synchOffset, double synchSeeOffset,
                                double tackleBackDist, double tackleCycles, double tackleDist, double tackleExponent,
                                double tacklePowerRate, double tackleWidth, double teamActuatorNoise,
                                double teamLStart, double teamRStart, double textLogCompression, double textLogDated,
                                double textLogDir, double textLogFixed, double textLogFixedName, double textLogging,
                                double useOffside, double verbose, double visibleAngle, double visibleDistance,
                                double windAng, double windDir, double windForce, double windNone, double windRand,
                                double windRandom) {
        log.info("server param");
    }
}
