package atan.parser;
import atan.model.*;
class ObjNameFlagPenaltyWest implements ObjName {
    char qualifier;
    ObjNameFlagPenaltyWest(char qualifier) {
        this.qualifier = qualifier;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch(qualifier) {
        case 't': c.infoSeeFlagPenaltyOther(Controller.FLAG_RIGHT, dist, dir);break;
        case 'b': c.infoSeeFlagPenaltyOther(Controller.FLAG_LEFT, dist, dir);break;
        case 'c': c.infoSeeFlagPenaltyOther(Controller.FLAG_CENTER, dist, dir);break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch(qualifier) {
        case 't': c.infoSeeFlagPenaltyOwn(Controller.FLAG_LEFT, dist, dir);break;
        case 'b': c.infoSeeFlagPenaltyOwn(Controller.FLAG_RIGHT, dist, dir);break;
        case 'c': c.infoSeeFlagPenaltyOwn(Controller.FLAG_CENTER, dist, dir);break;
      }
    }
}
