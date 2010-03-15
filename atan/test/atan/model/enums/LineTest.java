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
public class LineTest {

    public LineTest() {
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
     * Test of values method, of class Line.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Line[] expResult = {Line.CENTER, Line.OWN, Line.OTHER, Line.LEFT, Line.RIGHT};
        Line[] result = Line.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Line.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "CENTER";
        Line expResult = Line.CENTER;
        Line result = Line.valueOf(name);
        assertEquals(expResult, result);
        name = "LEFT";
        expResult = Line.LEFT;
        result = Line.valueOf(name);
        assertEquals(expResult, result);
        name = "RIGHT";
        expResult = Line.RIGHT;
        result = Line.valueOf(name);
        assertEquals(expResult, result);
        name = "OWN";
        expResult = Line.OWN;
        result = Line.valueOf(name);
        assertEquals(expResult, result);
        name = "OTHER";
        expResult = Line.OTHER;
        result = Line.valueOf(name);
        assertEquals(expResult, result);
    }

}