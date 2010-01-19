package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.log4j.Logger;

/**
 * An abstract class to use for teams.
 * @author Atan
 */
public abstract class AbstractTeam {
    private static Logger   log      = Logger.getLogger(AbstractTeam.class);
    private String          hostname = "localhost";
    private SServerPlayer[] players  = new SServerPlayer[11];
    private int             port     = 6000;
    private String          teamName;

    /**
     * Connect the team to the server using the default settings.
     * @param teamName
     */
    public AbstractTeam(String teamName) {
        this(teamName, 6000, "localhost");
    }

    /**
     * Connect the team to the server using specified settings.
     * @param teamName
     * @param port
     * @param hostname
     */
    public AbstractTeam(String teamName, int port, String hostname) {
        this.teamName = teamName;
        this.port     = port;
        this.hostname = hostname;
        createNewPlayers();
        int n = players.length;
        log.info("Created new team. " + teamName + " with " + n + " players. Connecting to " + hostname + ":" + port
                 + ".");
    }

    /**
     * Returns the team name.
     * @return
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 
     * @param i
     * @return
     */
    public abstract Controller getNewController(int i);

    /**
     * 
     */
    public void createNewPlayers() {
        for (int i = 0; i < size(); i++) {
            players[i] = new SServerPlayer(teamName, getNewController(i), port, hostname);
        }
    }

    /**
     * Connect all the players to the server.
     * Player with index 0 is always the goalie.
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
    }

    /**
     * Connect the selected player to the server.
     * The player with index 0 is always the goalie.
     * @param index
     */
    public void connect(int index) {
        try {
            if(index == 0){
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
     * 
     * @param i
     * @return
     */
    public SServerPlayer getPlayer(int i) {
        SServerPlayer re = null;
        if ((i >= 0) && (i < players.length)) {
            re = players[i];
        }
        return re;
    }

    /**
     * 
     * @return
     */
    public int size() {
        return 11;
    }

    /**
     * 
     * @param ms
     */
    private synchronized void pause(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {}
    }
}
