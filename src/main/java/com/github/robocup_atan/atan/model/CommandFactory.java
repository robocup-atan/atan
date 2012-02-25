package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.PlayMode;
import com.github.robocup_atan.atan.model.enums.ViewAngle;
import com.github.robocup_atan.atan.model.enums.ViewQuality;
import java.util.List;
import java.util.Vector;

/**
 * This class creates an easy interface between Java and the SServer.
 * By calling the methods in this class, it creates String's that the
 * SServer can understand.
 *
 * @author Atan
 */
public class CommandFactory {

    // The SServer version that Atan can parse.
    private static final String serverVersion = "13";
    private List                fifo          = new Vector();

    /**
     * Constructs a blank command factory.
     */
    public CommandFactory() {}

    /**
     * This is used to initialise a player.
     *
     * @param teamName The team the player belongs to.
     * @param isGoalie If the player is a goalie. Note: Only one goalie per team.
     */
    public void addPlayerInitCommand(String teamName, boolean isGoalie) {
        StringBuilder buf = new StringBuilder();
        buf.append("(init ");
        buf.append(teamName);
        buf.append(" (version ");
        if (isGoalie) {
            buf.append(serverVersion);
            buf.append(") (goalie))");
        } else {
            buf.append(serverVersion);
            buf.append("))");
        }
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to initialise a trainer.
     */
    public void addTrainerInitCommand() {
        StringBuilder buf = new StringBuilder();
        buf.append("(init (version ");
        buf.append(serverVersion);
        buf.append("))");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to initialise the online coach.
     *
     * @param teamName The team the coach belongs to.
     */
    public void addCoachInitCommand(String teamName) {
        StringBuilder buf = new StringBuilder();
        buf.append("(init ");
        buf.append(teamName);
        buf.append(" (version ");
        buf.append(serverVersion);
        buf.append("))");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to reconnect the player to the server.
     *
     * @param teamName a {@link java.lang.String} object.
     * @param num a int.
     */
    public void addReconnectCommand(String teamName, int num) {
        StringBuilder buf = new StringBuilder();
        buf.append("(reconnect ");
        buf.append(teamName);
        buf.append(' ');
        buf.append(num);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Goalie special command. Tries to catch the ball in a given direction
     * relative to its body direction. If the catch is successful the ball will
     * be in the goalies hand untill kicked away.
     *
     * @param direction The direction in which to catch, relative to its body.
     */
    public void addCatchCommand(int direction) {
        StringBuilder buf = new StringBuilder();
        buf.append("(catch ");
        buf.append(direction);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Changes the view parameters of the player. The amount and detail returned
     * by the visual sensor depends on the width of view and the quality. But
     * note that the frequency of sending information also depends on these
     * parameters. (eg. If you change the quality from high to low, the
     * frequency doubles, and the time between the two see sensors will be
     * cut in half).
     *
     * @param angle Between NARROW, NORMAL or WIDE.
     * @param quality Between HIGH or LOW.
     */
    public void addChangeViewCommand(ViewAngle angle, ViewQuality quality) {
        StringBuilder buf = new StringBuilder();
        buf.append("(change_view ");
        switch (angle) {
            case NARROW :
                switch (quality) {
                    case HIGH :
                        buf.append("narrow high)");
                        break;
                    case LOW :
                        buf.append("narrow low)");
                        break;
                }
                break;
            case NORMAL :
                switch (quality) {
                    case HIGH :
                        buf.append("normal high)");
                        break;
                    case LOW :
                        buf.append("normal low)");
                        break;
                }
                break;
            case WIDE :
                switch (quality) {
                    case HIGH :
                        buf.append("wide high)");
                        break;
                    case LOW :
                        buf.append("wide low)");
                        break;
                }
                break;
        }
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command accelerates the player in the direction of its body.
     *
     * @param power Power is between minpower (-100) and maxpower (+100).
     */
    public void addDashCommand(int power) {
        StringBuilder buf = new StringBuilder();
        buf.append("(dash ");
        buf.append(power);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command accelerates the ball with the given power in the given direction.
     *
     * @param power Power is between minpower (-100) and maxpower (+100).
     * @param direction Direction is relative to the body of the player.
     */
    public void addKickCommand(int power, int direction) {
        StringBuilder buf = new StringBuilder();
        buf.append("(kick ");
        buf.append(power);
        buf.append(' ');
        buf.append(direction);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command can only be executed before kick off or after a goal.
     *
     * @param x X location (between -54 and +54).
     * @param y Y location (between -32 and +32).
     */
    public void addMoveCommand(int x, int y) {
        StringBuilder buf = new StringBuilder();
        buf.append("(move ");
        buf.append(x);
        buf.append(' ');
        buf.append(y);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command will turn the players body in degrees relative to their
     * current direction.
     *
     * @param angle Angle to turn (between -180 and +180).
     */
    public void addTurnCommand(int angle) {
        StringBuilder buf = new StringBuilder();
        buf.append("(turn ");
        buf.append(angle);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command can be sent (and will be executed) each cycle independently,
     * along with other action commands. The neck will rotate witht he given angle
     * relative to the previous angle.
     *
     * @param angle Angle to turn the neck (between minneckang and maxneckang) (-90 to +90)
     */
    public void addTurnNeckCommand(int angle) {
        StringBuilder buf = new StringBuilder();
        buf.append("(turn_neck ");
        buf.append(angle);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command broadcasts the message throughout the field. Any player
     * near enough (specified with audio_cut_dist default 50.0 meters), with
     * enough hearing capacity will hear the message.
     *
     * @param message A valid String to say.
     */
    public void addSayCommand(String message) {
        StringBuilder buf = new StringBuilder();
        buf.append("(say ");
        buf.append(message);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Changes the play mode of the server.
     *
     * @param playMode a {@link com.github.robocup_atan.atan.model.enums.PlayMode} object.
     */
    public void addChangePlayModeCommand(PlayMode playMode) {
        StringBuilder buf = new StringBuilder();
        buf.append("(change_mode ");
        buf.append(playMode);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Moves the given player to the given coordinates.
     *
     * @param p The player to move.
     * @param x The x coordinate to move to.
     * @param y The y coordinate to move to.
     */
    public void addMovePlayerCommand(ActionsPlayer p, double x, double y) {
        throw new UnsupportedOperationException("This method is for a future release");

        /*
         * StringBuffer buf = new StringBuffer();
         * buf.append("(move ");
         * buf.append(p);    // TODO Manual says the format...will implement this later.
         * buf.append(' ');
         * buf.append(x);
         * buf.append(' ');
         * buf.append(y);
         * buf.append(')');
         * fifo.add(fifo.size(), buf.toString());
         */
    }

    /**
     * Trainer only command.
     * Moves the ball to the given coordinates.
     *
     * @param x The x coordinate to move to.
     * @param y The y coordinate to move to.
     */
    public void addMoveBallCommand(double x, double y) {
        StringBuilder buf = new StringBuilder();
        buf.append("(move ");
        buf.append("ball");    // TODO Manual says the format...will implement this later.
        buf.append(' ');
        buf.append(x);
        buf.append(' ');
        buf.append(y);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Checks the current status of the ball.
     */
    public void addCheckBallCommand() {
        StringBuilder buf = new StringBuilder();
        buf.append("(check_ball)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Starts the server.
     */
    public void addStartCommand() {
        StringBuilder buf = new StringBuilder();
        buf.append("(start)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Recovers the players stamina, recovery, effort and hear capacity to the values at the beginning of the game.
     */
    public void addRecoverCommand() {
        StringBuilder buf = new StringBuilder();
        buf.append("(recover)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * It turns on or off the sending of auditory information to the trainer.
     *
     * @param earOn True to turn auditory information on, false to turn it off.
     */
    public void addEarCommand(boolean earOn) {
        StringBuilder buf = new StringBuilder();
        buf.append("(ear ");
        if (earOn) {
            buf.append("on");
        } else {
            buf.append("off");
        }
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * This command changes the specified players heterogeneous type.
     *
     * @param teamName The name of the team the player belongs to.
     * @param unum The players uniform number (1~11 on pitch usually, subs <= 14).
     * @param playerType A player type between 0 (the standard player) and 18. However, player.conf can change this.
     */
    public void addChangePlayerTypeCommand(String teamName, int unum, int playerType) {
        StringBuilder buf = new StringBuilder();
        buf.append("(change_player_type ");
        buf.append(teamName);
        buf.append(' ');
        buf.append(unum);
        buf.append(' ');
        buf.append(playerType);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer command that can be used by online coach.
     * It turns on or off the sending of "(see_global ...)" information from the server.
     *
     * @param eyeOn True to turn visual information on, false to turn it off.
     */
    public void addEyeCommand(boolean eyeOn) {
        StringBuilder buf = new StringBuilder();
        buf.append("(eye ");
        if (eyeOn) {
            buf.append("on");
        } else {
            buf.append("off");
        }
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer command that can be used by online coach.
     * This command provides information about the positions of the following objects on the field.
     * The left and right goals? (Do they move?)
     * The ball.
     * All active players.
     */
    public void addLookCommand() {
        StringBuilder buf = new StringBuilder();
        buf.append("(look)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer command that can be used by online coach.
     * This command provides information about the names of both teams and which side they are playing on.
     */
    public void addTeamNamesCommand() {
        StringBuilder buf = new StringBuilder();
        buf.append("(team_names)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Coach only command.
     * This command changes the specified players heterogeneous type.
     *
     * @param unum The players uniform number (1~11 on pitch usually, subs <= 17).
     * @param playerType //TODO Implement
     */
    public void addChangePlayerTypeCommand(int unum, Object playerType) {
        throw new UnsupportedOperationException("This method is for a future release");

        /*
         * StringBuffer buf = new StringBuffer();
         * buf.append("(change_player_type ");
         * buf.append(unum);
         * buf.append(' ');
         * buf.append(playerType);
         * buf.append(')');
         * fifo.add(fifo.size(), buf.toString());
         */
    }

    /**
     * Coach only command.
     * The online coach can send teams-graphics as 256 x 64 XPM to the server.
     * Each team graphic-command sends a 8x8 tile.
     * X and Y are the coordinates of this tile,
     * so they range from 0 to 31 and 0 to 7 respectively.
     * Each XPM line is a line from the 8x8 XPM tile.
     *
     * @param xpm An XPMImage object.
     */
    public void addTeamGraphicCommand(XPMImage xpm) {
        for (int x = 0; x < xpm.getArrayWidth(); x++) {
            for (int y = 0; y < xpm.getArrayHeight(); y++) {
                StringBuilder buf  = new StringBuilder();
                String       tile = xpm.getTile(x, y);
                buf.append("(team_graphic (");
                buf.append(x);
                buf.append(' ');
                buf.append(y);
                buf.append(' ');
                buf.append(tile);
                buf.append(' ');
                buf.append("))");
                fifo.add(fifo.size(), buf.toString());
            }
        }
    }

    /**
     * This is used to disconnect a player/coach/trainer from the server.
     * The server will not respond.
     */
    public void addByeCommand() {
        StringBuilder buf = new StringBuilder();
        buf.append("(bye)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Gets the next command from the stack.
     *
     * @return The next command.
     */
    public String next() {
        if (fifo.isEmpty()) {
            throw new RuntimeException("Fifo is empty");
        }
        String cmd = (String) fifo.get(0);
        fifo.remove(0);
        return cmd;
    }

    /**
     * Checks if the stack is empty or not.
     *
     * @return True if not empty.
     */
    public boolean hasNext() {
        return !fifo.isEmpty();
    }
}
