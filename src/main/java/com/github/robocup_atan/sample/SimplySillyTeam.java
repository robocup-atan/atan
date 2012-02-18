package com.github.robocup_atan.sample;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.AbstractTeam;
import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;

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
     * @param hasCoach True if connecting a coach.
     */
    public SimplySillyTeam(String name, int port, String hostname, boolean hasCoach) {
        super(name, port, hostname, hasCoach);
    }

    /**
     * The first controller of the team is silly the others are simple.
     * @param number The player number.
     * @return A new controller for that player.
     */
    @Override
    public ControllerPlayer getNewControllerPlayer(int number) {
        if (number == 0) {
            return new Silly();
        } else {
            return new Simple();
        }
    }

    /**
     * Generates a new coach.
     * @return A new coach controller.
     */
    @Override
    public ControllerCoach getNewControllerCoach() {
        return new Coach();
    }
}
