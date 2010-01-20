package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayer;
import atan.model.enums.Flag;

/**
 *
 * @author Atan
 */
public class ObjNameFlagGoalEast implements ObjName {
    char qualifier;

    /**
     *
     * @param qualifier
     */
    public ObjNameFlagGoalEast(char qualifier) {
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
}
