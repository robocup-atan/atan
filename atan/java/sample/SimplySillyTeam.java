package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Controller;
import atan.model.Team;

/**
 * Class description
 * @author Atan
 */
public class SimplySillyTeam extends Team {

    /**
     * Constructs ...
     * @param name
     * @param port
     * @param hostname
     */
    public SimplySillyTeam(String name, int port, String hostname) {
        super(name, port, hostname);
    }

    /**
     * The first controller of the team is silly the others are simple.
     * @param number
     * @return
     */
    @Override
    public Controller getNewController(int number) {
        if (number == 0) {
            return new Silly();
        } else {
            return new Simple();
        }
    }
}
