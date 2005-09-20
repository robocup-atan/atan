package atan.parser;
import atan.model.*;
class ObjNameBall implements ObjName {
    public void infoSeeFromEast(Controller c, double dist, double dir) {
      c.infoSeeBall(dist, dir);
    }
    public void infoSeeFromWest(Controller c, double dist, double dir) {
      c.infoSeeBall(dist, dir);
    }
}
