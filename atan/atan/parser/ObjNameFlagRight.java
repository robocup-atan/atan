package atan.parser;
import atan.model.*;
class ObjNameFlagRight implements ObjName {
    char qualifier;
    int number;
    ObjNameFlagRight(char qualifier, int number) {
        this.qualifier = qualifier;
        this.number = number;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': switch (number) {
          case 30: c.infoSeeFlagOwn(Controller.FLAG_RIGHT_30, dist, dir); break;
          case 20: c.infoSeeFlagOwn(Controller.FLAG_RIGHT_20, dist, dir); break;
          case 10: c.infoSeeFlagOwn(Controller.FLAG_RIGHT_10, dist, dir); break;
        }; break;
        case 'b': switch (number) {
          case 30: c.infoSeeFlagOwn(Controller.FLAG_LEFT_30, dist, dir); break;
          case 20: c.infoSeeFlagOwn(Controller.FLAG_LEFT_20, dist, dir); break;
          case 10: c.infoSeeFlagOwn(Controller.FLAG_LEFT_10, dist, dir); break;
        }; break;
        case '0': c.infoSeeFlagOwn(Controller.FLAG_CENTER, dist, dir); break;
      }
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      switch (qualifier) {
        case 't': switch (number) {
          case 30: c.infoSeeFlagOther(Controller.FLAG_RIGHT_30, dist, dir); break;
          case 20: c.infoSeeFlagOther(Controller.FLAG_RIGHT_20, dist, dir); break;
          case 10: c.infoSeeFlagOther(Controller.FLAG_RIGHT_10, dist, dir); break;
        }; break;
        case 'b': switch (number) {
          case 30: c.infoSeeFlagOther(Controller.FLAG_LEFT_30, dist, dir); break;
          case 20: c.infoSeeFlagOther(Controller.FLAG_LEFT_20, dist, dir); break;
          case 10: c.infoSeeFlagOther(Controller.FLAG_LEFT_10, dist, dir); break;
        }; break;
        case '0': c.infoSeeFlagOther(Controller.FLAG_CENTER, dist, dir); break;
      }
    }
}
