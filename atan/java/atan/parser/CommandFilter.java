package atan.parser;

/**
 * An interface that shall help to filter the different server
 * commands (see, hear, error, ...). Implementaions of this interface
 * are used as parameter for the parser which will call the
 * appropreate methods. As probably not all messages from the server
 * will have to be completely parsed the command filter acts as a
 * preselection of commands.
 */

public interface CommandFilter {

  public void seeCommand(String cmd);
  public void hearCommand(String cmd);
  public void senseBodyCommand(String cmd);
  public void initCommand(String cmd);
  public void errorCommand(String cmd);

}