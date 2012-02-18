package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.AbstractUDPClient;
import junit.framework.Assert;

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
    }

    /**
     * Test of stopRunning method, of class AbstractUDPClient.
     */
    @Test
    public void testStopRunning() {
        System.out.println("stopRunning");
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.stopRunning();
    }

    /**
     * Test of run method, of class AbstractUDPClient.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        AbstractUDPClient instance = new AbstractUDPClientImpl();

        // instance.run(); //TODO Find a way to test this.
    }

    /**
     * Test of send method, of class AbstractUDPClient.
     * @throws Exception
     */
    @Test(expected = NullPointerException.class)
    public void testSend() throws Exception {
        System.out.println("send");
        String            message  = "Test";
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.send(message);
    }

    /**
     * Test of getInitMessage method, of class AbstractUDPClient.
     */
    @Test
    public void testGetInitMessage() {
        System.out.println("getInitMessage");
        AbstractUDPClient instance  = new AbstractUDPClientImpl();
        String            expResult = "blah";
        String            result    = instance.getInitMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of received method, of class AbstractUDPClient.
     * @throws Exception
     */
    @Test
    public void testReceived() throws Exception {
        System.out.println("received");
        String            msg      = "Test";
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.received(msg);
    }

    /**
     * Test of start method, of class AbstractUDPClient.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        instance.start();
    }

    /**
     * Test of toStateString method, of class AbstractUDPClient.
     */
    @Test
    public void testToStateString() {
        System.out.println("toStateString");
        AbstractUDPClient instance  = new AbstractUDPClientImpl();
        String            expResult = "Host: localhost:6000\n";
        String            result    = instance.toStateString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class AbstractUDPClient.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        AbstractUDPClient instance  = new AbstractUDPClientImpl();
        String            expResult = "AbstractUDPClient";
        String            result    = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of pauseMilliseconds method, of class AbstractUDPClient.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPauseMilliseconds() {
        System.out.println("pauseMilliseconds");
        int               ms       = 1000;
        AbstractUDPClient instance = new AbstractUDPClientImpl();
        long              time     = System.currentTimeMillis();
        instance.pauseMilliseconds(ms);
        Assert.assertTrue((System.currentTimeMillis() - time) >= ms);
        ms   = 12;
        time = System.currentTimeMillis();
        instance.pauseMilliseconds(ms);
        Assert.assertTrue((System.currentTimeMillis() - time) >= ms);
        ms   = 411;
        time = System.currentTimeMillis();
        instance.pauseMilliseconds(ms);
        Assert.assertTrue((System.currentTimeMillis() - time) >= ms);
        ms   = 1;
        time = System.currentTimeMillis();
        instance.pauseMilliseconds(ms);
        Assert.assertTrue((System.currentTimeMillis() - time) >= ms);
        ms   = -1;
        time = System.currentTimeMillis();
        instance.pauseMilliseconds(ms);
        Assert.assertTrue((System.currentTimeMillis() - time) >= ms);
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
            return "blah";
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
