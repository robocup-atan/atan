package com.github.robocup_atan.atan.parser.trainer;

import com.github.robocup_atan.atan.model.ControllerTrainer;
import com.github.robocup_atan.atan.model.enums.*;

public class BaseControllerTrainer implements ControllerTrainer {

    public void infoHearPlayer(double direction, String message) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearPlayMode(PlayMode playMode) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void infoHearReferee(RefereeMessage refereeMessage) {
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
}
