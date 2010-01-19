package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.enums.Flag;

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
     * 
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromEast(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagCornerOther(Flag.RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCornerOther(Flag.LEFT, dist, dir);
                break;
            default :
                c.infoSeeFlagCornerOther(Flag.CENTER, dist, dir);
                break;
        }
    }

    /**
     * 
     * @param c
     * @param dist
     * @param dir
     */
    @Override
    public void infoSeeFromWest(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagCornerOwn(Flag.LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCornerOwn(Flag.RIGHT, dist, dir);
                break;
            default :
                c.infoSeeFlagCornerOwn(Flag.CENTER, dist, dir);
                break;
        }
    }
}
