package atan.sample;

import atan.view.*;

public class Simple1Main {

  public static void main(String[] args) {
    if (args.length == 0) {
      TeamJFrame f = new TeamJFrame(new SimplySillyTeam("Simple1", 6000, "localhost"));
      f.setVisible(true);
    }
    else {
      Integer val = new Integer(args[0]);
      int port = val.intValue();
      String hostname = args[1];
      TeamJFrame f = new TeamJFrame(new SimplySillyTeam("Simple1", port, hostname));
      f.setVisible(true);
    }
  }
}