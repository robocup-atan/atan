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
    private static final int TILE_WIDTH = 8;
    private static final int XPM_HEIGHT = 64;
    private static final int XPM_WIDTH  = 256;
    String[][]               image      = new String[XPM_HEIGHT][XPM_WIDTH];

    /**
     * Constructs a black box.
     */
    public XPMImage() {
        for (int row = 0; row < XPM_HEIGHT - 1; row++) {
            for (int col = 0; col < XPM_WIDTH - 1; col++) {
                image[row][col] = "#ffffff";
            }
        }
    }

    /**
     * Gets a tile of the XPM Image.
     * @param x Between 0 and 31.
     * @param y Between 0 and 7.
     * @return An 8*8 tile.
     */
    public String[][] getTile(int x, int y) {
        String[][] retrieved = new String[8][8];
        if (((0 <= x) && (x <= 7)) && ((0 <= y) && (y <= 31))) {    // Ensure the tile is valid.
            for (int row = y; row < (y + TILE_WIDTH); row++) {
                for (int col = x; col < (x + TILE_WIDTH); col++) {
                    retrieved[col % TILE_WIDTH][row % TILE_WIDTH] = image[col][row];
                }
            }
        }
        return retrieved;
    }

    /**
     * Updates an 8*8 tile in the XPM Image.
     * @param x Between 0 and 31.
     * @param y Between 0 and 7.
     * @param tile An 8*8 string array, containing RGB values.
     */
    public void updateTile(int x, int y, String[][] tile) {
        if (((0 <= x) && (x <= 7)) && ((0 <= y) && (y <= 31))) {    // Ensure the tile is valid.
            for (int row = y; row < (y + TILE_WIDTH); row++) {
                for (int col = x; col < (x + TILE_WIDTH); col++) {
                    image[col][row] = tile[col % TILE_WIDTH][row % TILE_WIDTH];
                }
            }
        }
    }

    /**
     *
     * @return
     */
    public int getXPMHeight() {
        return XPM_HEIGHT;
    }

    /**
     *
     * @return
     */
    public int getXPMWidth() {
        return XPM_WIDTH;
    }

    /**
     *
     * @return
     */
    public int getTileWidth() {
        return TILE_WIDTH;
    }
}
