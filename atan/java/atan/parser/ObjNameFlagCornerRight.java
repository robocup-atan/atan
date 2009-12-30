package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagCornerRight implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameFlagCornerRight(char qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromEast(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagCornerOwn(Flag.RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCornerOwn(Flag.LEFT, dist, dir);
                break;
            default :
                c.infoSeeFlagCornerOwn(Flag.CENTER, dist, dir);
                break;
        }
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromWest(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagCornerOther(Flag.LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCornerOther(Flag.RIGHT, dist, dir);
                break;
            default :
                c.infoSeeFlagCornerOther(Flag.CENTER, dist, dir);
                break;
        }
    }
}
