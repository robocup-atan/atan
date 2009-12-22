package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Team;

import org.apache.log4j.BasicConfigurator;

/**
 * Class description
 * @author Atan
 */
public class Simple2Run {

    /**
     * Method description
     * @param args
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        if (args.length == 0) {
            Team team = new SimplySillyTeam("Simple2", 6000, "localhost");
            team.connectAll();
        } else {
            Integer val      = new Integer(args[0]);
            int     port     = val.intValue();
            String  hostname = args[1];
            Team    team     = new SimplySillyTeam("Simple2", port, hostname);
            team.connectAll();
        }
    }
}
