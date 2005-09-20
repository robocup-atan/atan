package atan.model;

import java.util.*;

public class CommandFactory {

  private List fifo = new Vector();

  public CommandFactory() {
  }
  public void addInitCommand(String teamName, boolean isGoaly){
    StringBuffer buf = new StringBuffer();
    if (isGoaly) {
      buf.append("(init ");
      buf.append(teamName);
      buf.append(" g)");
    }
    else {
      buf.append("(init ");
      buf.append(teamName);
      buf.append(")");
    }
    fifo.add(fifo.size(), buf.toString());
  }
  public void addReconnectCommand(String teamName, int num){
    StringBuffer buf = new StringBuffer();
    buf.append("(reconnect ");
    buf.append(teamName);
    buf.append(" ");
    buf.append(num);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addCatchCommand(int direction){
    StringBuffer buf = new StringBuffer();
    buf.append("(catch ");
    buf.append(direction);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addChangeViewCommand(int angle, int quality){
    StringBuffer buf = new StringBuffer();
    buf.append("(change_view ");
    switch (angle) {
      case Controller.VIEW_ANGLE_NARROW:
        switch (quality) {
          case Controller.VIEW_QUALITY_HIGH: buf.append("narrow high)"); break;
          case Controller.VIEW_QUALITY_LOW: buf.append("narrow low)"); break;
        }
        break;
      case Controller.VIEW_ANGLE_NORMAL:
        switch (quality) {
          case Controller.VIEW_QUALITY_HIGH: buf.append("normal high)"); break;
          case Controller.VIEW_QUALITY_LOW: buf.append("normal low)"); break;
        }
        break;
      case Controller.VIEW_ANGLE_WIDE:
        switch (quality) {
          case Controller.VIEW_QUALITY_HIGH: buf.append("wide high)"); break;
          case Controller.VIEW_QUALITY_LOW: buf.append("wide low)"); break;
        }
        break;
    }
    fifo.add(fifo.size(), buf.toString());
  }
  public void addDashCommand(int power){
    StringBuffer buf = new StringBuffer();
    buf.append("(dash ");
    buf.append(power);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addKickCommand(int power, int direction){
    StringBuffer buf = new StringBuffer();
    buf.append("(kick ");
    buf.append(power);
    buf.append(" ");
    buf.append(direction);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addMoveCommand(int x, int y){
    StringBuffer buf = new StringBuffer();
    buf.append("(move ");
    buf.append(x);
    buf.append(" ");
    buf.append(y);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addTurnCommand(int angle){
    StringBuffer buf = new StringBuffer();
    buf.append("(turn ");
    buf.append(angle);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addTurnNeckCommand(int angle){
    StringBuffer buf = new StringBuffer();
    buf.append("(turn_neck ");
    buf.append(angle);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addSayCommand(String message){
    StringBuffer buf = new StringBuffer();
    buf.append("(say ");
    buf.append(message);
    buf.append(")");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addSenseBodyCommand(){
    StringBuffer buf = new StringBuffer();
    buf.append("(sense_body)");
    fifo.add(fifo.size(), buf.toString());
  }
  public void addByeCommand(){
    StringBuffer buf = new StringBuffer();
    buf.append("(bye)");
    fifo.add(fifo.size(), buf.toString());
  }
  public String next() {
    if (fifo.isEmpty()) throw new RuntimeException("Fifo is empty");
    String cmd = (String)fifo.get(0);
    fifo.remove(0);
    return cmd;
  }
  public boolean hasNext() {
    return !fifo.isEmpty();
  }
}