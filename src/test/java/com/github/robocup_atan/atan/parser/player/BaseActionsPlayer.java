package com.github.robocup_atan.atan.parser.player;

import com.github.robocup_atan.atan.model.ActionsPlayer;
import com.github.robocup_atan.atan.model.enums.ViewAngle;
import com.github.robocup_atan.atan.model.enums.ViewQuality;

public class BaseActionsPlayer implements ActionsPlayer {

    public void dash(int power) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void move(int x, int y) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void kick(int power, double direction) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void say(String message) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void turn(double angle) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void turnNeck(double angle) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void catchBall(double direction) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void changeViewMode(ViewQuality quality, ViewAngle angle) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void bye() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void handleError(String error) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public String getTeamName() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public boolean isTeamEast() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void setTeamEast(boolean is) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void setNumber(int num) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public int getNumber() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }
}