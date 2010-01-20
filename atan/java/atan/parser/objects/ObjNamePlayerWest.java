package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayer;

/**
 *
 *
 * @author Atan
 */
public class ObjNamePlayerWest implements ObjName {
    boolean goalie;
    int     number;

    /**
     *
     *
     * @param number
     * @param goalie
     */
    public ObjNamePlayerWest(int number, boolean goalie) {
        this.number = number;
        this.goalie = goalie;
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
        c.infoSeePlayerOther(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection,
                             headFacingDirection);
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
        c.infoSeePlayerOwn(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection,
                           headFacingDirection);
    }
}
