package atan.parser;

public class Filter {

  public void run(String cmd, CommandFilter f) {
    char c1, c2;
    if((c1=cmd.charAt(1))=='s') {
      if((c2=cmd.charAt(3))=='e') {
        f.seeCommand(cmd.substring(5, cmd.length()-1));
      }
      else if(c2=='n') {
        f.senseBodyCommand(cmd.substring(12, cmd.length()-1));
      }
    }
    else if(c1=='e') {
      f.errorCommand(cmd.substring(7, cmd.length()-1));
    }
    else if(c1=='i') {
      f.initCommand(cmd.substring(6, cmd.length()-1));
    }
    else if(c1=='h') {
      f.hearCommand(cmd.substring(6, cmd.length()-1));
    }
    else throw new Error("Invalid command'"+cmd+"'");
  }
}