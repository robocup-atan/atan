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
 * @author Stu
 */
public class ViewAngleTest {

    public ViewAngleTest() {
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
     * Test of values method, of class ViewAngle.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ViewAngle[] expResult = {ViewAngle.NARROW, ViewAngle.NORMAL, ViewAngle.WIDE};
        ViewAngle[] result = ViewAngle.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class ViewAngle.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "NARROW";
        ViewAngle expResult = ViewAngle.NARROW;
        ViewAngle result = ViewAngle.valueOf(name);
        assertEquals(expResult, result);
        name = "NORMAL";
        expResult = ViewAngle.NORMAL;
        result = ViewAngle.valueOf(name);
        assertEquals(expResult, result);
        name = "WIDE";
        expResult = ViewAngle.WIDE;
        result = ViewAngle.valueOf(name);
        assertEquals(expResult, result);       
    }

}