package atan.parser;

/**
 * This class takes the input string from the SServer and determines which
 * type of command it is. (see, hear, sense body, ...)
 * @author Atan
 */
public class Filter {

    /**
     * Works out what type of command has been put into the method.
     * @param cmd The string of text from SServer.
     * @param f An instance of CommandFilter.
     */
    public void run(String cmd, CommandFilter f) {
        char c1, c2;
        c1 = cmd.charAt(1);
        switch (c1) {
            case 's' :    // Server command begins with s (see, see_global, sense_body, server_param)
                if ((c2 = cmd.charAt(3)) == 'e') {
                    if ((cmd.charAt(5)) == 'g') {
                        f.seeCommand(cmd.substring(12, cmd.length() - 1));
                    } else {
                        f.seeCommand(cmd.substring(5, cmd.length() - 1));
                    }
                } else if (c2 == 'n') {
                    f.senseBodyCommand(cmd.substring(12, cmd.length() - 1));
                } else if (c2 == 'r') {

                    // f.serverParamCommand(cmd.substring(14, cmd.length() - 1));
                }
                break;
            case 'p' :    // Server command begins with p (player_param, player_type)
                if ((c2 = cmd.charAt(8)) == 'p') {

                    // f.playerParamCommand(cmd.substring(14, cmd.length() - 1));
                } else if (c2 == 't') {

                    // f.playerTypeCommand(cmd.substring(13, cmd.length() - 1));
                }
                break;
            case 'i' :    // Server command begins with i (init)
                f.initCommand(cmd.substring(6, cmd.length() - 1));
                break;
            case 'h' :    // Server command begins with h (hear)
                f.hearCommand(cmd.substring(6, cmd.length() - 1));
                break;
            case 'o' :    // Server command begins with o (ok)

                // f.okCommand(cmd.substring(4, cmd.length() - 1));
                break;
            case 'w' :    // Server command begins with w (warning)

                // f.warningCommand(cmd.substring(9, cmd.length() - 1));
                break;
            case 'c' :    // Server command begine with c (change_player_type)

                // f.changePlayerTypeCommand(cmd.substring(20, cmd.length() - 1));
                break;
            case 'e' :    // Server command begins with e (error)
                f.errorCommand(cmd.substring(7, cmd.length() - 1));
                break;
            default :     // Unknown command
                throw new Error("Invalid command'" + cmd + "'");
        }
    }
}
