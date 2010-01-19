package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.enums.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagCenter implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameFlagCenter(char qualifier) {
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
                c.infoSeeFlagCenter(Flag.RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCenter(Flag.LEFT, dist, dir);
                break;
            default :
                c.infoSeeFlagCenter(Flag.CENTER, dist, dir);
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
                c.infoSeeFlagCenter(Flag.LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagCenter(Flag.RIGHT, dist, dir);
                break;
            default :
                c.infoSeeFlagCenter(Flag.CENTER, dist, dir);
                break;
        }
    }
}
