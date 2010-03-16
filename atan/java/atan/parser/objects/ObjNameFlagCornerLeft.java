package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;
import atan.model.enums.Flag;

/**
 * The parser object for corner left flags.
 * @author Atan
 */
public class ObjNameFlagCornerLeft implements ObjName {
    char qualifier;

    /**
     * A constructor for corner left flags.
     * @param qualifier Either 't' or 'b'.
     */
    public ObjNameFlagCornerLeft(char qualifier) {
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
                c.infoSeeFlagCornerOther(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                         headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagCornerOther(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                         headFacingDirection);
                break;
            default :
                c.infoSeeFlagCornerOther(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
                c.infoSeeFlagCornerOwn(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagCornerOwn(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                       headFacingDirection);
                break;
            default :
                c.infoSeeFlagCornerOwn(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
