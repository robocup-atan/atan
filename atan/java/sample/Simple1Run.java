package sample;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.Team;

import org.apache.log4j.BasicConfigurator;

/**
 * Class description
 * @author Atan
 */
public class Simple1Run {

    /**
     * Method description
     * @param args
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Team team = null;
        if (args.length == 0) {
            team = new SimplySillyTeam("Simple1", 6000, "localhost");
        } else {
            Integer val      = new Integer(args[0]);
            int     port     = val.intValue();
            String  hostname = args[1];
            team = new SimplySillyTeam("Simple1", port, hostname);
        }
        team.connectAll();
    }
}
