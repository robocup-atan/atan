package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;

/**
 * Interface description
 * @author Atan
 */
public interface ObjName {

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    public void infoSeeFromEast(Controller c, double dist, double dir);

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    public void infoSeeFromWest(Controller c, double dist, double dir);
}
