package com.github.robocup_atan.atan.parser;

/**
 * An interface that shall help to filter the different server
 * commands (see, hear, error, ...). Implementations of this interface
 * are used as parameter for the parser which will call the
 * Appropriate methods. As probably not all messages from the server
 * will have to be completely parsed the command filter acts as a
 * preselection of commands.
 *
 * @author Atan
 */
public interface CommandFilter {

    /**
     * Filter for the see command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void seeCommand(String cmd);

    /**
     * Filter for the hear command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void hearCommand(String cmd);

    /**
     * Filter for the sense body command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void senseBodyCommand(String cmd);

    /**
     * Filter for the initialisation command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void initCommand(String cmd);

    /**
     * Filter for the error command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void errorCommand(String cmd);

    /**
     * Filter for the server param command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void serverParamCommand(String cmd);

    /**
     * Filter for the player param command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void playerParamCommand(String cmd);

    /**
     * Filter for the player type command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void playerTypeCommand(String cmd);

    /**
     * Filter for the change player type command
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void changePlayerTypeCommand(String cmd);
    /**
     * Filter for the OK command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void okCommand(String cmd);

    /**
     * Filter for the warning command.
     *
     * @param cmd a {@link java.lang.String} object.
     */
    public void warningCommand(String cmd);
}
