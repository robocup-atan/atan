package atan.view;

import atan.model.*;

public class NullPlayer extends SServerPlayer {

  public NullPlayer() {
    super(null, new NullController(), 6000, "localhost");
  }
  public String getTeamName() {
    return "Null Player";
  }
  public boolean isTeamEast() {
    return true;
  }
  public void isTeamEast(boolean is) {
  }
  public void setNumber(int num) {
  }
  public int getNumber() {
    return 0;
  }
  public void connect() {
    if (getLoglevel() > 1) getLogger().println("NullPlayer cannot be initialized");
  }
  public String toStateString(){
    return "";
  }
}