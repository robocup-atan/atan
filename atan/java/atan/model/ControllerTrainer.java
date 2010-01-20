package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.Errors;
import atan.model.enums.Ok;
import atan.model.enums.PlayMode;
import atan.model.enums.RefereeMessage;
import atan.model.enums.Warning;

/**
 * An interface that has to be implemented for a trainer.
 * @author Atan
 */
public interface ControllerTrainer {

    /**
     * The controller is informed when it hears a message from another player.
     * @param direction The direction from which the message originated.
     * @param message The actual message said.
     */
    public void infoHearPlayer(double direction, String message);

    /**
     * The controller is informed when a play mode message is broadcast.
     * @param playMode possible values: BEFORE_KICK_OFF, TIME_OVER, PLAY_ON,
     * KICK_OFF_OWN, KICK_OFF_OTHER, FREE_KICK_OWN,
     * FREE_KICK_OTHER, GOAL_KICK_OWN, CORNER_KICK_OTHER,
     * GOAL_KICK_OWN, GOAL_KICK_OTHER, GOAL_OWN, GOAL_OTHER
     */
    public void infoHearPlayMode(PlayMode playMode);

    /**
     * The controller is informed when a referee message is broadcast.
     * @param refereeMessage possible values: FOUL_OWN, FOUL_OTHER,
     * HALF_TIME, TIME_UP, TIME_UP_WITHOUT_A_TEAM,
     * TIME_EXTENDED, DROP_BALL, OFFSIDE_OWN, OFFSIDE_OTHER
     */
    public void infoHearReferee(RefereeMessage refereeMessage);

    /**
     * The trainer is informed when it hears an error message.
     * @param error The error to handle
     */
    public void infoHearError(Errors error);

    /**
     * The player is informed when it hears an ok message.
     * @param ok The message to handle.
     */
    public void infoHearOk(Ok ok);

    /**
     * The player is informed when it hears a warning.
     * @param warning The warning to handle.
     */
    public void infoHearWarning(Warning warning);
}
