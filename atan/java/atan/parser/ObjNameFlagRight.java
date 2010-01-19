package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.enums.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagRight implements ObjName {
    int  number;
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     * @param number
     */
    ObjNameFlagRight(char qualifier, int number) {
        this.qualifier = qualifier;
        this.number    = number;
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
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOwn(Flag.RIGHT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOwn(Flag.RIGHT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOwn(Flag.RIGHT_10, dist, dir);
                        break;
                }
                ;
                break;
            case 'b' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOwn(Flag.LEFT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOwn(Flag.LEFT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOwn(Flag.LEFT_10, dist, dir);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagOwn(Flag.CENTER, dist, dir);
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
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOther(Flag.LEFT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOther(Flag.LEFT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOther(Flag.LEFT_10, dist, dir);
                        break;
                }
                ;
                break;
            case 'b' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOther(Flag.RIGHT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOther(Flag.RIGHT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOther(Flag.RIGHT_10, dist, dir);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagOther(Flag.CENTER, dist, dir);
                break;
        }
    }
}
