package atan.test;

import atan.parser.*;

public class TestCommandFilter implements CommandFilter{

  private final static int UNDEFINED = 0;
  private final static int ERROR = 1;
  private final static int SEE = 2;
  private final static int HEAR = 3;
  private final static int SENSE_BODY = 4;
  private final static int INIT = 5;

  private int type = UNDEFINED;
  private String cmd = "";


  void reset () {
    type = UNDEFINED;
    cmd = "";
  }
  boolean isTypeUndefined() {
    return type == UNDEFINED;
  }
  boolean isTypeError() {
    return type == ERROR;
  }
  boolean isTypeSee() {
    return type == SEE;
  }
  boolean isTypeHear() {
    return type == HEAR;
  }
  boolean isTypeSenseBody() {
    return type == SENSE_BODY;
  }
  boolean isTypeInit() {
    return type == INIT;
  }
  String getCommand () {
    return cmd;
  }
  public void seeCommand(String cmd) {
    type = SEE;
    this.cmd = cmd;
  }
  public void hearCommand(String cmd) {
    type = HEAR;
    this.cmd = cmd;
  }
  public void senseBodyCommand(String cmd) {
    type = SENSE_BODY;
    this.cmd = cmd;
  }
  public void initCommand(String cmd) {
    type = INIT;
    this.cmd = cmd;
  }
  public void errorCommand(String cmd) {
    type = ERROR;
    this.cmd = cmd;
  }
}