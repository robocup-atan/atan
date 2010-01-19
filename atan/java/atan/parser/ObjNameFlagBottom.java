package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.enums.Flag;

/**
 * Class description
 * @author Atan
 */
class ObjNameFlagBottom implements ObjName {
    int  number;
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     * @param number
     */
    ObjNameFlagBottom(char qualifier, int number) {
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
            case 'l' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagLeft(Flag.OTHER_50, dist, dir);
                        break;
                    case 40 :
                        c.infoSeeFlagLeft(Flag.OTHER_40, dist, dir);
                        break;
                    case 30 :
                        c.infoSeeFlagLeft(Flag.OTHER_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagLeft(Flag.OTHER_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagLeft(Flag.OTHER_10, dist, dir);
                        break;
                }
                ;
                break;
            case 'r' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagLeft(Flag.OWN_50, dist, dir);
                        break;
                    case 40 :
                        c.infoSeeFlagLeft(Flag.OWN_40, dist, dir);
                        break;
                    case 30 :
                        c.infoSeeFlagLeft(Flag.OWN_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagLeft(Flag.OWN_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagLeft(Flag.OWN_10, dist, dir);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagLeft(Flag.CENTER, dist, dir);
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
            case 'l' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagRight(Flag.OWN_50, dist, dir);
                        break;
                    case 40 :
                        c.infoSeeFlagRight(Flag.OWN_40, dist, dir);
                        break;
                    case 30 :
                        c.infoSeeFlagRight(Flag.OWN_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagRight(Flag.OWN_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagRight(Flag.OWN_10, dist, dir);
                        break;
                }
                ;
                break;
            case 'r' :
                switch (number) {
                    case 50 :
                        c.infoSeeFlagRight(Flag.OTHER_50, dist, dir);
                        break;
                    case 40 :
                        c.infoSeeFlagRight(Flag.OTHER_40, dist, dir);
                        break;
                    case 30 :
                        c.infoSeeFlagRight(Flag.OTHER_30, dist, dir);
                        break;
                    case 20 :
                        c.infoSeeFlagRight(Flag.OTHER_20, dist, dir);
                        break;
                    case 10 :
                        c.infoSeeFlagRight(Flag.OTHER_10, dist, dir);
                        break;
                }
                ;
                break;
            case '0' :
                c.infoSeeFlagRight(Flag.CENTER, dist, dir);
                break;
        }
        c.infoSeeBall(dist, dir);
    }
}
