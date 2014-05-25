package com.github.robocup_atan.atan.model;

/*
 * #%L
 * Atan
 * %%
 * Copyright (C) 2003 - 2014 Atan
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

/**
 * A class used to create an XPM image, suitable for sending to SServer.
 * The online coach can send teams-graphics as 256 x 64 XPM to the server.
 * Each team graphic-command sends an 8x8 tile.
 * X and Y are the coordinates of this tile,
 * so they range from 0 to 31 and 0 to 7 respectively.
 * Each XPM line is a line from the 8x8 XPM tile.
 *
 * @author Atan
 */
public class XPMImage {

    // Some default tile colours to make it easier to create your first XPMImage.
    /** Constant <code>COLOUR_BLACK_TILE="\"8 8 1 1\" \"b c black\" \"bbbbbbbb\" "{trunked}</code> */
    public static final String COLOUR_BLACK_TILE = "\"8 8 1 1\" \"b c black\" "
                                                   + "\"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\" "
                                                   + "\"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\" \"bbbbbbbb\"";
    /** Constant <code>COLOUR_DEFAULT_PITCH_TILE="\"8 8 1 1\" \"  c None\" \"        \" \"{trunked}</code> */
    public static final String COLOUR_DEFAULT_PITCH_TILE = "\"8 8 1 1\" \"  c None\" "
                                                           + "\"        \" \"        \" \"        \" \"        \" "
                                                           + "\"        \" \"        \" \"        \" \"        \"";
    /** Constant <code>COLOUR_RED_TILE="\"8 8 1 1\" \"r c red\" \"rrrrrrrr\" \""{trunked}</code> */
    public static final String COLOUR_RED_TILE = "\"8 8 1 1\" \"r c red\" "
                                                 + "\"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\" "
                                                 + "\"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\" \"rrrrrrrr\"";
    /** Constant <code>COLOUR_WHITE_TILE="\"8 8 1 1\" \"w c white\" \"wwwwwwww\" "{trunked}</code> */
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
     *
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
     *
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
     *
     * @return The XPM image height.
     */
    public int getXPMHeight() {
        return XPM_HEIGHT;
    }

    /**
     * Returns the XPM image width.
     *
     * @return The XPM image width.
     */
    public int getXPMWidth() {
        return XPM_WIDTH;
    }

    /**
     * Returns the tile width.
     *
     * @return The tile width.
     */
    public int getTileWidth() {
        return TILE_WIDTH;
    }

    /**
     * Returns the tile height.
     *
     * @return The tile height.
     */
    public int getTileHeight() {
        return TILE_HEIGHT;
    }

    /**
     * Returns the array height as an array index.
     * Ie. Starting at 0 not 1.
     *
     * @return The array height.
     */
    public int getArrayHeight() {
        return ARRAY_HEIGHT - 1;
    }

    /**
     * Returns the array width as an array index.
     * Ie. Starting at 0 not 1.
     *
     * @return The array width.
     */
    public int getArrayWidth() {
        return ARRAY_WIDTH - 1;
    }
}
