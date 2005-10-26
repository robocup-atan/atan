package atan.parser;
import atan.model.*;
class ObjNameFlagPenaltyEast implements ObjName {
    char qualifier;
    ObjNameFlagPenaltyEast(char qualifier) {
        this.qualifier = qualifier;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch(qualifier) {
        case 't': c.infoSeeFlagPenaltyOwn(Flag.FLAG_RIGHT, dist, dir);break;
        case 'b': c.infoSeeFlagPenaltyOwn(Flag.FLAG_LEFT, dist, dir);break;
        case 'c': c.infoSeeFlagPenaltyOwn(Flag.FLAG_CENTER, dist, dir);break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch(qualifier) {
        case 't': c.infoSeeFlagPenaltyOther(Flag.FLAG_LEFT, dist, dir);break;
        case 'b': c.infoSeeFlagPenaltyOther(Flag.FLAG_RIGHT, dist, dir);break;
        case 'c': c.infoSeeFlagPenaltyOther(Flag.FLAG_CENTER, dist, dir);break;
      }
    }
}
