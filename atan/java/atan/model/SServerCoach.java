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
     */
    public void connect() {
        CommandFactory f = new CommandFactory();
        f.addCoachInitCommand(teamName, "");
        initMessage = f.next();
        super.start();
    }

    /**
     * Pointless method. Had to implement due to extending AbstractUDPClient.
     */
    @Override
    public void start() {
        throw new Error("Coach should not use start. Use connect() instead");
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
     */
    @Override
    public void eye() {
        this.commandFactory.addEyeCommand();
    }

    /**
     *
     */
    @Override
    public void look() {
        this.commandFactory.addLookCommand();
    }

    /**
     *
     */
    @Override
    public void teamNames() {
        this.commandFactory.addTeamNamesCommand();
    }

    /**
     * This command changes a specified players type.
     * @param unum The players uniform number (1~11 on pitch usually, subs <= 17).
     * @param playerType
     */
    @Override
    public void changePlayerType(int unum, Object playerType) {
        this.commandFactory.addChangePlayerTypeCommand(unum, playerType);
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
     * @param x
     * @param y
     * @param xpm
     */
    @Override
    public void teamGraphic(int x, int y, Object xpm) {
        this.commandFactory.addTeamGraphicCommand(x, y, xpm);
    }

    /**
     *
     */
    @Override
    public void bye() {
        this.commandFactory.addByeCommand();
    }

    /**
     * Pause for the period provided
     * @param ms milliseconds to pause for
     */
    private synchronized void pause(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {
            return;
        }
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
    public boolean isTeamEast() {
        return isTeamEast;
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
     * A private coach-style filter
     * @author Atan
     */
    private class SServerCommandBuffer implements CommandFilter {
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
         * @param cmd
         */
        @Override
        public void serverParamCommand(String cmd) {
            serverParamCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void playerParamCommand(String cmd) {
            playerParamCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void playerTypeCommand(String cmd) {
            playerTypeCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void changePlayerTypeCommand(String cmd) {
            changePlayerTypeCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void okCommand(String cmd) {
            okCommand = cmd;
        }

        /**
         *
         * @param cmd
         */
        @Override
        public void warningCommand(String cmd) {
            warningCommand = cmd;
        }

        /**
         * Method not needed.
         * @deprecated
         * @param cmd
         */
        @Override
        public void senseBodyCommand(String cmd) {}

        /**
         *
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
