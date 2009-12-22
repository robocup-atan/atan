package atan.parser;

/**
 * An interface that shall help to filter the different server
 * commands (see, hear, error, ...). Implementaions of this interface
 * are used as parameter for the parser which will call the
 * appropreate methods. As probably not all messages from the server
 * will have to be completely parsed the command filter acts as a
 * preselection of commands.
 *
 * @author Atan
 */
public interface CommandFilter {

    /**
     * Filter for the see command.
     * @param cmd
     */
    public void seeCommand(String cmd);

    /**
     * Filter for the hear command.
     * @param cmd
     */
    public void hearCommand(String cmd);

    /**
     * Filter for the sense body command.
     * @param cmd
     */
    public void senseBodyCommand(String cmd);

    /**
     * Filter for the initilisation comand.
     * @param cmd
     */
    public void initCommand(String cmd);

    /**
     * Filter for the error command.
     * @param cmd
     */
    public void errorCommand(String cmd);
}
