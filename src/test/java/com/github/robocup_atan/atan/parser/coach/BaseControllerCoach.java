package com.github.robocup_atan.atan.parser.coach;

import com.github.robocup_atan.atan.model.ActionsCoach;
import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.enums.*;
import java.util.HashMap;

public class BaseControllerCoach implements ControllerCoach {

    public void infoSeePlayerOwn(int number, boolean goalie, double x, double y, double deltaX, double deltaY, double bodyAngle, double neckAngle) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoSeePlayerOther(int number, boolean goalie, double x, double y, double deltaX, double deltaY, double bodyAngle, double neckAngle) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoSeeGoalOwn(double x, double y) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoSeeGoalOther(double x, double y) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoSeeBall(double x, double y, double deltaX, double deltaY) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearTeamNames(String teamWest, String teamEast) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearReferee(RefereeMessage refereeMessage) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearPlayMode(PlayMode playMode) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearPlayer(double direction, String message) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearError(Errors error) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearOk(Ok ok) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearWarning(Warning warning) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoPlayerType(int id, double playerSpeedMax, double staminaIncMax, double playerDecay, double inertiaMoment, double dashPowerRate, double playerSize, double kickableMargin, double kickRand, double extraStamina, double effortMax, double effortMin) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoCPTOwn(int unum, int type) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoCPTOther(int unum) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoPlayerParam(double allowMultDefaultType, double dashPowerRateDeltaMax, double dashPowerRateDeltaMin, double effortMaxDeltaFactor, double effortMinDeltaFactor, double extraStaminaDeltaMax, double extraStaminaDeltaMin, double inertiaMomentDeltaFactor, double kickRandDeltaFactor, double kickableMarginDeltaMax, double kickableMarginDeltaMin, double newDashPowerRateDeltaMax, double newDashPowerRateDeltaMin, double newStaminaIncMaxDeltaFactor, double playerDecayDeltaMax, double playerDecayDeltaMin, double playerTypes, double ptMax, double randomSeed, double staminaIncMaxDeltaFactor, double subsMax) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoServerParam(HashMap<ServerParams, Object> info) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void setCoach(ActionsCoach c) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public ActionsCoach getCoach() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }
}
