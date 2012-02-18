package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.util.Properties;

/**
 * An abstract class to use for teams.
 *
 * @author Atan
 */
public abstract class AbstractTeam {
    private static final int COACH_PORT   = 6002;
    private static final int TRAINER_PORT = 6001;
    private static Logger    log          = Logger.getLogger(AbstractTeam.class);
    private String           hostname     = "localhost";
    private int              playerPort   = 6000;
    private SServerPlayer[]  players      = new SServerPlayer[11];
    private boolean          hasCoach     = false;
    private Properties       additional;
    private SServerCoach     coach;
    private String           teamName;

    /**
     * Connect the team to the server using the default player settings.
     * No coach.
     *
     * @param teamName The name of the team to connect.
     */
    public AbstractTeam(String teamName) {
        this(teamName, 6000, "localhost", false, new Properties());
    }

    /**
     * Connect the team to the server using specified player settings.
     * Uses default coach port.
     *
     * @param teamName The name of the team to connect.
     * @param port The port for players to connect to.
     * @param hostname The hostname to connect to.
     * @param hasCoach Does this team use a coach?
     */
    public AbstractTeam(String teamName, int port, String hostname, boolean hasCoach) {
        this(teamName, port, hostname, hasCoach, new Properties());
    }

    /**
     * Connect the team to the server using specified player settings.
     * Uses default coach port.
     *
     * @param teamName The name of the team to connect.
     * @param port The port for players to connect to.
     * @param hostname The hostname to connect to.
     * @param hasCoach Does this team use a coach?
     * @param additional Any additionl properties you may want for your team.
     */
    public AbstractTeam(String teamName, int port, String hostname, boolean hasCoach, Properties additional) {
        this.teamName   = teamName;
        this.playerPort = port;
        this.hostname   = hostname;
        this.hasCoach   = hasCoach;
        this.additional = additional;
        createNewPlayers();
        if (hasCoach) {
            createNewCoach();
        }
        int n = players.length;
        if (hasCoach) {
            log.info("Created new team. " + teamName + " with " + n + " players and a coach. Connecting to " + hostname
                     + ":" + port + ".");
        } else {
            log.info("Created new team. " + teamName + " with " + n + " players. Connecting to " + hostname + ":"
                     + port + ".");
        }
    }

    /**
     * Returns the team name.
     *
     * @return Team name.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Returns the additional properties.
     *
     * @return Your properties. Or a blank Properties if none specified in the Constructor.
     */
    public Properties getProperties() {
        return additional;
    }

    /**
     * Gets a new ControllerPlayer.
     *
     * @param i The number of the player.
     * @return A ControllerPlayer implementation.
     */
    public abstract ControllerPlayer getNewControllerPlayer(int i);

    /**
     * Gets a new ControllerCoach.
     *
     * @return A ControllerCoach implementation.
     */
    public abstract ControllerCoach getNewControllerCoach();

    /**
     * Create 11 SServerPlayer's.
     */
    public void createNewPlayers() {
        for (int i = 0; i < size(); i++) {
            players[i] = new SServerPlayer(teamName, getNewControllerPlayer(i), playerPort, hostname);
        }
    }

    /**
     * Create a new SServerCoach.
     */
    public void createNewCoach() {
        coach = new SServerCoach(teamName, getNewControllerCoach(), COACH_PORT, hostname);
    }

    /**
     * Kill all players and the coach (if connected).
     */
    public void killAll() {
        for (int i = 0; i < size(); i++) {
            if (i == 0) {
                players[i].bye();
                players[i].stopRunning();
            } else if (i >= 1) {
                try {
                    players[i].bye();
                    players[i].stopRunning();
                } catch (Exception ex) {
                    players[i].handleError(ex.getMessage());
                }
            }
            pause(500);
        }
        if (hasCoach) {
            try {
                coach.bye();
                coach.stopRunning();
            } catch (Exception ex) {
                coach.handleError(ex.getMessage());
            }
            pause(500);
        }
    }

    /**
     * Connect all the players to the server.
     * ActionsPlayer with index 0 is always the goalie.
     * Connects a coach if there is one.
     */
    public void connectAll() {
        for (int i = 0; i < size(); i++) {
            if (i == 0) {
                players[i].connect("", true);
            } else if (i >= 1) {
                try {
                    players[i].connect("", false);
                } catch (Exception ex) {
                    players[i].handleError(ex.getMessage());
                }
            }
            pause(500);
        }
        if (hasCoach) {
            try {
                coach.connect();
            } catch (Exception ex) {
                coach.handleError(ex.getMessage());
            }
            pause(500);
        }
    }

    /**
     * Connect the selected player to the server.
     * The player with index 0 is always the goalie.
     *
     * @param index The number of the player to connect.
     */
    public void connect(int index) {
        try {
            if (index == 0) {
                players[index].connect("", true);
            } else {
                players[index].connect("", false);
            }
        } catch (Exception ex) {
            players[index].handleError(ex.getMessage());
        }
        pause(500);
    }

    /**
     * Returns the size of the team.
     *
     * @return The size of the team.
     */
    public int size() {
        return 11;
    }

    /**
     * Pause the thread.
     * @param ms How long to pause the thread for (in ms).
     */
    private synchronized void pause(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {
            log.warn("Interrupted Exception ", ex);
        }
    }
}
