package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.log4j.Logger;

/**
 * Class description
 * @author Atan
 */
public abstract class AbstractTeam {
    private static Logger   log      = Logger.getLogger(AbstractTeam.class);
    private String          hostname = "localhost";
    private SServerPlayer[] players  = new SServerPlayer[11];
    private int             port     = 6000;
    private String          teamName;

    /**
     * Constructs ...
     * @param teamName
     */
    public AbstractTeam(String teamName) {
        this(teamName, 6000, "localhost");
    }

    /**
     * Constructs ...
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
     * Method description
     * @return
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Method description
     * @param i
     * @return
     */
    public abstract Controller getNewController(int i);

    /**
     * Method description
     */
    public void createNewPlayers() {
        for (int i = 0; i < size(); i++) {
            players[i] = new SServerPlayer(teamName, getNewController(i), port, hostname);
        }
    }

    /**
     * Method description
     */
    public void connectAll() {
        for (int i = 0; i < size(); i++) {
            try {
                players[i].connect();
            } catch (Exception ex) {
                players[i].handleError(ex.getMessage());
            }
            pause(500);
        }
    }

    /**
     * Method description
     * @param index
     */
    public void connect(int index) {
        try {
            players[index].connect();
        } catch (Exception ex) {
            players[index].handleError(ex.getMessage());
        }
        pause(500);
    }

    /**
     * Method description
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
     * Method description
     * @return
     */
    public int size() {
        return 11;
    }

    /**
     * Method description
     * @param ms
     */
    private synchronized void pause(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {}
    }
}
