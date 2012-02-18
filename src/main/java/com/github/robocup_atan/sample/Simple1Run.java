package com.github.robocup_atan.sample;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.AbstractTeam;

import org.apache.log4j.BasicConfigurator;

/**
 * A main class to start a simply silly team.
 * @author Atan
 */
public class Simple1Run {

    /**
     * Start up team Simple1
     * @param args No args
     */
    public static void main(String[] args) {
        BasicConfigurator.configure();
        AbstractTeam team = null;
        if (args.length == 0) {
            team = new SimplySillyTeam("Simple1", 6000, "localhost", true);
        } else {
            Integer val      = new Integer(args[0]);
            int     port     = val.intValue();
            String  hostname = args[1];
            team = new SimplySillyTeam("Simple1", port, hostname, true);
        }
        team.connectAll();
    }
}
