package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;
import atan.model.enums.Flag;

/**
 *
 * @author Atan
 */
public class ObjNameFlagCenter implements ObjName {
    char qualifier;

    /**
     *
     * @param qualifier
     */
    public ObjNameFlagCenter(char qualifier) {
        this.qualifier = qualifier;
    }

    /**
     *
     * @param c
     * @param distance
     * @param direction
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
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
     *
     * @param c
     * @param distance
     * @param direction
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
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
     * Not used be the coach.
     * @param c
     * @param x
     * @param y
     * @param deltaX
     * @param deltaY
     * @param bodyAngle
     * @param neckAngle
     * @deprecated
     */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {}

    /**
     * Not used be the coach.
     * @param c
     * @param x
     * @param y
     * @param deltaX
     * @param deltaY
     * @param bodyAngle
     * @param neckAngle
     * @deprecated
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {}

    /**
     * Not used be the trainer.
     * @param c
     * @deprecated
     */
    @Override
    public void infoSee(ControllerTrainer c) {}
}
