package atan.test;

/**
 * Class description
 * @author Atan
 */
public class TestClient00Runner extends Thread {
    TestClient00 client;

    /**
     * Constructs ...
     * @param client
     */
    public TestClient00Runner(TestClient00 client) {
        this.client = client;
    }

    /**
     * 
     */
    @Override
    public void run() {
        try {
            while (true) {
                client.takeStep();
            }
        } catch (Exception ex) {
            client.handleException(ex);
        }
    }
}
