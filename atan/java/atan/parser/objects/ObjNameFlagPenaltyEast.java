package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;
import atan.model.enums.Flag;

/**
 *
 *
 * @author Atan
 */
public class ObjNameFlagPenaltyEast implements ObjName {
    char qualifier;

    /**
     *
     *
     * @param qualifier
     */
    public ObjNameFlagPenaltyEast(char qualifier) {
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
                c.infoSeeFlagPenaltyOwn(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                        headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagPenaltyOwn(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                        headFacingDirection);
                break;
            case 'c' :
                c.infoSeeFlagPenaltyOwn(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
                c.infoSeeFlagPenaltyOther(Flag.LEFT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                break;
            case 'b' :
                c.infoSeeFlagPenaltyOther(Flag.RIGHT, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                break;
            case 'c' :
                c.infoSeeFlagPenaltyOther(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                break;
        }
    }

    /**
     *
     * @param c
     * @param x
     * @param y
     * @param deltaX
     * @param deltaY
     * @param bodyAngle
     * @param neckAngle
     */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {

        // TODO Auto-generated method stub
    }

    /**
     *
     * @param c
     * @param x
     * @param y
     * @param deltaX
     * @param deltaY
     * @param bodyAngle
     * @param neckAngle
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {

        // TODO Auto-generated method stub
    }

    /**
     *
     * @param c
     */
    @Override
    public void infoSee(ControllerTrainer c) {

        // TODO Auto-generated method stub
    }
}
