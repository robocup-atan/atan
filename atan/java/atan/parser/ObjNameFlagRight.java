package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Flag;

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
     * Method description
     * @param c
     * @param dist
     * @param dir
     */
    public void infoSeeFromEast(Controller c, double dist, double dir) {
        switch (qualifier) {
            case 't' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOwn(Flag.FLAG_RIGHT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOwn(Flag.FLAG_RIGHT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOwn(Flag.FLAG_RIGHT_10, dist, dir);
                        break;
                }
                ;
                break;
            case 'b' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOwn(Flag.FLAG_LEFT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOwn(Flag.FLAG_LEFT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOwn(Flag.FLAG_LEFT_10, dist, dir);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagOwn(Flag.FLAG_CENTER, dist, dir);
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
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOther(Flag.FLAG_LEFT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOther(Flag.FLAG_LEFT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOther(Flag.FLAG_LEFT_10, dist, dir);
                        break;
                }
                ;
                break;
            case 'b' :
                switch (number) {
                    case 30 :
                        c.infoSeeFlagOther(Flag.FLAG_RIGHT_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagOther(Flag.FLAG_RIGHT_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagOther(Flag.FLAG_RIGHT_10, dist, dir);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagOther(Flag.FLAG_CENTER, dist, dir);
                break;
        }
    }
}
