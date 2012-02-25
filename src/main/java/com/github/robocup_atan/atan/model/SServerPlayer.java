package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.ViewAngle;
import com.github.robocup_atan.atan.model.enums.ViewQuality;

import com.github.robocup_atan.atan.parser.CommandFilter;
import com.github.robocup_atan.atan.parser.Filter;
import com.github.robocup_atan.atan.parser.player.CmdParserPlayer;

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import java.io.StringReader;

/**
 * A simple implementation of AbstractUDPClient for Players.
 *
 * @author Atan
 */
public class SServerPlayer extends AbstractUDPClient implements ActionsPlayer {
    private static final int     PLAYER_PORT    = 6000;
    private static Logger        log            = Logger.getLogger(SServerPlayer.class);
    private String               initMessage    = null;
    private int                  number         = -1;
    private CmdParserPlayer      parser         = new CmdParserPlayer(new StringReader(""));
    private Filter               filter         = new Filter();
    private CommandFactory       commandFactory = new CommandFactory();
    private SServerCommandBuffer cmdBuf         = new SServerCommandBuffer();
    private ControllerPlayer     controller;
    private boolean              isTeamEast;
    private String               teamName;

    /**
     * A part constructor for SServerPlayer (assumes localhost:6000)
     *
     * @param teamName The team name.
     * @param c The controller for the player.
     */
    public SServerPlayer(String teamName, ControllerPlayer c) {
        this(teamName, c, PLAYER_PORT, "localhost");
    }

    /**
     * The full constructor for SServerPlayer.
     *
     * @param teamName The teams name.
     * @param c The controller for the player.
     * @param port The port to connect to.
     * @param hostname The host address.
     */
    public SServerPlayer(String teamName, ControllerPlayer c, int port, String hostname) {
        super(port, hostname);
        this.teamName   = teamName;
        this.controller = c;
        c.setPlayer(this);
    }

    /** {@inheritDoc} */
    @Override
    public String getInitMessage() {
        return initMessage;
    }

    /**
     * Connects to the server via AbstractUDPClient.
     *
     * @param isGoalie a boolean.
     */
    public void connect(boolean isGoalie) {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand(teamName, isGoalie);
        initMessage = f.next();
        super.start();
    }

    /** {@inheritDoc} */
    @Override
    public void start() {
        throw new Error("SServerPlayer should not use start. Use connect() instead");
    }

    /** {@inheritDoc} */
    @Override
    public void received(String msg) throws IOException {
        try {
            if (log.isDebugEnabled()) {
                log.debug("<---'" + msg + "'");
            }
            filter.run(msg, cmdBuf);
            cmdBuf.takeStep(controller, parser, this);
            while (commandFactory.hasNext()) {
                String cmd = commandFactory.next();
                if (log.isDebugEnabled()) {
                    log.debug("--->'" + cmd + "'");
                }
                send(cmd);
                pause(50);
            }
        } catch (Exception ex) {
            log.error("Error while receiving message: " + msg + " " + ex.getMessage(), ex);
        }
    }

    /** {@inheritDoc} */
    @Override
    public void setTeamEast(boolean is) {
        this.isTeamEast = is;
    }

    /** {@inheritDoc} */
    @Override
    public void dash(int power) {
        this.commandFactory.addDashCommand(power);
    }

    /** {@inheritDoc} */
    @Override
    public void kick(int power, double direction) {
        this.commandFactory.addKickCommand(power, (int) direction);
    }

    /** {@inheritDoc} */
    @Override
    public void move(int x, int y) {
        this.commandFactory.addMoveCommand(x, y);
    }

    /** {@inheritDoc} */
    @Override
    public void say(String message) {
        this.commandFactory.addSayCommand(message);
    }

    /** {@inheritDoc} */
    @Override
    public void turn(double angle) {
        this.commandFactory.addTurnCommand((int) angle);
    }

    /** {@inheritDoc} */
    @Override
    public void turnNeck(double angle) {}

    /** {@inheritDoc} */
    @Override
    public void catchBall(double direction) {
        this.commandFactory.addCatchCommand((int) direction);
    }

    /** {@inheritDoc} */
    @Override
    public void changeViewMode(ViewQuality quality, ViewAngle angle) {
        this.commandFactory.addChangeViewCommand(angle, quality);
    }

    /** {@inheritDoc} */
    @Override
    public void bye() {
        this.commandFactory.addByeCommand();
    }

    /** {@inheritDoc} */
    @Override
    public String getTeamName() {
        return teamName;
    }

    /** {@inheritDoc} */
    @Override
    public void setNumber(int num) {
        number = num;
        super.setName(teamName + " Player # " + getNumber());
    }

    /** {@inheritDoc} */
    @Override
    public int getNumber() {
        return number;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isTeamEast() {
        return isTeamEast;
    }

    /**
     * Create a list string.
     *
     * @return A list string.
     */
    public String toListString() {
        StringBuffer buf = new StringBuffer();
        buf.append(controller.getClass().getName());
        return buf.toString();
    }

    /** {@inheritDoc} */
    @Override
    public String toStateString() {
        StringBuffer buf = new StringBuffer();
        buf.append(super.toStateString());
        buf.append("Team Name: ");
        buf.append(this.getTeamName());
        buf.append("\n");
        buf.append("Number: ");
        buf.append(this.getNumber());
        buf.append("\n");
        buf.append("Running: ");
        buf.append(isRunning());
        buf.append("\n");
        buf.append("ControllerPlayer Class: ");
        buf.append(controller.getClass().getName());
        buf.append("\n");
        return buf.toString();
    }

    /** {@inheritDoc} */
    @Override
    public void handleError(String error) {
        log.error(error);
    }

    /** {@inheritDoc} */
    @Override
    protected String getDescription() {
        StringBuffer nam = new StringBuffer(getTeamName());
        nam.append(" ");
        if (this.number >= 0) {
            nam.append(this.number);
        } else {
            nam.append("<undefined>");
        }
        return nam.toString();
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

    /**
     * A private player-style filter
     * @author Atan
     */
    private static class SServerCommandBuffer implements CommandFilter {
        private String changePlayerTypeCommand = null;
        private String errorCommand            = null;
        private String hearCommand             = null;
        private String initCommand             = null;
        private String okCommand               = null;
        private String playerParamCommand      = null;
        private String playerTypeCommand       = null;
        private String seeCommand              = null;
        private String senseBodyCommand        = null;
        private String serverParamCommand      = null;
        private String warningCommand          = null;

        /**
         * @inheritDoc
         */
        @Override
        public void seeCommand(String cmd) {
            seeCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void hearCommand(String cmd) {
            hearCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void senseBodyCommand(String cmd) {
            senseBodyCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void initCommand(String cmd) {
            initCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void errorCommand(String cmd) {
            errorCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void serverParamCommand(String cmd) {
            serverParamCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void playerParamCommand(String cmd) {
            playerParamCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void playerTypeCommand(String cmd) {
            playerTypeCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void changePlayerTypeCommand(String cmd) {
            changePlayerTypeCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void okCommand(String cmd) {
            okCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        @Override
        public void warningCommand(String cmd) {
            warningCommand = cmd;
        }

        /**
         * @inheritDoc
         */
        public void takeStep(ControllerPlayer controller, CmdParserPlayer parser, ActionsPlayer c) throws Exception {
            if (seeCommand != null) {
                controller.preInfo();
                parser.parseSeeCommand(seeCommand, controller, c);
                seeCommand = null;
                if (hearCommand != null) {
                    parser.parseHearCommand(hearCommand, controller, c);
                    hearCommand = null;
                }
                if (senseBodyCommand != null) {
                    parser.parseSenseBodyCommand(senseBodyCommand, controller, c);
                    senseBodyCommand = null;
                }
                if (initCommand != null) {
                    parser.parseInitCommand(initCommand, controller, c);
                    initCommand = null;
                }
                if (okCommand != null) {
                    parser.parseOkCommand(okCommand, controller, c);
                    okCommand = null;
                }
                if (warningCommand != null) {
                    parser.parseWarningCommand(warningCommand, controller, c);
                    warningCommand = null;
                }
                if (serverParamCommand != null) {
                    parser.parseServerParamCommand(serverParamCommand, controller, c);
                    serverParamCommand = null;
                }
                if (playerParamCommand != null) {
                    parser.parsePlayerParamCommand(playerParamCommand, controller, c);
                    playerParamCommand = null;
                }
                if (playerTypeCommand != null) {
                    parser.parsePlayerTypeCommand(playerTypeCommand, controller, c);
                    playerTypeCommand = null;
                }
                if (changePlayerTypeCommand != null) {
                    parser.parseChangePlayerTypeCommand(changePlayerTypeCommand, controller, c);
                    changePlayerTypeCommand = null;
                }
                if (errorCommand != null) {
                    parser.parseErrorCommand(errorCommand, controller, c);
                    errorCommand = null;
                }
                controller.postInfo();
            }
        }
    }
}
