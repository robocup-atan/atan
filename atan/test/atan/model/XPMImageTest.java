package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import junit.framework.Assert;

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
        XPMImage instance  = new XPMImage();
        String   expResult = XPMImage.COLOUR_DEFAULT_PITCH_TILE;
        for (int x = 0; x < instance.getArrayWidth(); x++) {
            for (int y = 0; y < instance.getArrayHeight(); y++) {
                String result = instance.getTile(x, y);
                assertEquals(expResult, result);
            }
        }
    }

    /**
     * Test of getTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTile_invalid_1() {
        System.out.println("getTile");
        XPMImage instance = new XPMImage();
        instance.getTile(500, 113);
    }

    /**
     * Test of getTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTile_invalid_2() {
        System.out.println("getTile");
        XPMImage instance = new XPMImage();
        instance.getTile(-1, 3);
    }

    /**
     * Test of getTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTile_invalid_3() {
        System.out.println("getTile");
        XPMImage instance = new XPMImage();
        instance.getTile(-1, -8895);
    }

    /**
     * Test of getTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTile_invalid_4() {
        System.out.println("getTile");
        XPMImage instance = new XPMImage();
        instance.getTile(32, 8);
    }

    /**
     * Test of setTile method, of class XPMImage.
     */
    @Test
    public void testUpdateTile() {
        System.out.println("updateTile");
        String   tile     = XPMImage.COLOUR_RED_TILE;
        XPMImage instance = new XPMImage();
        for (int x = 0; x < instance.getArrayWidth(); x++) {
            for (int y = 0; y < instance.getArrayHeight(); y++) {
                instance.setTile(x, y, tile);
                Assert.assertEquals(tile, instance.getTile(x, y));
            }
        }
    }

    /**
     * Test of setTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateTile_invalid_1() {
        System.out.println("updateTile");
        String   tile     = XPMImage.COLOUR_RED_TILE;
        XPMImage instance = new XPMImage();
        instance.setTile(500, 113, tile);
    }

    /**
     * Test of setTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateTile_invalid_2() {
        System.out.println("updateTile");
        String   tile     = XPMImage.COLOUR_RED_TILE;
        XPMImage instance = new XPMImage();
        instance.setTile(-1, 3, tile);
    }

    /**
     * Test of setTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateTile_invalid_3() {
        System.out.println("updateTile");
        String   tile     = XPMImage.COLOUR_RED_TILE;
        XPMImage instance = new XPMImage();
        instance.setTile(-1, -8895, tile);
    }

    /**
     * Test of setTile method, of class XPMImage.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testUpdateTile_invalid_4() {
        System.out.println("updateTile");
        String   tile     = XPMImage.COLOUR_RED_TILE;
        XPMImage instance = new XPMImage();
        instance.setTile(32, 8, tile);
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

    /**
     * Test of getTileHeight method, of class XPMImage.
     */
    @Test
    public void testGetTileHeight() {
        System.out.println("getTileHeight");
        XPMImage instance  = new XPMImage();
        int      expResult = 8;
        int      result    = instance.getTileHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrayHeight method, of class XPMImage.
     */
    @Test
    public void testGetArrayHeight() {
        System.out.println("getArrayHeight");
        XPMImage instance  = new XPMImage();
        int      expResult = 7;
        int      result    = instance.getArrayHeight();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArrayWidth method, of class XPMImage.
     */
    @Test
    public void testGetArrayWidth() {
        System.out.println("getArrayWidth");
        XPMImage instance  = new XPMImage();
        int      expResult = 31;
        int      result    = instance.getArrayWidth();
        assertEquals(expResult, result);
    }
}
