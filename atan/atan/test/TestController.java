package atan.test;

import atan.model.*;
import java.util.*;

public class TestController implements Controller {

  private Set result = new HashSet();

  public TestController() {}
  public void preInfo() {}
  public void postInfo() {}


  Set getResult() {
    return result;
  }
  public Player getPlayer() {
    return new DummyPlayer();
  }
  public void setPlayer(Player p) {}

  public void infoSeeFlagRight(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagRight");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagLeft(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagLeft");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagOwn(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagOwn");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagOther(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagOther");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagCenter(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagCenter");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagCornerOwn(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagCornerOwn");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagCornerOther(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagCornerOther");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagPenaltyOwn(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagPenaltyOwn");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagPenaltyOther(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagPenaltyOther");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagGoalOwn(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagGoalOwn");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeFlagGoalOther(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeFlagGoalOther");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeLine(int id, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeLine");
    b.append("|");b.append(id);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeePlayerOther(int number, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeePlayerOther");
    b.append("|");b.append(number);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeePlayerOwn(int number, double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeePlayerOwn");
    b.append("|");b.append(number);
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoSeeBall(double distance, double direction) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSeeBall");
    b.append("|");b.append(distance);
    b.append("|");b.append(direction);
    result.add(b.toString());
  }
  public void infoHearReferee(int message) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoHearReferee");
    b.append("|");b.append(message);
    result.add(b.toString());
  }
  public void infoHearPlayMode(int message) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoHearPlayMode");
    b.append("|");b.append(message);
    result.add(b.toString());
  }
  public void infoHear(double direction, String message) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoHear");
    b.append("|");b.append(direction);
    b.append("|");b.append(message);
    result.add(b.toString());
  }
  public void infoSenseBody(int viewMode, int viewAngle, double stamina, double speed,
      double headAngle, int kickCount, int dashCount, int turnCount, int sayCount,
      int turnNeckCount) {
    StringBuffer b = new StringBuffer();
    b.append("|");b.append("infoSenseBody");
    b.append("|");b.append(viewMode);
    b.append("|");b.append(viewAngle);
    b.append("|");b.append(stamina);
    b.append("|");b.append(speed);
    b.append("|");b.append(headAngle);
    b.append("|");b.append(kickCount);
    b.append("|");b.append(dashCount);
    b.append("|");b.append(turnCount);
    b.append("|");b.append(sayCount);
    b.append("|");b.append(turnNeckCount);
    result.add(b.toString());
  }
}
