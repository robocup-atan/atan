package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;
import atan.model.enums.Flag;

/**
 * The parser object for top flags.
 * @author Atan
 */
public class ObjNameFlagTop implements ObjName {
    int  number;
    char qualifier;

    /**
     * A constructor for top flags.
     * @param qualifier Either 'l' or 'r'.
     * @param number Either 10, 20, 30, 40 or 50.
     */
    public ObjNameFlagTop(char qualifier, int number) {
        this.qualifier = qualifier;
        this.number    = number;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        switch (qualifier) {
            case 'l' :
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
            case 'r' :
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
            case '0' :
                c.infoSeeFlagRight(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
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
            case 'l' :
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
            case 'r' :
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
            case '0' :
                c.infoSeeFlagLeft(Flag.CENTER, distance, direction, distChange, dirChange, bodyFacingDirection,
                                  headFacingDirection);
                break;
        }
        c.infoSeeBall(distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
    }

    /**
     * @inheritDoc
     * @deprecated Not needed by the coach.
     */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {}

    /**
     * @inheritDoc
     * @deprecated Not needed by the coach.
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {}

    /**
     * @inheritDoc
     * @deprecated Not needed by the trainer.
     */
    @Override
    public void infoSee(ControllerTrainer c) {}
}
