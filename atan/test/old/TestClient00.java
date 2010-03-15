package atan.test;

//~--- non-JDK imports --------------------------------------------------------

import atan.model.AbstractUDPClient;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 *
 * @author Atan
 */
public class TestClient00 extends AbstractUDPClient {
    private String teamName;

    /**
     *
     * @param teamName
     */
    public TestClient00(String teamName) {
        this.teamName = teamName;
    }

    /**
     *
     * @return
     */
    @Override
    public String getInitMessage() {
        return "(init " + teamName + ")";
    }

    /**
     *
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
     *
     * @param msg
     * @return
     */
    private boolean isInitMessage(String msg) {
        return msg.substring(1, 4).equals("ini");
    }

    /**
     *
     * @param msg
     * @return
     */
    private boolean isSeeMessage(String msg) {
        return msg.substring(1, 4).equals("see");
    }

    /**
     *
     * @param msg
     * @return
     */
    private boolean isHearKickOffMessage(String msg) {
        return msg.substring(1, 26).equals("hear 0 referee kick_off_l");
    }

    /**
     *
     */
    private void startRunning() {
        System.out.println("Start Running");
        TestClient00Runner r = new TestClient00Runner(this);
        r.start();
    }

    /**
     *
     * @throws IOException
     */
    public void takeStep() throws IOException {
        send("(dash 100)");
        pauseMilliseconds(200);
        send("(turn 45)");
        pauseMilliseconds(200);
    }

    /**
     *
     * @param teamName
     */
    private static void addPlayer(String teamName) {
        TestClient00 c = new TestClient00(teamName);
        c.start();
    }

    /**
     *
     * @param ex
     */
    void handleException(Exception ex) {
        System.out.println(teamName + " " + ex.getMessage());
    }

    /**
     *
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
