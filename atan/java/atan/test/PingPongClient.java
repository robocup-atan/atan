package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.AbstractUDPClient;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 *
 * @author Atan
 */
public class PingPongClient extends AbstractUDPClient {
    private static int counter = 0;

    /**
     *
     * @param port
     */
    public PingPongClient(int port) {
        super(port);
    }

    /**
     *
     * @return
     */
    @Override
    public String getInitMessage() {
        return "hallo server";
    }

    /**
     *
     * @param msg
     * @throws IOException
     */
    @Override
    public void received(String msg) throws IOException {
        System.out.println("Client received: " + msg + " count: " + counter++);
        send("hallo server. Received already " + counter);
        this.pauseMilliseconds(200);
    }

    /**
     *
     * @param arg
     */
    public static void main(String[] arg) {
        try {
            PingPongClient client = new PingPongClient(4000);
            client.start();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
