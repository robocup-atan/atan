package atan.test;

import atan.model.*;
import java.io.*;

/**
 * A dummy implementation of Player that does noting by default.
 */

public class DummyPlayer implements Player {

  private StringBuffer buf = new StringBuffer();
  private boolean isTeamEast = true;
  private String name = "teamEast";
  private int number;

  public DummyPlayer() {
  }
  public void catchBall(double direction) {}
  public void changeViewMode(ViewQuality qal, ViewAngle angle) {}
  public void dash(int power) {}
  public void move(int x, int y) {}
  public void say(String message) {}
  public void senseBody() {}
  public void turn(double angle) {}
  public void turnNeck(double angle) {}

  public void handleError(String error){
    buf.append("|error");
    buf.append("|");
    buf.append(error);
  }
  public boolean isTeamEast(){
    return isTeamEast;
  }
  public String getTeamName() {
    return name;
  }
  public void setTeamName(String n) {
    name = n;
  }
  public void setTeamEast(boolean isTeamEast){
    this.isTeamEast = isTeamEast;
    buf.append("|isTeamEast");
    buf.append("|");
    if (isTeamEast) buf.append("true");
    else buf.append("false");
  }
  public String getBuffer(){
    return buf.toString();
  }
  public void resetBuffer(){
    buf = new StringBuffer();
  }
  public void setNumber(int num){
    number = num;
  }
  public int getNumber() {
    return number;
  }
  public void bye() {
  }
  public void kick (int power, double direction) {
  }
  public PrintWriter getLogger(){
    return new PrintWriter(System.out);
  }
  public int getLoglevel(){
    return 0;
  }
}