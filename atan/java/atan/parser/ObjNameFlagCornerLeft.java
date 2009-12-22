package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagCornerLeft implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameFlagCornerLeft(char qualifier) {
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
                c.infoSeeFlagCornerOther(Flag.FLAG_RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCornerOther(Flag.FLAG_LEFT, dist, dir);
                break;
            default :
                c.infoSeeFlagCornerOther(Flag.FLAG_CENTER, dist, dir);
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
                c.infoSeeFlagCornerOwn(Flag.FLAG_LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCornerOwn(Flag.FLAG_RIGHT, dist, dir);
                break;
            default :
                c.infoSeeFlagCornerOwn(Flag.FLAG_CENTER, dist, dir);
                break;
        }
    }
}
