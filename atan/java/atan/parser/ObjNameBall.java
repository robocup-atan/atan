package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayer;

/**
 *
 * @author Atan
 */
public class ObjNameBall implements ObjName {

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
        c.infoSeeBall(distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
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
        c.infoSeeBall(distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
    }
}
