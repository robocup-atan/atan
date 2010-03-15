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
public class RefereeMessageTest {

    public RefereeMessageTest() {
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
     * Test of values method, of class RefereeMessage.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        RefereeMessage[] expResult = null;
        RefereeMessage[] result = RefereeMessage.values();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class RefereeMessage.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        RefereeMessage expResult = null;
        RefereeMessage result = RefereeMessage.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}