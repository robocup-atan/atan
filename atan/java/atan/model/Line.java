package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.commons.lang.enums.Enum;

/**
 * Class description
 * @author Atan
 */
public class Line extends Enum {

    /**
     *
     */
    public static final Line LINE_CENTER = new Line("center");

    /**
     *
     */
    public static final Line LINE_OWN = new Line("own");

    /**
     *
     */
    public static final Line LINE_OTHER = new Line("other");

    /**
     *
     */
    public static final Line LINE_LEFT = new Line("left");

    /**
     *
     */
    public static final Line LINE_RIGHT = new Line("right");

    /**
     * Constructs ...
     * @param name
     */
    public Line(String name) {
        super(name);
    }
}
