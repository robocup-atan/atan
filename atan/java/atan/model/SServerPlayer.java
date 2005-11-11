package atan.model;

import java.io.IOException;
import java.io.StringReader;

import org.apache.log4j.Logger;

import atan.parser.CmdParser;
import atan.parser.CommandFilter;
import atan.parser.Filter;


public class SServerPlayer extends UDPClient implements Player {

    private static Logger log = Logger.getLogger(SServerPlayer.class);

    private Controller controller;
    private boolean isTeamEast;
    private int number = -1;
    private CmdParser parser = new CmdParser(new StringReader(""));
    private Filter filter = new Filter();
    private CommandFactory commandFactory = new CommandFactory();
    private String initMessage = null;
    private String teamName;
    private SServerCommandBuffer cmdBuf = new SServerCommandBuffer();

    public SServerPlayer(String teamName, Controller c, int port, String hostname) {
        super(port, hostname);
        this.teamName = teamName;
        this.controller = c;
        c.setPlayer(this);
    }

    public SServerPlayer(String teamName, Controller c) {
        this(teamName, c, 6000, "localhost");
    }

    public String getInitMessage() {
        return initMessage;
    }

    public void connect() {
        CommandFactory f = new CommandFactory();
        f.addInitCommand(teamName, false);
        initMessage = f.next();
        super.start();
    }

    public void start() {
        throw new Error("SServerPlayer should not use start. Use connect() instead");
    }

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

    public void setTeamEast(boolean is) {
        this.isTeamEast = is;
    }

    public void dash(int power) {
        this.commandFactory.addDashCommand(power);
    }

    public void kick(int power, double direction) {
        this.commandFactory.addKickCommand(power, (int) direction);
    }

    public void move(int x, int y) {
        this.commandFactory.addMoveCommand(x, y);
    }

    public void say(String message) {
        this.commandFactory.addSayCommand(message);
    }

    public void senseBody() {
        this.commandFactory.addSenseBodyCommand();
    }

    public void turn(double angle) {
        this.commandFactory.addTurnCommand((int) angle);
    }

    public void turnNeck(double angle) {
    }

    public void catchBall(double direction) {
        this.commandFactory.addCatchCommand((int) direction);
    }

    public void changeViewMode(ViewQuality quality, ViewAngle angle) {
        this.commandFactory.addChangeViewCommand(quality, angle);
    }

    public void bye() {
        this.commandFactory.addByeCommand();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setNumber(int num) {
        number = num;
    }

    public int getNumber() {
        return number;
    }

    public boolean isTeamEast() {
        return isTeamEast;
    }

    private synchronized void pause(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {
        }
    }

    public String toListString() {
        StringBuffer buf = new StringBuffer();
        buf.append(controller.getClass().getName());
        return buf.toString();
    }

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

    private class SServerCommandBuffer implements CommandFilter {

        private String seeCommand = null;
        private String hearCommand = null;
        private String initCommand = null;
        private String errorCommand = null;
        private String senseBodyCommand = null;

        public void seeCommand(String cmd) {
            seeCommand = cmd;
        }

        public void hearCommand(String cmd) {
            hearCommand = cmd;
        }

        public void senseBodyCommand(String cmd) {
            senseBodyCommand = cmd;
        }

        public void initCommand(String cmd) {
            initCommand = cmd;
        }

        public void errorCommand(String cmd) {
            errorCommand = cmd;
        }

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
                    parser.parseErrorCommand(errorCommand, c);
                    errorCommand = null;
                }
                controller.postInfo();
                StringBuffer buf = new StringBuffer();
            }
        }
    }

    public void handleError(String error) {
        log.error(error);
    }
    
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


}