package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.AbstractTeam;

import org.apache.log4j.BasicConfigurator;

/**
 * A main class to start a simply silly team.
 * @author Atan
 */
public class Simple2Run {

    /**
     * Start up team Simple2
     * @param args No args
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        if (args.length == 0) {
            AbstractTeam team = new SimplySillyTeam("Simple2", 6000, "localhost");
            team.connectAll();
        } else {
            Integer val      = new Integer(args[0]);
            int     port     = val.intValue();
            String  hostname = args[1];
            AbstractTeam    team     = new SimplySillyTeam("Simple2", port, hostname);
            team.connectAll();
        }
    }
}
