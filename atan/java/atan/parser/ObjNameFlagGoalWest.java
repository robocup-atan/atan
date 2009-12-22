package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagGoalWest implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameFlagGoalWest(char qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    public void infoSeeFromEast(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagGoalOther(Flag.FLAG_RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagGoalOther(Flag.FLAG_LEFT, dist, dir);
                break;
            default :
                c.infoSeeFlagGoalOther(Flag.FLAG_CENTER, dist, dir);
                break;
        }
    }

    /**
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    public void infoSeeFromWest(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                c.infoSeeFlagGoalOwn(Flag.FLAG_LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagGoalOwn(Flag.FLAG_RIGHT, dist, dir);
                break;
            default :
                c.infoSeeFlagGoalOwn(Flag.FLAG_CENTER, dist, dir);
                break;
        }
    }
}
