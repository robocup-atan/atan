package com.github.robocup_atan.atan.parser;

/*
 * #%L
 * Atan
 * %%
 * Copyright (C) 2003 - 2014 Atan
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

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
