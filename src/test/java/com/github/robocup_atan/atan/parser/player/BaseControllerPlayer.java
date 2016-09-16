package com.github.robocup_atan.atan.parser.player;

import com.github.robocup_atan.atan.model.ActionsPlayer;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.enums.*;
import java.util.HashMap;

public class BaseControllerPlayer implements ControllerPlayer {

	public void preInfo() {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void postInfo() {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public ActionsPlayer getPlayer() {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void setPlayer(ActionsPlayer c) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public String getType() {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void setType(String newType) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeUnknownObject(UnknownObject type,  double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection){
    	throw new UnsupportedOperationException("Not supported in this test.");
    }

	public void infoSeeFlagRight(Flag flag, double distance, double direction,
			double distChange, double dirChange, double bodyFacingDirection,
			double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagLeft(Flag flag, double distance, double direction,
			double distChange, double dirChange, double bodyFacingDirection,
			double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagOwn(Flag flag, double distance, double direction,
			double distChange, double dirChange, double bodyFacingDirection,
			double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagOther(Flag flag, double distance, double direction,
			double distChange, double dirChange, double bodyFacingDirection,
			double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagCenter(Flag flag, double distance, double direction,
			double distChange, double dirChange, double bodyFacingDirection,
			double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagCornerOwn(Flag flag, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagCornerOther(Flag flag, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagPenaltyOwn(Flag flag, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagPenaltyOther(Flag flag, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagGoalOwn(Flag flag, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeFlagGoalOther(Flag flag, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeLine(Line line, double distance, double direction,
			double distChange, double dirChange, double bodyFacingDirection,
			double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeePlayerOther(int number, boolean goalie, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeePlayerOwn(int number, boolean goalie, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSeeBall(double distance, double direction,
			double distChange, double dirChange, double bodyFacingDirection,
			double headFacingDirection) {
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

	public void infoHearSelf(String message) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle,
			double stamina, double unknown, double effort, double speedAmount,
			double speedDirection, double headAngle, int kickCount,
			int dashCount, int turnCount, int sayCount, int turnNeckCount,
			int catchCount, int moveCount, int changeViewCount) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoCPTOwn(int unum, int type) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoCPTOther(int unum) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoPlayerType(int id, double playerSpeedMax,
			double staminaIncMax, double playerDecay, double inertiaMoment,
			double dashPowerRate, double playerSize, double kickableMargin,
			double kickRand, double extraStamina, double effortMax,
			double effortMin) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoPlayerParam(double allowMultDefaultType,
			double dashPowerRateDeltaMax, double dashPowerRateDeltaMin,
			double effortMaxDeltaFactor, double effortMinDeltaFactor,
			double extraStaminaDeltaMax, double extraStaminaDeltaMin,
			double inertiaMomentDeltaFactor, double kickRandDeltaFactor,
			double kickableMarginDeltaMax, double kickableMarginDeltaMin,
			double newDashPowerRateDeltaMax, double newDashPowerRateDeltaMin,
			double newStaminaIncMaxDeltaFactor, double playerDecayDeltaMax,
			double playerDecayDeltaMin, double playerTypes, double ptMax,
			double randomSeed, double staminaIncMaxDeltaFactor, double subsMax) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void infoServerParam(HashMap<ServerParams, Object> info) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}

	public void setCycle(int cycle) {
		throw new UnsupportedOperationException("Not supported in this test.");
	}
}
