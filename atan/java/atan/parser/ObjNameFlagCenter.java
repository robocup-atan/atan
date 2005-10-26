package atan.parser;
import atan.model.*;
class ObjNameFlagCenter implements ObjName {
    char qualifier;
    ObjNameFlagCenter(char qualifier) {
        this.qualifier = qualifier;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagCenter(Flag.FLAG_RIGHT, dist, dir); break;
        case 'b': c.infoSeeFlagCenter(Flag.FLAG_LEFT, dist, dir); break;
        default : c.infoSeeFlagCenter(Flag.FLAG_CENTER, dist, dir); break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagCenter(Flag.FLAG_LEFT, dist, dir); break;
        case 'b': c.infoSeeFlagCenter(Flag.FLAG_RIGHT, dist, dir); break;
        default : c.infoSeeFlagCenter(Flag.FLAG_CENTER, dist, dir); break;
      }
    }
}
