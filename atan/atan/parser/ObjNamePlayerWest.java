package atan.parser;
import atan.model.*;
class ObjNamePlayerWest implements ObjName {
    int number;
    ObjNamePlayerWest(int number) {
        this.number = number;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      c.infoSeePlayerOther(number, dist, dir);
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      c.infoSeePlayerOwn(number, dist, dir);
    }
}
