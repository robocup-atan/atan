package atan.parser;
import atan.model.*;
class ObjNameFlagCornerRight implements ObjName {
    char qualifier;
    ObjNameFlagCornerRight(char qualifier) {
        this.qualifier = qualifier;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagCornerOwn(Flag.FLAG_RIGHT, dist, dir); break;
        case 'b': c.infoSeeFlagCornerOwn(Flag.FLAG_LEFT, dist, dir); break;
        default : c.infoSeeFlagCornerOwn(Flag.FLAG_CENTER, dist, dir); break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagCornerOther(Flag.FLAG_LEFT, dist, dir); break;
        case 'b': c.infoSeeFlagCornerOther(Flag.FLAG_RIGHT, dist, dir); break;
        default : c.infoSeeFlagCornerOther(Flag.FLAG_CENTER, dist, dir); break;
      }
    }
}
