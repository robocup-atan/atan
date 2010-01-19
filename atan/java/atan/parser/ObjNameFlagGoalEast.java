package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.enums.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagGoalEast implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameFlagGoalEast(char qualifier) {
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
                c.infoSeeFlagGoalOwn(Flag.RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagGoalOwn(Flag.LEFT, dist, dir);
                break;
            default :
                c.infoSeeFlagGoalOwn(Flag.CENTER, dist, dir);
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
                c.infoSeeFlagGoalOther(Flag.LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagGoalOther(Flag.RIGHT, dist, dir);
                break;
            default :
                c.infoSeeFlagGoalOther(Flag.CENTER, dist, dir);
                break;
        }
    }
}
