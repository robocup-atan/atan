/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nick
 */
public class ByteBufferTest {

    public ByteBufferTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getByteArray method, of class ByteBuffer.
     */
    @Test
    public void testGetByteArray() {
        System.out.println("getByteArray");
        ByteBuffer instance = null;
        byte[] expResult = null;
        byte[] result = instance.getByteArray();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setString method, of class ByteBuffer.
     */
    @Test
    public void testSetString() throws Exception {
        System.out.println("setString");
        String str = "";
        ByteBuffer instance = null;
        instance.setString(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getString method, of class ByteBuffer.
     */
    @Test
    public void testGetString() throws Exception {
        System.out.println("getString");
        ByteBuffer instance = null;
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of length method, of class ByteBuffer.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        ByteBuffer instance = null;
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class ByteBuffer.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        ByteBuffer instance = null;
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}