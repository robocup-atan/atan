package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Atan
 */
public class XPMImageTest {

    /**
     *
     */
    public XPMImageTest() {}

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
     * Test of getTile method, of class XPMImage.
     */
    @Test
    public void testGetTile() {
        System.out.println("getTile");
        int        x         = 0;
        int        y         = 0;
        XPMImage   instance  = new XPMImage();
        String[][] expResult = null;
        String[][] result    = instance.getTile(x, y);
        assertArrayEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateTile method, of class XPMImage.
     */
    @Test
    public void testUpdateTile() {
        System.out.println("updateTile");
        int        x        = 0;
        int        y        = 0;
        String[][] tile     = null;
        XPMImage   instance = new XPMImage();
        instance.updateTile(x, y, tile);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXPMHeight method, of class XPMImage.
     */
    @Test
    public void testGetXPMHeight() {
        System.out.println("getXPMHeight");
        XPMImage instance  = new XPMImage();
        int      expResult = 64;
        int      result    = instance.getXPMHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getXPMWidth method, of class XPMImage.
     */
    @Test
    public void testGetXPMWidth() {
        System.out.println("getXPMWidth");
        XPMImage instance  = new XPMImage();
        int      expResult = 256;
        int      result    = instance.getXPMWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTileWidth method, of class XPMImage.
     */
    @Test
    public void testGetTileWidth() {
        System.out.println("getTileWidth");
        XPMImage instance  = new XPMImage();
        int      expResult = 8;
        int      result    = instance.getTileWidth();
        assertEquals(expResult, result);
    }
}
