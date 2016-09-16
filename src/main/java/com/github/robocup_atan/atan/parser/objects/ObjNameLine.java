package com.github.robocup_atan.atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.ControllerTrainer;
import com.github.robocup_atan.atan.model.enums.Line;

/**
 * <p>ObjNameLine class.</p>
 *
 * @author Atan
 */
public class ObjNameLine implements ObjName {
    char qualifier;

    /**
     * <p>Constructor for ObjNameLine.</p>
     *
     * @param qualifier a char.
     */
    public ObjNameLine(char qualifier) {
        this.qualifier = qualifier;
    }

    /** {@inheritDoc} */
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

    /** {@inheritDoc} */
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
