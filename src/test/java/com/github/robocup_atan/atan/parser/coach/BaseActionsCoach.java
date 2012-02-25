package com.github.robocup_atan.atan.parser.coach;

import com.github.robocup_atan.atan.model.ActionsCoach;
import com.github.robocup_atan.atan.model.XPMImage;

public class BaseActionsCoach implements ActionsCoach {

    public void eye(boolean eyeOn) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void look() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void say(String message) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void changePlayerType(int unum, int playerType) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void teamGraphic(XPMImage xpm) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void getTeamNames() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void bye() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void handleError(String error) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public boolean isTeamEast() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public void setTeamEast(boolean is) {
        throw new UnsupportedOperationException("Not supported in this test.");
    }

    public String getTeamName() {
        throw new UnsupportedOperationException("Not supported in this test.");
    }
}
