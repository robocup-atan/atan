package sample;

import atan.model.*;

public class Simple2Run {

  public static void main(String[] args) {
    if (args.length == 0) {
      Team t = new SimplySillyTeam("Simple2", 6000, "localhost");
      t.connectAll();
    }
    else {
      Integer val = new Integer(args[0]);
      int port = val.intValue();
      String hostname = args[1];
      Team t = new SimplySillyTeam("Simple2", port, hostname);
      t.connectAll();
    }
  }
}