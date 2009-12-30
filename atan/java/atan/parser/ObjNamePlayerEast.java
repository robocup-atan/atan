package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;

/**
 * Class description
 * @author Atan
 */
class ObjNamePlayerEast implements ObjName {
    boolean isGoalie;
    int     number;

    /**
     * Constructs ...
     * @param number
     * @param isGoalie
     */
    ObjNamePlayerEast(int number, boolean isGoalie) {
        this.number   = number;
        this.isGoalie = isGoalie;
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromEast(Controller c, double dist, double dir) {
        c.infoSeePlayerOwn(number, dist, dir);
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromWest(Controller c, double dist, double dir) {
        c.infoSeePlayerOther(number, dist, dir);
    }
}
