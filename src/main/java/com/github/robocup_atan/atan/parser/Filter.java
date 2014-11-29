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

import java.lang.IllegalArgumentException;

/**
 * This class takes the input string from the SServer and determines which
 * type of command it is. (see, hear, sense body, ...)
 *
 * @author Atan
 */
public class Filter {

    private enum CommandWords {
        change_player_type,
        error,
        hear,
        init,
        ok,
        player_param,
        player_type,
        see,
        see_global,
        sense_body,
        server_param,
        warning,
        INVALID_COMMAND_WORD
    }

    /**
     * Works out what type of command has been put into the method.
     *
     * @param cmd The string of text from SServer.
     * @param f An instance of CommandFilter.
     */
    public void run(String cmd, CommandFilter f) {

        CommandWords commandWord = null;

        if ( cmd.contains(" ") ) {
            try {
                commandWord = CommandWords.valueOf(cmd.substring(1, cmd.indexOf(" ")));
            } catch (IllegalArgumentException e) {
                commandWord = CommandWords.INVALID_COMMAND_WORD;
            }
        } else {
            commandWord = CommandWords.INVALID_COMMAND_WORD;
        }

        switch (commandWord) {
            case change_player_type:
                f.changePlayerTypeCommand(cmd.substring(20, cmd.length() - 1));
                break;
            case error:
                f.errorCommand(cmd.substring(7, cmd.length() - 1));
                break;
            case hear:
                f.hearCommand(cmd.substring(6, cmd.length() - 1));
                break;
            case init:
                f.initCommand(cmd.substring(6, cmd.length() - 1));
                break;
            case ok:
                f.okCommand(cmd.substring(4, cmd.length() - 1));
                break;
            case player_param:
                f.playerParamCommand(cmd.substring(14, cmd.length() - 1));
                break;
            case player_type:
                f.playerTypeCommand(cmd.substring(13, cmd.length() - 1));
                break;
            case see:
                f.seeCommand(cmd.substring(5, cmd.length() - 1));
                break;
            case see_global:
                f.seeCommand(cmd.substring(12, cmd.length() - 1));
                break;
            case sense_body:
                f.senseBodyCommand(cmd.substring(12, cmd.length() - 1));
                break;
            case server_param:
                f.serverParamCommand(cmd.substring(14, cmd.length() - 1));
                break;
            case warning :
                f.warningCommand(cmd.substring(9, cmd.length() - 1));
                break;
            case INVALID_COMMAND_WORD :
            default :
                throw new Error("Invalid command received: \"" + cmd + "\"");
        }
    }
}

