package sample;

import org.apache.log4j.BasicConfigurator;

import atan.model.*;

public class Simple1Run {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Team team = null;
        if (args.length == 0) {
            team = new SimplySillyTeam("Simple1", 6000, "localhost");
        } else {
            Integer val = new Integer(args[0]);
            int port = val.intValue();
            String hostname = args[1];
            team = new SimplySillyTeam("Simple1", port, hostname);
        }
        team.connectAll();
    }
}