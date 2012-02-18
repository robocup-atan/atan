package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;
import atan.model.enums.Line;

/**
 * @author Atan
 */
public class ObjNameLine implements ObjName {
    char qualifier;

    /**
     * @param qualifier
     */
    public ObjNameLine(char qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * @inheritDoc
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
     * @inheritDoc
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

    /**
     * @inheritDoc
     * @deprecated Not to be usd by the coach.
     */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /**
     * @inheritDoc
     * @deprecated Not to be used by the coach.
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        throw new UnsupportedOperationException();
    }

    /**
     * @inheritDoc
     * @deprecated Not to be used by the trainer.
     */
    @Override
    public void infoSee(ControllerTrainer c) {
        throw new UnsupportedOperationException();
    }
}
