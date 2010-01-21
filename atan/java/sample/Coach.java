package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ActionsCoach;
import atan.model.ControllerCoach;
import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.Warning;

/**
 * 
 * @author author
 */
public class Coach implements ControllerCoach {
    private ActionsCoach coach;

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
     * @param playMode
     */
    @Override
    public void infoHearPlayMode(PlayMode playMode) {

        // TODO Auto-generated method stub
    }

    /**
     * 
     * @param direction
     * @param message
     */
    @Override
    public void infoHearPlayer(double direction, String message) {

        // TODO Auto-generated method stub
    }

    /**
     * 
     * @param refereeMessage
     */
    @Override
    public void infoHearReferee(RefereeMessage refereeMessage) {

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
}
