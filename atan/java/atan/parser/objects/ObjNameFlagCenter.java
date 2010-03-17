package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;
import atan.model.enums.Flag;

/**
 * The parser object for center flags.
 * @author Atan
 */
public class ObjNameFlagCenter implements ObjName {
    char qualifier;

    /**
     * A constructor for center flags.
     * @param qualifier Either 't' or 'b'.
     */
    public ObjNameFlagCenter(char qualifier) {
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
                c.infoSeeFlagCenter(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                    headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagCenter(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                    headFacingDirection);
                break;
            default :
                c.infoSeeFlagCenter(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
                c.infoSeeFlagCenter(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                    headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagCenter(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                    headFacingDirection);
                break;
            default :
                c.infoSeeFlagCenter(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /**
     * @inheritDoc
     * @deprecated Not needed by the coach.
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /**
     * @inheritDoc
     * @deprecated Not needed by the trainer.
     */
    @Override
    public void infoSee(ControllerTrainer c) {
        throw new UnsupportedOperationException();
    }
}
