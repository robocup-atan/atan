package com.github.robocup_atan.atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.ControllerTrainer;
import com.github.robocup_atan.atan.model.enums.Flag;

/**
 * The parser object for east penatly flags.
 *
 * @author Atan
 */
public class ObjNameFlagPenaltyEast implements ObjName {
    char qualifier;

    /**
     * A constructor for east penatly flags.
     *
     * @param qualifier Either 't' or 'b'.
     */
    public ObjNameFlagPenaltyEast(char qualifier) {
        this.qualifier = qualifier;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /** {@inheritDoc} */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /** {@inheritDoc} */
    @Override
    public void infoSee(ControllerTrainer c) {
        throw new UnsupportedOperationException();
    }
}
