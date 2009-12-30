package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.parser.CmdParser;
import atan.parser.CommandFilter;
import atan.parser.Filter;

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import java.io.StringReader;

/**
 * Class description
 * @author Atan
 */
public class SServerPlayer extends UDPClient implements Player {
    private static Logger        log            = Logger.getLogger(SServerPlayer.class);
    private String               initMessage    = null;
    private int                  number         = -1;
    private CmdParser            parser         = new CmdParser(new StringReader(""));
    private Filter               filter         = new Filter();
    private CommandFactory       commandFactory = new CommandFactory();
    private SServerCommandBuffer cmdBuf         = new SServerCommandBuffer();
    private Controller           controller;
    private boolean              isTeamEast;
    private String               teamName;

    /**
     * Constructs ...
     * @param teamName
     * @param c
     */
    public SServerPlayer(String teamName, Controller c) {
        this(teamName, c, 6000, "localhost");
    }

    /**
     * Constructs ...
     * @param teamName
     * @param c
     * @param port
     * @param hostname
     */
    public SServerPlayer(String teamName, Controller c, int port, String hostname) {
        super(port, hostname);
        this.teamName   = teamName;
        this.controller = c;
        c.setPlayer(this);
    }

    /**
     * Method description
     * @return
     */
    @Override
    public String getInitMessage() {
        return initMessage;
    }

    /**
     * Method description
     */
    public void connect() {
        CommandFactory f = new CommandFactory();
        f.addPlayerInitCommand(teamName, false);
        initMessage = f.next();
        super.start();
    }

    /**
     * Method description
     */
    @Override
    public void start() {
        throw new Error("SServerPlayer should not use start. Use connect() instead");
    }

    /**
     * Method description
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
     * Method description
     * @param is
     */
    @Override
    public void setTeamEast(boolean is) {
        this.isTeamEast = is;
    }

    /**
     * Method description
     * @param power
     */
    @Override
    public void dash(int power) {
        this.commandFactory.addDashCommand(power);
    }

    /**
     * Method description
     * @param power
     * @param direction
     */
    @Override
    public void kick(int power, double direction) {
        this.commandFactory.addKickCommand(power, (int) direction);
    }

    /**
     * Method description
     * @param x
     * @param y
     */
    @Override
    public void move(int x, int y) {
        this.commandFactory.addMoveCommand(x, y);
    }

    /**
     * Method description
     * @param message
     */
    @Override
    public void say(String message) {
        this.commandFactory.addSayCommand(message);
    }

    /**
     * Method description
     */
    @Override
    public void senseBody() {
        this.commandFactory.addSenseBodyCommand();
    }

    /**
     * Method description
     * @param angle
     */
    @Override
    public void turn(double angle) {
        this.commandFactory.addTurnCommand((int) angle);
    }

    /**
     * Method description
     * @param angle
     */
    @Override
    public void turnNeck(double angle) {}

    /**
     * Method description
     * @param direction
     */
    @Override
    public void catchBall(double direction) {
        this.commandFactory.addCatchCommand((int) direction);
    }

    /**
     * Method description
     * @param quality
     * @param angle
     */
    @Override
    public void changeViewMode(ViewQuality quality, ViewAngle angle) {
        this.commandFactory.addChangeViewCommand(angle, quality);
    }

    /**
     * Method description
     */
    @Override
    public void bye() {
        this.commandFactory.addByeCommand();
    }

    /**
     * Method description
     * @return
     */
    @Override
    public String getTeamName() {
        return teamName;
    }

    /**
     * Method description
     * @param num
     */
    @Override
    public void setNumber(int num) {
        number = num;
    }

    /**
     * Method description
     * @return
     */
    @Override
    public int getNumber() {
        return number;
    }

    /**
     * Method description
     * @return
     */
    @Override
    public boolean isTeamEast() {
        return isTeamEast;
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

    /**
     * Method description
     * @return
     */
    public String toListString() {
        StringBuffer buf = new StringBuffer();
        buf.append(controller.getClass().getName());
        return buf.toString();
    }

    /**
     * Method description
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
        buf.append("Controller Class: ");
        buf.append(controller.getClass().getName());
        buf.append("\n");
        return buf.toString();
    }

    /**
     * Method description
     * @param error
     */
    @Override
    public void handleError(String error) {
        log.error(error);
    }

    /**
     * Method description
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
     * Class description
     * @author Atan
     */
    private class SServerCommandBuffer implements CommandFilter {
        private String errorCommand     = null;
        private String hearCommand      = null;
        private String initCommand      = null;
        private String seeCommand       = null;
        private String senseBodyCommand = null;

        /**
         * Method description
         * @param cmd
         */
        @Override
        public void seeCommand(String cmd) {
            seeCommand = cmd;
        }

        /**
         * Method description
         * @param cmd
         */
        @Override
        public void hearCommand(String cmd) {
            hearCommand = cmd;
        }

        /**
         * Method description
         * @param cmd
         */
        @Override
        public void senseBodyCommand(String cmd) {
            senseBodyCommand = cmd;
        }

        /**
         * Method description
         * @param cmd
         */
        @Override
        public void initCommand(String cmd) {
            initCommand = cmd;
        }

        /**
         * Method description
         * @param cmd
         */
        @Override
        public void errorCommand(String cmd) {
            errorCommand = cmd;
        }

        /**
         * Method description
         * @param controller
         * @param parser
         * @param c
         * @throws Exception
         */
        public void takeStep(Controller controller, CmdParser parser, Player c) throws Exception {
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
