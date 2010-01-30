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
     * Assumes localhost
     * Assumes port 6000
     */
    public AbstractUDPClient() {
        this(6000, "localhost");
    }

    /**
     * Constructs an AbstractUDPClient object given only the port number.
     * Assumes localhost.
     * @param port Any valid port.
     */
    public AbstractUDPClient(int port) {
        this(port, "localhost");
    }

    /**
     * Constructs an AbstractUDPClient object given the port number and hostname.
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
     * @return
     */
    public boolean isRunning() {
        return isRunning;
    }

    /**
     * Runs the thread.
     */
    @Override
    public void run() {
        try {
            log.info("UDP - client started: " + this.hostname + ":" + this.port);
            isRunning = true;
            buf       = new ByteBuffer(5000);
            buf.setString(getInitMessage());
            socket = new DatagramSocket();
            socket.setSoTimeout(3000);
            DatagramPacket p = new DatagramPacket(buf.getByteArray(), buf.getByteArray().length,
                                   InetAddress.getByName(hostname), port);
            socket.send(p);
            socket.receive(p);
            this.host = p.getAddress();
            this.port = p.getPort();
            received(buf.getString());
            while (true) {
                buf.reset();
                DatagramPacket packet = new DatagramPacket(buf.getByteArray(), buf.getByteArray().length);
                socket.receive(packet);
                received(buf.getString());
            }
        } catch (Exception ex) {
            log.error("Stopped running " + getName() + " " + getDescription() + " because: " + ex.toString());
        }
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
     * @param message
     * @throws IOException
     */
    public void send(String message) throws IOException {
        buf.setString(message);
        DatagramPacket packet = new DatagramPacket(buf.getByteArray(), buf.length(), host, port);
        socket.send(packet);
    }

    /**
     *
     * @return
     */
    public abstract String getInitMessage();

    /**
     * Recieved a message.
     * @param msg
     * @throws IOException
     */
    public abstract void received(String msg) throws IOException;

    /**
     *
     * @param ms
     */
    protected synchronized void pauseMilliseconds(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {}
    }

    /**
     *
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
     * (eg. "Host: 192.168.1.67:6000")
     * @return
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
