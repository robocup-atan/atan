package atan.model;

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
    private List fifo = new Vector();

    /**
     * Constructs a blank command factory.
     */
    public CommandFactory() {}

    /**
     * This is used to initilise a player.
     * @param teamName The team the player belongs to.
     * @param isGoaly
     */
    public void addInitCommand(String teamName, boolean isGoaly) {
        StringBuffer buf = new StringBuffer();
        if (isGoaly) {
            buf.append("(init ");
            buf.append(teamName);
            buf.append(" g)");
        } else {
            buf.append("(init ");
            buf.append(teamName);
            buf.append(")");
        }
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to reconnect the player to the server.
     * @param teamName
     * @param num
     */
    public void addReconnectCommand(String teamName, int num) {
        StringBuffer buf = new StringBuffer();
        buf.append("(reconnect ");
        buf.append(teamName);
        buf.append(" ");
        buf.append(num);
        buf.append(")");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Goalie special command. Tries to catch the ball in a given direction
     * relative to its body direction. If the catch is successful the ball will
     * be in the goalies hand untill kicked away.
     * @param direction The direction in which to catch, relative to its body.
     */
    public void addCatchCommand(int direction) {
        StringBuffer buf = new StringBuffer();
        buf.append("(catch ");
        buf.append(direction);
        buf.append(")");
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
    public void addChangeViewCommand(ViewQuality quality, ViewAngle angle) {
        StringBuffer buf = new StringBuffer();
        buf.append("(change_view ");
        if (angle == ViewAngle.NARROW) {
            if (quality == ViewQuality.HIGH) {
                buf.append("narrow high)");
            } else if (quality == ViewQuality.LOW) {
                buf.append("narrow low)");
            }
        }
        if (angle == ViewAngle.NORMAL) {
            if (quality == ViewQuality.HIGH) {
                buf.append("normal high)");
            } else if (quality == ViewQuality.LOW) {
                buf.append("normal low)");
            }
        }
        if (angle == ViewAngle.WIDE) {
            if (quality == ViewQuality.HIGH) {
                buf.append("wide high)");
            } else if (quality == ViewQuality.LOW) {
                buf.append("wide low)");
            }
        }
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command accelerates the player in the direction of its body.
     * @param power Power is between minpower (-100) and maxpower (+100).
     */
    public void addDashCommand(int power) {
        StringBuffer buf = new StringBuffer();
        buf.append("(dash ");
        buf.append(power);
        buf.append(")");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command accelerates the ball with the given power in the given direction.
     * @param power Power is between minpower (-100) and maxpower (+100).
     * @param direction Direction is relative to the body of the player.
     */
    public void addKickCommand(int power, int direction) {
        StringBuffer buf = new StringBuffer();
        buf.append("(kick ");
        buf.append(power);
        buf.append(" ");
        buf.append(direction);
        buf.append(")");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command can only be executed before kick off or after a goal.
     * @param x X location (between -54 and +54).
     * @param y Y location (between -32 and +32).
     */
    public void addMoveCommand(int x, int y) {
        StringBuffer buf = new StringBuffer();
        buf.append("(move ");
        buf.append(x);
        buf.append(" ");
        buf.append(y);
        buf.append(")");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command will turn the players body in degrees relative to their
     * current direction.
     * @param angle Angle to turn (between -180 and +180).
     */
    public void addTurnCommand(int angle) {
        StringBuffer buf = new StringBuffer();
        buf.append("(turn ");
        buf.append(angle);
        buf.append(")");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command can be sent (and will be executed) each cycle independently,
     * along with other action commands. The neck will rotate witht he given angle
     * relative to the previous angle.
     * @param angle Angle to turn the neck (between minneckang and maxneckang) (-90 to +90)
     */
    public void addTurnNeckCommand(int angle) {
        StringBuffer buf = new StringBuffer();
        buf.append("(turn_neck ");
        buf.append(angle);
        buf.append(")");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This command broadcasts the message throughout the field. Any player
     * near enough (specified with audio_cut_dist default 50.0 neters), with
     * enough hearing capacity will hear the message.
     * @param message A valid String to say.
     */
    public void addSayCommand(String message) {
        StringBuffer buf = new StringBuffer();
        buf.append("(say ");
        buf.append(message);
        buf.append(")");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Requests the server to send sense body information.
     * Note: SServer version 6 and above sends this with every cycle.
     */
    public void addSenseBodyCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(sense_body)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * This is used to disconnect a player/coach/trainer from the server.
     * The server will not respond.
     */
    public void addByeCommand() {
        StringBuffer buf = new StringBuffer();
        buf.append("(bye)");
        fifo.add(fifo.size(), buf.toString());
    }

    /**
     * Method description
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
     * Method description
     * @return
     */
    public boolean hasNext() {
        return !fifo.isEmpty();
    }
}
