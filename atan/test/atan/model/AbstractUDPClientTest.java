package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 *
 * @author Atan
 */
public class AbstractUDPClientTest {

    /**
     *
     */
    public AbstractUDPClientTest() {}

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     *
     */
    @Before
    public void setUp() {}

    /**
     *
     */
    @After
    public void tearDown() {}

    /**
     * Test of isRunning method, of class AbstractUDPClient.
     */
    @Test
    public void testIsRunning() {
        System.out.println("isRunning");
        AbstractUDPClient instance  = new AbstractUDPClientImpl();
        boolean           expResult = false;
        boolean           result    = instance.isRunning();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopRunning method, of class AbstractUDPClient.
     */
    @Test
    public void testStopRunning() {
        System.out.println("stopRunning");
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.stopRunning();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class AbstractUDPClient.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.run();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of send method, of class AbstractUDPClient.
     * @throws Exception
     */
    @Test
    public void testSend() throws Exception {
        System.out.println("send");
        String            message  = "";
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.send(message);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInitMessage method, of class AbstractUDPClient.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        AbstractUDPClient instance  = new AbstractUDPClientImpl();
        String            expResult = "";
        String            result    = instance.getInitMessage();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of received method, of class AbstractUDPClient.
     * @throws Exception
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String            msg      = "";
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.received(msg);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class AbstractUDPClient.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.start();

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStateString method, of class AbstractUDPClient.
     */
    @Test
    public void testToStateString() {
        System.out.println("toStateString");
        AbstractUDPClient instance  = new AbstractUDPClientImpl();
        String            expResult = "";
        String            result    = instance.toStateString();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class AbstractUDPClient.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        AbstractUDPClient instance  = new AbstractUDPClientImpl();
        String            expResult = "";
        String            result    = instance.getDescription();
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pauseMilliseconds method, of class AbstractUDPClient.
     */
    @Test
    public void testPauseMilliseconds() {
        System.out.println("pauseMilliseconds");
        int               ms       = 0;
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.pauseMilliseconds(ms);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     *
     * @author author
     */
    public static class AbstractUDPClientImpl extends AbstractUDPClient {

        /**
         *
         * @return
         */
        @Override
        public String getInitMessage() {
            return "";
        }

        /**
         *
         * @param msg
         * @throws IOException
         */
        @Override
        public void received(String msg) throws IOException {}
    }
}
