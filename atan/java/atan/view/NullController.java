package atan.view;

import atan.model.*;

public class NullController implements Controller {

  public NullController() {
  }
  public void preInfo() {}
  public void postInfo() {}
  public Player getPlayer() {
    return new NullPlayer();
  }
  public void setPlayer(Player p) {}
  public void infoSeeFlagRight(int id, double distance, double direction) {}
  public void infoSeeFlagLeft(int id, double distance, double direction) {}
  public void infoSeeFlagOwn(int id, double distance, double direction) {}
  public void infoSeeFlagOther(int id, double distance, double direction) {}
  public void infoSeeFlagCenter(int id, double distance, double direction) {}
  public void infoSeeFlagCornerOwn(int id, double distance, double direction) {}
  public void infoSeeFlagCornerOther(int id, double distance, double direction) {}
  public void infoSeeFlagPenaltyOwn(int id, double distance, double direction) {}
  public void infoSeeFlagPenaltyOther(int id, double distance, double direction) {}
  public void infoSeeFlagGoalOwn(int id, double distance, double direction) {}
  public void infoSeeFlagGoalOther(int id, double distance, double direction) {}
  public void infoSeeLine(int id, double distance, double direction) {}
  public void infoSeePlayerOther(int number, double distance, double direction) {}
  public void infoSeePlayerOwn(int number, double distance, double direction) {}
  public void infoSeeBall(double distance, double direction) {}
  public void infoHearReferee(int refereeMessage) {}
  public void infoHearPlayMode(int playMode) {}
  public void infoHear(double direction, String message) {}
  public void infoSenseBody(int viewQuality, int viewAngle, double stamina, double speed,
      double headAngle, int kickCount, int dashCount, int turnCount, int sayCount,
      int turnNeckCount) {}
}