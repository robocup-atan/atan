package com.github.robocup_atan.atan.parser.trainer;

import com.github.robocup_atan.atan.model.ActionsPlayer;
import com.github.robocup_atan.atan.model.ActionsTrainer;
import com.github.robocup_atan.atan.model.enums.PlayMode;

public class BaseActionsTrainer implements ActionsTrainer {

    public void changePlayMode(PlayMode playMode) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void movePlayer(ActionsPlayer p, double x, double y) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void moveBall(double x, double y) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void checkBall() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void startGame() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void recover() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void eye(boolean eyeOn) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void ear(boolean earOn) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void say(String message) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void changePlayerType(String teamName, int unum, int playerType) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void look() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void teamNames() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void bye() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void handleError(String error) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }
}
