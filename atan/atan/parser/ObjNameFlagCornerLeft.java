package atan.parser;

import atan.model.*;

class ObjNameFlagCornerLeft implements ObjName {
    char qualifier;
    ObjNameFlagCornerLeft(char qualifier) {
        this.qualifier = qualifier;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagCornerOther(Controller.FLAG_RIGHT, dist, dir); break;
        case 'b': c.infoSeeFlagCornerOther(Controller.FLAG_LEFT, dist, dir); break;
        default : c.infoSeeFlagCornerOther(Controller.FLAG_CENTER, dist, dir); break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagCornerOwn(Controller.FLAG_LEFT, dist, dir); break;
        case 'b': c.infoSeeFlagCornerOwn(Controller.FLAG_RIGHT, dist, dir); break;
        default : c.infoSeeFlagCornerOwn(Controller.FLAG_CENTER, dist, dir); break;
      }
    }
}
