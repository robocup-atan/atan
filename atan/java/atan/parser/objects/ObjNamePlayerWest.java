package atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.ControllerCoach;
import atan.model.ControllerPlayer;
import atan.model.ControllerTrainer;

/**
 * @author Atan
 */
public class ObjNamePlayerWest implements ObjName {
    boolean goalie;
    int     number;

    /**
     * @param number
     * @param goalie
     */
    public ObjNamePlayerWest(int number, boolean goalie) {
        this.number = number;
        this.goalie = goalie;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        c.infoSeePlayerOther(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection,
                             headFacingDirection);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection) {
        c.infoSeePlayerOwn(number, goalie, distance, direction, distChange, dirChange, bodyFacingDirection,
                           headFacingDirection);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        c.infoSeePlayerOther(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle) {
        c.infoSeePlayerOwn(number, goalie, x, y, deltaX, deltaY, bodyAngle, neckAngle);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void infoSee(ControllerTrainer c) {

        // TODO Auto-generated method stub
    }
}
