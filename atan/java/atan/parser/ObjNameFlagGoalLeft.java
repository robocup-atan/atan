package atan.parser;
import atan.model.*;
class ObjNameFlagGoalLeft implements ObjName {
    char qualifier;
    ObjNameFlagGoalLeft(char qualifier) {
        this.qualifier = qualifier;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagGoalOther(Flag.FLAG_RIGHT, dist, dir); break;
        case 'b': c.infoSeeFlagGoalOther(Flag.FLAG_LEFT, dist, dir); break;
        default : c.infoSeeFlagGoalOther(Flag.FLAG_CENTER, dist, dir); break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': c.infoSeeFlagGoalOwn(Flag.FLAG_LEFT, dist, dir); break;
        case 'b': c.infoSeeFlagGoalOwn(Flag.FLAG_RIGHT, dist, dir); break;
        default : c.infoSeeFlagGoalOwn(Flag.FLAG_CENTER, dist, dir); break;
      }
    }
}
