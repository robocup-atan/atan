package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.AbstractTeam;
import atan.model.ControllerPlayer;

/**
 * A class to setup a Simple Silly AbstractTeam.
 * @author Atan
 */
public class SimplySillyTeam extends AbstractTeam {

    /**
     * Constructs a new simple silly team.
     * @param name The team name.
     * @param port The port to connect to SServer.
     * @param hostname The SServer hostname.
     */
    public SimplySillyTeam(String name, int port, String hostname) {
        super(name, port, hostname);
    }

    /**
     * The first controller of the team is silly the others are simple.
     * @param number The player number.
     * @return A new controller for that player.
     */
    @Override
    public ControllerPlayer getNewController(int number) {
        if (number == 0) {
            return new Silly();
        } else {
            return new Simple();
        }
    }
}
