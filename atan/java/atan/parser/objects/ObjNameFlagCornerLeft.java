package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayer;
import atan.model.enums.Flag;

/**
 *
 * @author Atan
 */
public class ObjNameFlagCornerLeft implements ObjName {
    char qualifier;

    /**
     *
     * @param qualifier
     */
    public ObjNameFlagCornerLeft(char qualifier) {
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
}