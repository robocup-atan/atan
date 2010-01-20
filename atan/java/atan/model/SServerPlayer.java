package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;

import atan.parser.CmdParserPlayer;
import atan.parser.CommandFilter;
import atan.parser.Filter;

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author Atan
 */
public class SServerPlayer extends AbstractUDPClient implements ActionsPlayer {
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
     * @param teamName The team name.
     * @param c The controller for the player.
     */
    public SServerPlayer(String teamName, ControllerPlayer c) {
        this(teamName, c, 6000, "localhost");
    }

    /**
     * The full constructor for SServerPlayer.
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

    /**
     * Gets the initialisation message.
     * @return Initialisation message.
     */
    @Override
    public String getInitMessage() {
        return initMessage;
    }

    /**
     * Connects to the server via AbstractUDPClient.
     * @param version
     * @param isGoalie
     */
    public void connect(String version, boolean isGoalie) {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand(teamName, isGoalie, version);
        initMessage = f.next();
        super.start();
    }

    /**
     * Pointless method. Had to implement due to extending AbstractUDPClient.
     */
    @Override
    public void start() {
        throw new Error("SServerPlayer should not use start. Use connect() instead");
    }

    /**
     *
     * @param msg
     * @throws IOException
     */
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

    /**
     *
     * @param is
     */
    @Override
    public void setTeamEast(boolean is) {
        this.isTeamEast = is;
    }

    /**
     *
     * @param power
     */
    @Override
    public void dash(int power) {
        this.commandFactory.addDashCommand(power);
    }

    /**
     *
     * @param power
     * @param direction
     */
    @Override
    public void kick(int power, double direction) {
        this.commandFactory.addKickCommand(power, (int) direction);
    }

    /**
     *
     * @param x
     * @param y
     */
    @Override
    public void move(int x, int y) {
        this.commandFactory.addMoveCommand(x, y);
    }

    /**
     *
     * @param message
     */
    @Override
    public void say(String message) {
        this.commandFactory.addSayCommand(message);
    }

    /**
     *
     */
    @Override
    public void senseBody() {
        this.commandFactory.addSenseBodyCommand();
    }

    /**
     *
     * @param angle
     */
    @Override
    public void turn(double angle) {
        this.commandFactory.addTurnCommand((int) angle);
    }

    /**
     *
     * @param angle
     */
    @Override
    public void turnNeck(double angle) {}

    /**
     *
     * @param direction
     */
    @Override
    public void catchBall(double direction) {
        this.commandFactory.addCatchCommand((int) direction);
    }

    /**
     *
     * @param quality
     * @param angle
     */
    @Override
    public void changeViewMode(ViewQuality quality, ViewAngle angle) {
        this.commandFactory.addChangeViewCommand(angle, quality);
    }

    /**
     *
     */
    @Override
    public void bye() {
        this.commandFactory.addByeCommand();
    }

    /**
     *
     * @return
     */
    @Override
    public String getTeamName() {
        return teamName;
    }

    /**
     *
     * @param num
     */
    @Override
    public void setNumber(int num) {
        number = num;
    }

    /**
     *
     * @return
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isTeamEast() {
        return isTeamEast;
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

    /**
     *
     * @return
     */
    public String toListString() {
        StringBuffer buf = new StringBuffer();
        buf.append(controller.getClass().getName());
        return buf.toString();
    }

    /**
     *
     * @return
     */
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

    /**
     *
     * @param error
     */
    @Override
    public void handleError(String error) {
        log.error(error);
    }

    /**
     *
     * @return
     */
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
     *
     * @author Atan
     */
    private class SServerCommandBuffer implements CommandFilter {
        private String errorCommand     = null;
        private String hearCommand      = null;
        private String initCommand      = null;
        private String seeCommand       = null;
        private String senseBodyCommand = null;

        /**
         *
         * @param cmd
         */
        @Override
        public void seeCommand(String cmd) {
            seeCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void hearCommand(String cmd) {
            hearCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void senseBodyCommand(String cmd) {
            senseBodyCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void initCommand(String cmd) {
            initCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void errorCommand(String cmd) {
            errorCommand = cmd;
        }

        /**
         *
         * @param controller
         * @param parser
         * @param c
         * @throws Exception
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
                if (errorCommand != null) {
                    parser.parseErrorCommand(errorCommand, controller, c);
                    errorCommand = null;
                }
                controller.postInfo();
                StringBuffer buf = new StringBuffer();
            }
        }
    }
}
