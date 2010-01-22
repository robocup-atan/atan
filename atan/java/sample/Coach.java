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
}
