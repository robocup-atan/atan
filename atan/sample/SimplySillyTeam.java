package sample;

import atan.model.*;

public class SimplySillyTeam extends Team {

  public SimplySillyTeam(String name, int port, String hostname){
    super(name, port, hostname);
  }
  /**
   * The first controller of the team is silly the others are simple.
   */
  public Controller getNewController(int number) {
    if (number == 0) return new Silly();
    else return new Simple();
  }
}
