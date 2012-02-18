package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;

/**
 * The parser object for the Ball.
 * @author Atan
 */
public class ObjNameBall implements ObjName {

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        c.infoSeeBall(distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        c.infoSeeBall(distance, direction, distChange, dirChange, bodyFacingDirection, headFacingDirection);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        c.infoSeeBall(x, y, deltaX, deltaY);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        c.infoSeeBall(x, y, deltaX, deltaY);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSee(ControllerTrainer c) {

        // TODO Auto-generated method stub
    }
}
