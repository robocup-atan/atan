package atan.parser;
import atan.model.*;
class ObjNameFlagGoalWest implements ObjName {
    char qualifier;
    ObjNameFlagGoalWest(char qualifier) {
        this.qualifier = qualifier;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagGoalOther(Controller.FLAG_RIGHT, dist, dir); break;
        case 'b': c.infoSeeFlagGoalOther(Controller.FLAG_LEFT, dist, dir); break;
        default : c.infoSeeFlagGoalOther(Controller.FLAG_CENTER, dist, dir); break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagGoalOwn(Controller.FLAG_LEFT, dist, dir); break;
        case 'b': c.infoSeeFlagGoalOwn(Controller.FLAG_RIGHT, dist, dir); break;
        default : c.infoSeeFlagGoalOwn(Controller.FLAG_CENTER, dist, dir); break;
      }
    }
}
