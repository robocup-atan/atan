/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package atan.model.enums;

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
public class FlagTest {

    public FlagTest() {
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
     * Test of values method, of class Flag.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Flag[] expResult = null;
        Flag[] result = Flag.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Flag.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Flag expResult = null;
        Flag result = Flag.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeftRightCenter method, of class Flag.
     */
    @Test
    public void testIsLeftRightCenter() {
        System.out.println("isLeftRightCenter");
        Flag pointer = null;
        boolean expResult = false;
        boolean result = Flag.isLeftRightCenter(pointer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeftRight method, of class Flag.
     */
    @Test
    public void testIsLeftRight() {
        System.out.println("isLeftRight");
        Flag pointer = null;
        boolean expResult = false;
        boolean result = Flag.isLeftRight(pointer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}