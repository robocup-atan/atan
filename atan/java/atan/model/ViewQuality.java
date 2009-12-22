package atan.model;

//~--- non-JDK imports --------------------------------------------------------

import org.apache.commons.lang.enums.Enum;

/**
 * Class description
 * @author Atan
 */
public class ViewQuality extends Enum {
    public static final ViewQuality HIGH = new ViewQuality("high");
    public static final ViewQuality LOW  = new ViewQuality("low");

    /**
     * Constructs ...
     * @param name
     */
    public ViewQuality(String name) {
        super(name);
    }
}
