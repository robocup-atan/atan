package com.github.robocup_atan.atan.model.enums;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.enums.ViewQuality;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <p>ViewQualityTest class.</p>
 *
 * @author Atan
 * @since 1.0
 */
public class ViewQualityTest {

    /**
     * <p>Constructor for ViewQualityTest.</p>
     */
    public ViewQualityTest() {}

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
     * Test of values method, of class ViewQuality.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        ViewQuality[] expResult = {ViewQuality.HIGH, ViewQuality.LOW};
        ViewQuality[] result    = ViewQuality.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class ViewQuality.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String      name      = "HIGH";
        ViewQuality expResult = ViewQuality.HIGH;
        ViewQuality result    = ViewQuality.valueOf(name);
        assertEquals(expResult, result);
        name      = "LOW";
        expResult = ViewQuality.LOW;
        result    = ViewQuality.valueOf(name);
        assertEquals(expResult, result);
        name      = "LOW";
        expResult = ViewQuality.HIGH;
        result    = ViewQuality.valueOf(name);
        assertFalse(result.equals(expResult));
    }
}
