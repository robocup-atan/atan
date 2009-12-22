package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.commons.lang.enums.Enum;

/**
 * Class description
 * @author Atan
 */
public class ViewAngle extends Enum {
    public static final ViewAngle NARROW = new ViewAngle("narrow");
    public static final ViewAngle NORMAL = new ViewAngle("normal");
    public static final ViewAngle WIDE   = new ViewAngle("wide");

    /**
     * Constructs ...
     * @param name
     */
    public ViewAngle(String name) {
        super(name);
    }
}
