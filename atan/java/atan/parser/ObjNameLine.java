package atan.parser;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Line;

/**
 * Class description
 * @author Atan
 */
class ObjNameLine implements ObjName {
    char qualifier;

    /**
     * Constructs ...
     * @param qualifier
     */
    ObjNameLine(char qualifier) {
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
                c.infoSeeLine(Line.RIGHT, dist, dir);
                break;
            case 'b' :
                c.infoSeeLine(Line.LEFT, dist, dir);
                break;
            case 'l' :
                c.infoSeeLine(Line.OTHER, dist, dir);
                break;
            case 'r' :
                c.infoSeeLine(Line.OWN, dist, dir);
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
                c.infoSeeLine(Line.LEFT, dist, dir);
                break;
            case 'b' :
                c.infoSeeLine(Line.RIGHT, dist, dir);
                break;
            case 'l' :
                c.infoSeeLine(Line.OWN, dist, dir);
                break;
            case 'r' :
                c.infoSeeLine(Line.OTHER, dist, dir);
                break;
        }
    }
}
