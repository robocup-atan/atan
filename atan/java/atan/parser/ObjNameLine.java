package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayer;
import atan.model.enums.Line;

/**
 *
 * @author Atan
 */
public class ObjNameLine implements ObjName {
    char qualifier;

    /**
     *
     *
     * @param qualifier
     */
    public ObjNameLine(char qualifier) {
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
                c.infoSeeLine(Line.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                              headFacingDirection);
                break;
            case 'b' :
                c.infoSeeLine(Line.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                              headFacingDirection);
                break;
            case 'l' :
                c.infoSeeLine(Line.OTHER, distance, direction, distChange, dirChange, bodyFacingDirection,
                              headFacingDirection);
                break;
            case 'r' :
                c.infoSeeLine(Line.OWN, distance, direction, distChange, dirChange, bodyFacingDirection,
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
                c.infoSeeLine(Line.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                              headFacingDirection);
                break;
            case 'b' :
                c.infoSeeLine(Line.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                              headFacingDirection);
                break;
            case 'l' :
                c.infoSeeLine(Line.OWN, distance, direction, distChange, dirChange, bodyFacingDirection,
                              headFacingDirection);
                break;
            case 'r' :
                c.infoSeeLine(Line.OTHER, distance, direction, distChange, dirChange, bodyFacingDirection,
                              headFacingDirection);
                break;
        }
    }
}
