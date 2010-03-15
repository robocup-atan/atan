
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package atan.model.enums;

//~--- non-JDK imports --------------------------------------------------------

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

    /**
     *
     */
    public FlagTest() {}

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
     * Test of values method, of class Flag.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Flag[] expResult = {
            Flag.CENTER, Flag.LEFT, Flag.LEFT_10, Flag.LEFT_20, Flag.LEFT_30, Flag.OTHER_10, Flag.OTHER_20,
            Flag.OTHER_30, Flag.OTHER_40, Flag.OTHER_50, Flag.OWN_10, Flag.OWN_20, Flag.OWN_30, Flag.OWN_40,
            Flag.OWN_50, Flag.RIGHT, Flag.RIGHT_10, Flag.RIGHT_20, Flag.RIGHT_30
        };
        Flag[] result = Flag.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Flag.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name      = "CENTER";
        Flag   expResult = Flag.CENTER;
        Flag   result    = Flag.valueOf(name);
        assertEquals(expResult, result);
        System.out.println("valueOf");
        name      = "LEFT";
        expResult = Flag.LEFT;
        result    = Flag.valueOf(name);
        assertEquals(expResult, result);
        System.out.println("valueOf");
        name      = "LEFT_10";
        expResult = Flag.LEFT_10;
        result    = Flag.valueOf(name);
    }

    /**
     * Test of isLeftRightCenter method, of class Flag.
     */
    @Test
    public void testIsLeftRightCenter() {
        System.out.println("isLeftRightCenter");
        Flag    pointer   = Flag.LEFT_30;
        boolean expResult = false;
        boolean result    = Flag.isLeftRightCenter(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.OWN_10;
        expResult = false;
        result    = Flag.isLeftRightCenter(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.RIGHT;
        expResult = true;
        result    = Flag.isLeftRightCenter(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.CENTER;
        expResult = true;
        result    = Flag.isLeftRightCenter(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.LEFT;
        expResult = true;
        result    = Flag.isLeftRightCenter(pointer);
        assertEquals(expResult, result);
    }

    /**
     * Test of isLeftRight method, of class Flag.
     */
    @Test
    public void testIsLeftRight() {
        System.out.println("isLeftRightCenter");
        Flag    pointer   = Flag.LEFT_30;
        boolean expResult = false;
        boolean result    = Flag.isLeftRight(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.OWN_10;
        expResult = false;
        result    = Flag.isLeftRight(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.RIGHT;
        expResult = true;
        result    = Flag.isLeftRight(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.CENTER;
        expResult = false;
        result    = Flag.isLeftRight(pointer);
        assertEquals(expResult, result);
        System.out.println("isLeftRightCenter");
        pointer   = Flag.LEFT;
        expResult = true;
        result    = Flag.isLeftRight(pointer);
        assertEquals(expResult, result);
    }
}
