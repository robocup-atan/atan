package atan.model;

import org.apache.log4j.Logger;

public abstract class Team {

    private SServerPlayer[] players = new SServerPlayer[11];
    private String teamName;
    private int port = 6000;
    private String hostname = "localhost";
    private static Logger log = Logger.getLogger(Team.class);

    public Team(String teamName) {
        this(teamName, 6000, "localhost");
    }

    public Team(String teamName, int port, String hostname) {
        this.teamName = teamName;
        this.port = port;
        this.hostname = hostname;
        createNewPlayers();
        int n = players.length;
        log.info("Created new team. " + teamName + " with " + n + " players. Connecting to " + hostname + ":" + port
                + ".");

    }

    public String getTeamName() {
        return teamName;
    }

    public abstract Controller getNewController(int i);

    public void createNewPlayers() {
        for (int i = 0; i < size(); i++) {
            players[i] = new SServerPlayer(teamName, getNewController(i), port, hostname);
        }
    }

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

    public void connect(int index) {
        try {
            players[index].connect();
        } catch (Exception ex) {
            players[index].handleError(ex.getMessage());
        }
        pause(500);
    }

    public SServerPlayer getPlayer(int i) {
        SServerPlayer re = null;
        if (i >= 0 && i < players.length) {
            re = players[i];
        }
        return re;
    }

    public int size() {
        return 11;
    }

    private synchronized void pause(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {
        }
    }
}