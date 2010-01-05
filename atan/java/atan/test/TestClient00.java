package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.AbstractUDPClient;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 * Class description
 * @author Atan
 */
public class TestClient00 extends AbstractUDPClient {
    private String teamName;

    /**
     * Constructs ...
     * @param teamName
     */
    public TestClient00(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Method description
     * @return
     */
    @Override
    public String getInitMessage() {
        return "(init " + teamName + ")";
    }

    /**
     * Method description
     * @param s
     */
    @SuppressWarnings("empty-statement")
    @Override
    public void received(String s) {
        try {

//          System.out.print(s);
            if (isSeeMessage(s)) {
                ;
            } else if (isInitMessage(s)) {
                send("(move -30 0)");
            } else if (isHearKickOffMessage(s)) {
                startRunning();
            } else {
                System.out.print(s);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex.toString());
        }
    }

    /**
     * Method description
     * @param msg
     * @return
     */
    private boolean isInitMessage(String msg) {
        return msg.substring(1, 4).equals("ini");
    }

    /**
     * Method description
     * @param msg
     * @return
     */
    private boolean isSeeMessage(String msg) {
        return msg.substring(1, 4).equals("see");
    }

    /**
     * Method description
     * @param msg
     * @return
     */
    private boolean isHearKickOffMessage(String msg) {
        return msg.substring(1, 26).equals("hear 0 referee kick_off_l");
    }

    /**
     * Method description
     */
    private void startRunning() {
        System.out.println("Start Running");
        TestClient00Runner r = new TestClient00Runner(this);
        r.start();
    }

    /**
     * Method description
     * @throws IOException
     */
    public void takeStep() throws IOException {
        send("(dash 100)");
        pauseMilliseconds(200);
        send("(turn 45)");
        pauseMilliseconds(200);
    }

    /**
     * Method description
     * @param teamName
     */
    private static void addPlayer(String teamName) {
        TestClient00 c = new TestClient00(teamName);
        c.start();
    }

    /**
     * Method description
     * @param ex
     */
    void handleException(Exception ex) {
        System.out.println(teamName + " " + ex.getMessage());
    }

    /**
     * Method description
     * @param arg
     */
    public static void main(String[] arg) {
        try {
            for (int i = 0; i < 11; i++) {
                addPlayer("A");
            }
            for (int i = 0; i < 11; i++) {
                addPlayer("B");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
