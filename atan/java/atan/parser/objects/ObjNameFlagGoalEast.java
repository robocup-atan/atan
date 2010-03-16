//~RoboCup Project - Nick James (nsj3), Daniel Wood (dw224), Stuart Wood (sw262)

package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;
import atan.model.enums.Flag;

/**
 * The parser object for goal east.
 * @author Atan
 */
public class ObjNameFlagGoalEast implements ObjName {
    char qualifier;

    /**
     * A constructor for goal east.
     * @param qualifier Either 't' or 'b'.
     */
    public ObjNameFlagGoalEast(char qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagGoalOwn(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                     headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagGoalOwn(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                     headFacingDirection);
                break;
            default :
                c.infoSeeFlagGoalOwn(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                     headFacingDirection);
                break;
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagGoalOther(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagGoalOther(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
            default :
                c.infoSeeFlagGoalOther(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
        }
    }

    /**
     * @inheritDoc
     * @deprecated Not needed by the coach.
     */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {}

    /**
     * @inheritDoc
     * @deprecated Not needed by the coach.
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {}

    /**
     * @inheritDoc
     * @deprecated Not needed by the trainer.
     */
    @Override
    public void infoSee(ControllerTrainer c) {}
}
