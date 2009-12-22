package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;

/**
 * Class description
 * @author Atan
 */
class ObjNamePlayerEast implements ObjName {
    int number;

    /**
     * Constructs ...
     * @param number
     */
    ObjNamePlayerEast(int number) {
        this.number = number;
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    public void infoSeeFromEast(Controller c, double dist, double dir) {
        c.infoSeePlayerOwn(number, dist, dir);
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    public void infoSeeFromWest(Controller c, double dist, double dir) {
        c.infoSeePlayerOther(number, dist, dir);
    }
}
