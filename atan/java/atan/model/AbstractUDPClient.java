package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * This is the class used to connect each player/trainer/coach to the server within their
 * own threads.
 * @author Atan
 */
public abstract class AbstractUDPClient extends Thread {
    private static Logger  log       = Logger.getLogger(AbstractUDPClient.class);
    private ByteBuffer     buf       = null;
    private String         hostname  = "localhost";
    private int            port      = 6000;
    private boolean        isRunning = false;
    private InetAddress    host;
    private DatagramSocket socket;

    /**
     * Constructs an AbstractUDPClient with default parameters.
     * This is for players, not coaches or trainers.
     * Assumes localhost
     * Assumes port 6000
     */
    public AbstractUDPClient() {
        this(6000, "localhost");
    }

    /**
     * Constructs an AbstractUDPClient object given only the port number.
     * This can be used for players, coaches or trainers.
     * Assumes localhost.
     * @param port Any valid port.
     */
    public AbstractUDPClient(int port) {
        this(port, "localhost");
    }

    /**
     * Constructs an AbstractUDPClient object given the port number and hostname.
     * This can be used for players, coaches or trainers.
     * @param port Any valid port.
     * @param hostname Any valid hostname. (eg. 192.168.1.67 or RCSServerHost)
     */
    public AbstractUDPClient(int port, String hostname) {
        super();
        this.port     = port;
        this.hostname = hostname;
    }

    /**
     * Checks to see if the thread is running.
     * @return True if the thread is running.
     */
    public boolean isRunning() {
        return isRunning;
    }

    /**
     * Stops the thread running.
     */
    public void stopRunning() {
        isRunning = false;
    }

    /**
     * Runs the thread.
     * This will send commands to the server, and receive messages from it.
     */
    @Override
    public void run() {
        try {
            log.info("UDP - client started: " + this.hostname + ":" + this.port);
            isRunning = true;
            buf       = new ByteBuffer(5000);    // Size increased due to the length of (server_param.
            buf.setString(getInitMessage());
            socket = new DatagramSocket();
            socket.setSoTimeout(300000);         // Timeout of 5 mins, which should be enough to keep everything connected.
            DatagramPacket p = new DatagramPacket(buf.getByteArray(), buf.getByteArray().length,
                                   InetAddress.getByName(hostname), port);
            socket.send(p);
            socket.receive(p);
            this.host = p.getAddress();
            this.port = p.getPort();
            received(buf.getString());
            while (isRunning) {    // Continue until the program is closed. This is where sserver messages are received.
                buf.reset();
                DatagramPacket packet = new DatagramPacket(buf.getByteArray(), buf.getByteArray().length);
                socket.receive(packet);
                received(buf.getString());
            }
        } catch (Exception ex) {
            log.error("Stopped running " + getName() + " " + getDescription() + " because: " + ex.toString());
        }

        // Clean up.
        socket.close();
        try {
            buf.close();
        } catch (IOException ex) {
            log.error("Error cleaning up thread - " + ex.getMessage());
        }
        try {
            this.finalize();
        } catch (Throwable ex) {
            log.error("Error cleaning up thread - " + ex.getMessage());
        }
        log.info("UDP - client terminated: " + this.hostname + ":" + this.port);
    }

    /**
     *
     * @return
     */
    protected String getDescription() {
        return "AbstractUDPClient";
    }

    /**
     * Sends a message.
     * @param message A valid SServer message.
     * @throws IOException
     */
    public void send(String message) throws IOException {
        buf.setString(message);
        DatagramPacket packet = new DatagramPacket(buf.getByteArray(), buf.length(), host, port);
        socket.send(packet);
    }

    /**
     * Returns the init message for this client.
     * @return The init message.
     */
    public abstract String getInitMessage();

    /**
     * Received a message.
     * @param msg The message received.
     * @throws IOException
     */
    public abstract void received(String msg) throws IOException;

    /**
     * Pause the thread.
     * @param ms The length of time to pause the thread (in ms).
     */
    protected synchronized void pauseMilliseconds(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {}
    }

    /**
     * Start the thread.
     */
    @Override
    public void start() {
        if (this.isRunning) {
            log.info("started but was already running.");
        } else {
            super.start();
        }
    }

    /**
     * Returns a string containing the connection details.
     * @return Connection details (eg. "Host: 192.168.1.67:6000").
     */
    public String toStateString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Host: ");
        buff.append(this.hostname);
        buff.append(':');
        buff.append(this.port);
        buff.append("\n");
        return buff.toString();
    }
}
