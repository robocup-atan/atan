package atan.parser;
import atan.model.*;
class ObjNamePlayerEast implements ObjName {
    int number;
    ObjNamePlayerEast(int number) {
        this.number = number;
    }
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      c.infoSeePlayerOwn(number, dist, dir);
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      c.infoSeePlayerOther(number, dist, dir);
    }
}
