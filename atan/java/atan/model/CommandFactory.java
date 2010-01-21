package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.enums.PlayMode;
import atan.model.enums.ViewAngle;
import atan.model.enums.ViewQuality;

//~--- JDK imports ------------------------------------------------------------

import java.util.List;
import java.util.Vector;

/**
 * This class creates an easy interface between Java and the SServer.
 * By calling the methods in this class, it creates String's that the
 * SServer can understand.
 * @author Atan
 */
public class CommandFactory {
    private String defaultVersion = new String("13");
    @SuppressWarnings("unchecked")
    private List   fifo           = new Vector();

    /**
     * Constructs a blank command factory.
     */
    public CommandFactory() {}

    /**
     * This is used to initialise a player.
     * @param teamName The team the player belongs to.
     * @param isGoalie If the player is a goalie. Note: Only one goalie per team.
     * @param version
     */
    @SuppressWarnings("unchecked")
    public void addPlayerInitCommand(String teamName, boolean isGoalie, String version) {
        StringBuffer buf = new StringBuffer();
        buf.append("(init ");
        buf.append(teamName);
        buf.append(" (version ");
        if (isGoalie) {
            if ("".equals(version)) {
                buf.append(defaultVersion);
                buf.append(") (goalie))");
            } else {
                buf.append(version);
                buf.append(") (goalie))");
            }
        } else {
            if ("".equals(version)) {
                buf.append(defaultVersion);
                buf.append("))");
            } else {
                buf.append(version);
                buf.append("))");
            }
        }
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to initialise a trainer.
     * @param version The version of the server expected.
     */
    @SuppressWarnings("unchecked")
    public void addTrainerInitCommand(String version) {
        StringBuffer buf = new StringBuffer();
        buf.append("(init (version ");
        if ("".equals(version)) {
            buf.append(defaultVersion);
        } else {
            buf.append(version);
        }
        buf.append("))");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to initialise the online coach.
     * @param teamName The team the coach belongs to.
     * @param version The version of the server expected.
     */
    @SuppressWarnings("unchecked")
    public void addCoachInitCommand(String teamName, String version) {
        StringBuffer buf = new StringBuffer();
        buf.append("(init ");
        buf.append(teamName);
        buf.append(" (version ");
        if ("".equals(version)) {
            buf.append(defaultVersion);
        } else {
            buf.append(version);
        }
        buf.append("))");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to reconnect the player to the server.
     * @param teamName
     * @param num
     */
    @SuppressWarnings("unchecked")
    public void addReconnectCommand(String teamName, int num) {
        StringBuffer buf = new StringBuffer();
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
     * @param direction The direction in which to catch, relative to its body.
     */
    @SuppressWarnings("unchecked")
    public void addCatchCommand(int direction) {
        StringBuffer buf = new StringBuffer();
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
     * @param angle Between narrow, normal or wide.
     * @param quality Between high or low.
     */
    @SuppressWarnings("unchecked")
    public void addChangeViewCommand(ViewAngle angle, ViewQuality quality) {
        StringBuffer buf = new StringBuffer();
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
     * @param power Power is between minpower (-100) and maxpower (+100).
     */
    @SuppressWarnings("unchecked")
    public void addDashCommand(int power) {
        StringBuffer buf = new StringBuffer();
        buf.append("(dash ");
        buf.append(power);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command accelerates the ball with the given power in the given direction.
     * @param power Power is between minpower (-100) and maxpower (+100).
     * @param direction Direction is relative to the body of the player.
     */
    @SuppressWarnings("unchecked")
    public void addKickCommand(int power, int direction) {
        StringBuffer buf = new StringBuffer();
        buf.append("(kick ");
        buf.append(power);
        buf.append(' ');
        buf.append(direction);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command can only be executed before kick off or after a goal.
     * @param x X location (between -54 and +54).
     * @param y Y location (between -32 and +32).
     */
    @SuppressWarnings("unchecked")
    public void addMoveCommand(int x, int y) {
        StringBuffer buf = new StringBuffer();
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
     * @param angle Angle to turn (between -180 and +180).
     */
    @SuppressWarnings("unchecked")
    public void addTurnCommand(int angle) {
        StringBuffer buf = new StringBuffer();
        buf.append("(turn ");
        buf.append(angle);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command can be sent (and will be executed) each cycle independently,
     * along with other action commands. The neck will rotate witht he given angle
     * relative to the previous angle.
     * @param angle Angle to turn the neck (between minneckang and maxneckang) (-90 to +90)
     */
    @SuppressWarnings("unchecked")
    public void addTurnNeckCommand(int angle) {
        StringBuffer buf = new StringBuffer();
        buf.append("(turn_neck ");
        buf.append(angle);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command broadcasts the message throughout the field. Any player
     * near enough (specified with audio_cut_dist default 50.0 meters), with
     * enough hearing capacity will hear the message.
     * @param message A valid String to say.
     */
    @SuppressWarnings("unchecked")
    public void addSayCommand(String message) {
        StringBuffer buf = new StringBuffer();
        buf.append("(say ");
        buf.append(message);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Requests the server to send sense body information.
     * Note: SServer version 6 and above sends this with every cycle.
     */
    @SuppressWarnings("unchecked")
    public void addSenseBodyCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(sense_body)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Changes the play mode of the server.
     * @param playMode
     */
    @SuppressWarnings("unchecked")
    public void addChangePlayModeCommand(PlayMode playMode) {
        StringBuffer buf = new StringBuffer();
        buf.append("(change_mode ");
        buf.append(playMode);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Moves the given player to the given coordinates.
     * @param p
     * @param x
     * @param y
     */
    @SuppressWarnings("unchecked")
    public void addMovePlayerCommand(ActionsPlayer p, double x, double y) {
        StringBuffer buf = new StringBuffer();
        buf.append("(move ");
        buf.append(p);    // TODO Manual says the format...will implement this later.
        buf.append(' ');
        buf.append(x);
        buf.append(' ');
        buf.append(y);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Moves the ball to the given coordinates.
     * @param x
     * @param y
     */
    @SuppressWarnings("unchecked")
    public void addMoveBallCommand(double x, double y) {
        StringBuffer buf = new StringBuffer();
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
    @SuppressWarnings("unchecked")
    public void addCheckBallCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(check_ball)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Starts the server.
     */
    @SuppressWarnings("unchecked")
    public void addStartCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(start)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * Recovers the players stamina, recovery, effort and hear capacity to the values at the beginning of the game.
     */
    @SuppressWarnings("unchecked")
    public void addRecoverCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(recover)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * It turns on or off the sending of auditory information to the trainer.
     */
    @SuppressWarnings("unchecked")
    public void addEarCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(ear ");
        buf.append("on");    // TODO Change this to take an input - Section 7.5 for format.
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer only command.
     * This command changes the specified players type.
     * @param teamName The name of the team the player belongs to.
     * @param unum //TODO Implement
     * @param playerType //TODO Implement
     */
    @SuppressWarnings("unchecked")
    public void addChangePlayerTypeCommand(String teamName, Object unum, Object playerType) {
        StringBuffer buf = new StringBuffer();
        buf.append("(change_player_type ");
        buf.append(' ');
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
     */
    @SuppressWarnings("unchecked")
    public void addEyeCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(eye ");
        buf.append("on");    // TODO Change this to take an input - Section 7.5 for format.
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
    @SuppressWarnings("unchecked")
    public void addLookCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(look)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Trainer command that can be used by online coach.
     * This command provides information about the names of both teams and which side they are playing on.
     */
    @SuppressWarnings("unchecked")
    public void addTeamNamesCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(team_names)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Coach only command.
     * This command changes the specified players type.
     * @param unum //TODO Implement
     * @param playerType //TODO Implement
     */
    @SuppressWarnings("unchecked")
    public void addChangePlayerTypeCommand(Object unum, Object playerType) {
        StringBuffer buf = new StringBuffer();
        buf.append("(change_player_type ");
        buf.append(unum);
        buf.append(' ');
        buf.append(playerType);
        buf.append(')');
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Coach only command.
     * The online coach can send teams-graphics as 256 x 64 XPM to the server.
     * Each team graphic-command sends a 8x8 tile.
     * X and Y are the coordinates of this tile,
     * so they range from 0 to 31 and 0 to 7 respectively.
     * Each XPM line is a line from the 8x8 XPM tile.
     * @param x The x coordinate of this tile.
     * @param y The y coordinate of this tile.
     * @param xpm //TODO Implement this.
     */
    @SuppressWarnings("unchecked")
    public void addTeamGraphicCommand(int x, int y, Object xpm) {
        StringBuffer buf = new StringBuffer();
        buf.append("(team_graphic (");
        buf.append(x);
        buf.append(' ');
        buf.append(y);
        buf.append(' ');
        buf.append(xpm);
        buf.append("))");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to disconnect a player/coach/trainer from the server.
     * The server will not respond.
     */
    @SuppressWarnings("unchecked")
    public void addByeCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(bye)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     *
     * @return
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
     *
     * @return
     */
    public boolean hasNext() {
        return !fifo.isEmpty();
    }
}
