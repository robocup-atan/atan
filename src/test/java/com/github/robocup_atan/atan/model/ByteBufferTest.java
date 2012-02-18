package com.github.robocup_atan.atan.model;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ByteBuffer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 * <p>ByteBufferTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class ByteBufferTest {

    /**
     * <p>Constructor for ByteBufferTest.</p>
     */
    public ByteBufferTest() {}

    /**
     * <p>setUpClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @BeforeClass
    public static void setUpClass() throws Exception {}

    /**
     * <p>tearDownClass.</p>
     *
     * @throws java.lang.Exception if any.
     */
    @AfterClass
    public static void tearDownClass() throws Exception {}

    /**
     * <p>setUp.</p>
     */
    @Before
    public void setUp() {}

    /**
     * <p>tearDown.</p>
     */
    @After
    public void tearDown() {}

    /**
     * Test of getByteArray method, of class ByteBuffer.
     */
    @Test
    public void testGetByteArray() {
        System.out.println("getByteArray");
        ByteBuffer instance  = new ByteBuffer(10);
        int        expResult = 10;
        int        result    = instance.getByteArray().length;
        assertEquals(expResult, result);
    }

    /**
     * Test of setString method, of class ByteBuffer.
     *
     * @throws java.lang.Exception if any.
     */
    @Test
    public void testSetString() throws Exception {
        System.out.println("setString");
        String     str      = "lol";
        ByteBuffer instance = new ByteBuffer(10);
        instance.setString(str);
        String result = instance.getString();
        assertEquals("lol", result);
    }

    /**
     * Test of getString method, of class ByteBuffer.
     *
     * @throws java.lang.Exception if any.
     */
    @Test
    public void testGetString() throws Exception {
        System.out.println("getString");
        ByteBuffer instance = new ByteBuffer(10);
        instance.setString("lol");
        String expResult = "lol";
        String result    = instance.getString();
        assertEquals(expResult, result);
    }

    /**
     * Test of length method, of class ByteBuffer.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        ByteBuffer instance  = new ByteBuffer(10);
        int        expResult = 10;
        int        result    = instance.length();
        assertEquals(expResult, result);
    }

    /**
     * Test of reset method, of class ByteBuffer.
     *
     * @throws java.io.IOException if any.
     */
    @Test
    public void testReset() throws IOException {
        System.out.println("reset");
        ByteBuffer instance  = new ByteBuffer(10);
        String     expResult = "";
        String     result    = instance.getString();
        instance.reset();
        assertEquals(expResult, result);
    }
}
