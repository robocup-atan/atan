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
public class ObjNameFlagBottom implements ObjName {
    int  number;
    char qualifier;

    /**
     *
     *
     * @param qualifier
     * @param number
     */
    public ObjNameFlagBottom(char qualifier, int number) {
        this.qualifier = qualifier;
        this.number    = number;
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
            case 'l' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagLeft(Flag.OTHER_50, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagLeft(Flag.OTHER_40, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagLeft(Flag.OTHER_30, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagLeft(Flag.OTHER_20, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagLeft(Flag.OTHER_10, distance, direction, distChange, dirChange,
                                          bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case 'r' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagLeft(Flag.OWN_50, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagLeft(Flag.OWN_40, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagLeft(Flag.OWN_30, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagLeft(Flag.OWN_20, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagLeft(Flag.OWN_10, distance, direction, distChange, dirChange, bodyFacingDirection,
                                          headFacingDirection);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagLeft(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
            case 'l' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagRight(Flag.OWN_50, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagRight(Flag.OWN_40, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagRight(Flag.OWN_30, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagRight(Flag.OWN_20, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagRight(Flag.OWN_10, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case 'r' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagRight(Flag.OTHER_50, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 40 :
                        c.infoSeeFlagRight(Flag.OTHER_40, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 30 :
                        c.infoSeeFlagRight(Flag.OTHER_30, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 20 :
                        c.infoSeeFlagRight(Flag.OTHER_20, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                    case 10 :
                        c.infoSeeFlagRight(Flag.OTHER_10, distance, direction, distChange, dirChange,
                                           bodyFacingDirection, headFacingDirection);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagRight(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
