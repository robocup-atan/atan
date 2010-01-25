package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ActionsPlayer;
import atan.model.ControllerPlayer;
import atan.model.enums.Errors;
import atan.model.enums.Flag;
import atan.model.enums.Line;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;
import atan.model.enums.Warning;

//~--- JDK imports ------------------------------------------------------------

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Atan
 */
public class TestController implements ControllerPlayer {
    @SuppressWarnings("unchecked")
    private Set result = new HashSet();

    /**
     *
     */
    public TestController() {}

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
    @SuppressWarnings("unchecked")
    Set getResult() {
        return result;
    }

    /**
     *
     * @return
     */
    @Override
    public ActionsPlayer getPlayer() {
        return new DummyPlayer();
    }

    /**
     *
     * @param p
     */
    @Override
    public void setPlayer(ActionsPlayer p) {}

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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagRight(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagRight");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagLeft(Flag flag, double distance, double direction, double distChange, double dirChange,
                                double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagLeft");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                               double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagOwn");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                 double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagOther");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagCenter(Flag flag, double distance, double direction, double distChange, double dirChange,
                                  double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagCenter");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagCornerOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagCornerOwn");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagCornerOther(Flag flag, double distance, double direction, double distChange,
                                       double dirChange, double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagCornerOther");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagPenaltyOwn(Flag flag, double distance, double direction, double distChange,
                                      double dirChange, double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagPenaltyOwn");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagPenaltyOther(Flag flag, double distance, double direction, double distChange,
            double dirChange, double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagPenaltyOther");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction, double distChange, double dirChange,
                                   double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagGoalOwn");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeFlagGoalOther(Flag flag, double distance, double direction, double distChange, double dirChange,
                                     double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeFlagGoalOther");
        b.append("|");
        b.append(flag);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeLine(Line line, double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeLine");
        b.append("|");
        b.append(line);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeePlayerOther(int number, boolean goalie, double distance, double direction, double distChange,
                                   double dirChange, double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeePlayerOther");
        b.append("|");
        b.append(number);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeePlayerOwn(int number, boolean goalie, double distance, double direction, double distChange,
                                 double dirChange, double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeePlayerOwn");
        b.append("|");
        b.append(number);
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     *
     * @param distance
     * @param direction
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    @SuppressWarnings("unchecked")
    @Override
    public void infoSeeBall(double distance, double direction, double distChange, double dirChange,
                            double bodyFacingDirection, double headFacingDirection) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSeeBall");
        b.append("|");
        b.append(distance);
        b.append("|");
        b.append(direction);
        result.add(b.toString());
    }

    /**
     *
     * @param message
     */
    @SuppressWarnings("unchecked")
    @Override
    public void infoHearReferee(RefereeMessage message) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoHearReferee");
        b.append("|");
        b.append(message);
        result.add(b.toString());
    }

    /**
     *
     * @param message
     */
    @SuppressWarnings("unchecked")
    @Override
    public void infoHearPlayMode(PlayMode message) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoHearPlayMode");
        b.append("|");
        b.append(message);
        result.add(b.toString());
    }

    /**
     *
     * @param direction
     * @param message
     */
    @SuppressWarnings("unchecked")
    @Override
    public void infoHearPlayer(double direction, String message) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoHear");
        b.append("|");
        b.append(direction);
        b.append("|");
        b.append(message);
        result.add(b.toString());
    }

    /**
     *
     * @param viewQual
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
    @SuppressWarnings("unchecked")
    @Override
    public void infoSenseBody(ViewQuality viewQual, ViewAngle viewAngle, double stamina, double unknown, double effort,
                              double speedAmount, double speedDirection, double headAngle, int kickCount,
                              int dashCount, int turnCount, int sayCount, int turnNeckCount, int catchCount,
                              int moveCount, int changeViewCount) {
        StringBuffer b = new StringBuffer();
        b.append("|");
        b.append("infoSenseBody");
        b.append("|");
        b.append(viewQual);
        b.append("|");
        b.append(viewAngle);
        b.append("|");
        b.append(stamina);
        b.append("|");
        b.append(speedAmount);
        b.append("|");
        b.append(headAngle);
        b.append("|");
        b.append(kickCount);
        b.append("|");
        b.append(dashCount);
        b.append("|");
        b.append(turnCount);
        b.append("|");
        b.append(sayCount);
        b.append("|");
        b.append(turnNeckCount);
        result.add(b.toString());
    }

    /**
     *
     * @return
     */
    @Override
    public String getType() {

        // TODO Auto-generated method stub
        return null;
    }

    /**
     *
     * @param error
     */
    @Override
    public void infoHearError(Errors error) {

        // TODO Auto-generated method stub
    }

    /**
     *
     * @param ok
     */
    @Override
    public void infoHearOk(Ok ok) {

        // TODO Auto-generated method stub
    }

    /**
     *
     * @param warning
     */
    @Override
    public void infoHearWarning(Warning warning) {

        // TODO Auto-generated method stub
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

        // TODO Auto-generated method stub
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

        // TODO Auto-generated method stub
    }

    /**
     *
     * @param newType
     */
    @Override
    public void setType(String newType) {

        // TODO Auto-generated method stub
    }

    /**
     *
     * @param unum
     */
    @Override
    public void infoCPTOther(int unum) {

        // TODO Auto-generated method stub
    }

    /**
     *
     * @param unum
     * @param type
     */
    @Override
    public void infoCPTOwn(int unum, int type) {

        // TODO Auto-generated method stub
    }
}
