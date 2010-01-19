package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.enums.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagPenaltyWest implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameFlagPenaltyWest(char qualifier) {
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
                c.infoSeeFlagPenaltyOther(Flag.RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagPenaltyOther(Flag.LEFT, dist, dir);
                break;
            case 'c' :
                c.infoSeeFlagPenaltyOther(Flag.CENTER, dist, dir);
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
                c.infoSeeFlagPenaltyOwn(Flag.LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeFlagPenaltyOwn(Flag.RIGHT, dist, dir);
                break;
            case 'c' :
                c.infoSeeFlagPenaltyOwn(Flag.CENTER, dist, dir);
                break;
        }
    }
}
