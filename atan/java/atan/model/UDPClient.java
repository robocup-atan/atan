package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.log4j.Logger;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Class description
 * @author Atan
 */
public abstract class UDPClient extends Thread {
    private static Logger  log       = Logger.getLogger(UDPClient.class);
    private ByteBuffer     buf       = null;
    private String         hostname  = "localhost";
    private int            port      = 6000;
    private boolean        isRunning = false;
    private InetAddress    host;
    private DatagramSocket socket;

    /**
     * Constructs ...
     */
    public UDPClient() {
        this(6000, "localhost");
    }

    /**
     * Constructs ...
     * @param port
     */
    public UDPClient(int port) {
        this(port, "localhost");
    }

    /**
     * Constructs ...
     * @param port
     * @param hostname
     */
    public UDPClient(int port, String hostname) {
        super();
        this.port     = port;
        this.hostname = hostname;
    }

    /**
     * Method description
     * @return
     */
    public boolean isRunning() {
        return isRunning;
    }

    /**
     * Method description
     */
    @Override
    public void run() {
        try {
            log.info("UDP - client started: " + this.hostname + ":" + this.port);
            isRunning = true;
            buf       = new ByteBuffer(2000);
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
     * Method description
     * @return
     */
    protected String getDescription() {
        return "UDPClient";
    }

    /**
     * Method description
     * @param message
     * @throws IOException
     */
    public void send(String message) throws IOException {
        buf.setString(message);
        DatagramPacket packet = new DatagramPacket(buf.getByteArray(), buf.length(), host, port);
        socket.send(packet);
    }

    /**
     * Method description
     * @return
     */
    public abstract String getInitMessage();

    /**
     * Method description
     * @param msg
     * @throws IOException
     */
    public abstract void received(String msg) throws IOException;

    /**
     * Method description
     * @param ms
     */
    protected synchronized void pauseMilliseconds(int ms) {
        try {
            this.wait(ms);
        } catch (InterruptedException ex) {}
    }

    /**
     * Method description
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
     * Method description
     * @return
     */
    public String toStateString() {
        StringBuffer stringBuf = new StringBuffer();
        stringBuf.append("Host: ");
        stringBuf.append(this.hostname);
        stringBuf.append(":");
        stringBuf.append(this.port);
        stringBuf.append("\n");
        return stringBuf.toString();
    }
}
