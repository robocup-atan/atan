package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.parser.CommandFilter;
import atan.parser.Filter;
import atan.parser.coach.CmdParserCoach;

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import java.io.StringReader;

/**
 * A simple implementation of AbstractUDPClient for Coaches.
 * @author Atan
 */
public class SServerCoach extends AbstractUDPClient implements ActionsCoach {
    private static final int           COACH_PORT     = 6002;
    private static Logger              log            = Logger.getLogger(SServerCoach.class);
    private String                     initMessage    = null;
    private final CmdParserCoach       parser         = new CmdParserCoach(new StringReader(""));
    private final Filter               filter         = new Filter();
    private final CommandFactory       commandFactory = new CommandFactory();
    private final SServerCommandBuffer cmdBuf         = new SServerCommandBuffer();
    private ControllerCoach            controller;
    private boolean                    isTeamEast;
    private String                     teamName;

    /**
     * A part constructor for SServerCoach (assumes localhost:6002)
     * @param teamName The team name.
     * @param o
     */
    public SServerCoach(String teamName, ControllerCoach o) {
        this(teamName, o, COACH_PORT, "localhost");
    }

    /**
     * The full constructor for SServerCoach
     * @param teamName The teams name.
     * @param con
     * @param port The port to connect to.
     * @param hostname The host address.
     */
    public SServerCoach(String teamName, ControllerCoach con, int port, String hostname) {
        super(port, hostname);
        this.teamName   = teamName;
        this.controller = con;
        con.setCoach(this);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getInitMessage() {
        return initMessage;
    }

    /**
     * Connects to the server via AbstractUDPClient.
     */
    public void connect() {
        CommandFactory f = new CommandFactory();
        f.addCoachInitCommand(teamName, "");
        initMessage = f.next();
        super.start();
        super.setName(teamName + " Coach");
    }

    /**
     * @inheritDoc
     */
    @Override
    public void start() {
        throw new Error("Coach should not use start. Use connect() instead");
    }

    /**
     * @inheritDoc
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
     * @inheritDoc
     */
    @Override
    public void eye(boolean eyeOn) {
        this.commandFactory.addEyeCommand(eyeOn);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void look() {
        this.commandFactory.addLookCommand();
    }

    /**
     * @inheritDoc
     */
    @Override
    public void getTeamNames() {
        this.commandFactory.addTeamNamesCommand();
    }

    /**
     * @inheritDoc
     */
    @Override
    public void changePlayerType(int unum, int playerType) {
        this.commandFactory.addChangePlayerTypeCommand(unum, playerType);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void say(String message) {
        this.commandFactory.addSayCommand(message);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void teamGraphic(XPMImage xpm) {
        this.commandFactory.addTeamGraphicCommand(xpm);
    }

    /**
     * @inheritDoc
     */
    @Override
    public void bye() {
        this.commandFactory.addByeCommand();
    }

    /**
     * @inheritDoc
     */
    @Override
    public void handleError(String error) {
        log.error(error);
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean isTeamEast() {
        return isTeamEast;
    }

    /**
     * @inheritDoc
     */
    @Override
    public void setTeamEast(boolean is) {
        this.isTeamEast = is;
    }

    /**
     * @inheritDoc
     */
    @Override
    public String getTeamName() {
        return teamName;
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
     * A private coach-style filter
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
        @Override
        public void senseBodyCommand(String cmd) {}

        /**
         * Decide where to go from here.
         * @param controller
         * @param parser
         * @param c
         * @throws Exception
         */
        public void takeStep(ControllerCoach controller, CmdParserCoach parser, ActionsCoach c) throws Exception {
            if (seeCommand != null) {
                parser.parseSeeCommand(seeCommand, controller, c);
                seeCommand = null;
            }
            if (hearCommand != null) {
                parser.parseHearCommand(hearCommand, controller, c);
                hearCommand = null;
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
        }
    }
}
