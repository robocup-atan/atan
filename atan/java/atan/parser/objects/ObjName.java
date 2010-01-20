package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerPlayer;

/**
 * The interface for all objects on the pitch. This is used to translate
 * them so that they are relative to each team (ie. ourGoal theirGoal)
 *
 * @author Atan
 */
public interface ObjName {

    /**
     * The object viewed from the east.
     * @param c
     * @param distance
     * @param direction
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The object viewed from the west.
     * @param c
     * @param distance
     * @param direction
     * @param distChange
     * @param dirChange
     * @param bodyFacingDirection
     * @param headFacingDirection
     */
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection);
}
