package atan.model;

/**
 * A class used to create an XPM image, suitable for sending to SServer.
 * The online coach can send teams-graphics as 256 x 64 XPM to the server.
 * Each team graphic-command sends an 8x8 tile.
 * X and Y are the coordinates of this tile,
 * so they range from 0 to 31 and 0 to 7 respectively.
 * Each XPM line is a line from the 8x8 XPM tile.
 * @author Atan
 */
public class XPMImage {

    // Some default tile colours to make it easier to create your first XPMImage.
    public static final String COLOUR_BLACK_TILE = "\"8 8 1 1\" \"b c black\" "
                                                   + "\"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\" "
                                                   + "\"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\"";
    public static final String COLOUR_DEFAULT_PITCH_TILE = "\"8 8 1 1\" \"  c #1FA01F\" "
                                                           + "\"        \" \"        \" \"        \" \"        \" "
                                                           + "\"        \" \"        \" \"        \" \"        \"";
    public static final String COLOUR_RED_TILE = "\"8 8 1 1\" \"r c red\" "
                                                 + "\"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\" "
                                                 + "\"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\"";
    public static final String COLOUR_WHITE_TILE = "\"8 8 1 1\" \"w c white\" "
                                                   + "\"wwwwwwww\" \"wwwwwwww\" \"wwwwwwww\" \"wwwwwwww\" "
                                                   + "\"wwwwwwww\" \"wwwwwwww\" \"wwwwwwww\" \"wwwwwwww\"";

    // XPMImage constants. Should only need to change if SServer changes.
    private static final int TILE_HEIGHT  = 8;
    private static final int TILE_WIDTH   = 8;
    private static final int XPM_HEIGHT   = 64;
    private static final int XPM_WIDTH    = 256;
    private static final int ARRAY_WIDTH  = XPM_WIDTH / TILE_WIDTH;
    private static final int ARRAY_HEIGHT = XPM_HEIGHT / TILE_HEIGHT;
    String[][]               image        = new String[ARRAY_WIDTH][ARRAY_HEIGHT];

    /**
     * Creates an XPM Image the default colour of the pitch.
     */
    public XPMImage() {
        for (int x = 0; x < getArrayWidth(); x++) {
            for (int y = 0; y < getArrayHeight(); y++) {
                setTile(x, y, COLOUR_DEFAULT_PITCH_TILE);
            }
        }
    }

    /**
     * Gets a tile of the XPM Image.
     * @param x Between 0 and 31.
     * @param y Between 0 and 7.
     * @return An XPM image string defining an 8*8 image.
     */
    public String getTile(int x, int y) {
        if ((x > getArrayWidth()) || (y > getArrayHeight()) || (x < 0) || (y < 0)) {
            throw new IllegalArgumentException();
        }
        return image[x][y];
    }

    /**
     * Updates an 8*8 tile in the XPM Image.
     * @param x Between 0 and 31.
     * @param y Between 0 and 7.
     * @param tile An XPM image string defining an 8*8 image.
     */
    public void setTile(int x, int y, String tile) {
        if ((x > getArrayWidth()) || (y > getArrayHeight()) || (x < 0) || (y < 0)) {
            throw new IllegalArgumentException();
        }
        image[x][y] = tile;
    }

    /**
     * Returns the XPM image height.
     * @return The XPM image height.
     */
    public int getXPMHeight() {
        return XPM_HEIGHT;
    }

    /**
     * Returns the XPM image width.
     * @return The XPM image width.
     */
    public int getXPMWidth() {
        return XPM_WIDTH;
    }

    /**
     * Returns the tile width.
     * @return The tile width.
     */
    public int getTileWidth() {
        return TILE_WIDTH;
    }

    /**
     * Returns the tile height.
     * @return The tile height.
     */
    public int getTileHeight() {
        return TILE_HEIGHT;
    }

    /**
     * Returns the array height as an array index.
     * Ie. Starting at 0 not 1.
     * @return The array height.
     */
    public int getArrayHeight() {
        return ARRAY_HEIGHT - 1;
    }

    /**
     * Returns the array width as an array index.
     * Ie. Starting at 0 not 1.
     * @return The array width.
     */
    public int getArrayWidth() {
        return ARRAY_WIDTH - 1;
    }
}
