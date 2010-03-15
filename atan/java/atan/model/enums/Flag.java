package atan.model.enums;

/**
 * An Enum for Flags.
 * @author Atan
 */
public enum Flag {

    /**
     * A flag used to indicate the left of something. Could be of a goal,
     * left corner flag, penalty box etc.
     */
    LEFT,

    /**
     * A flag used to indicate the right of something. Could be of a goal,
     * left corner flag, penalty box etc.
     */
    RIGHT,

    /**
     * A flag used to indicate the center of something. Could be of a goal,
     * penalty box etc.
     */
    CENTER,

    /**
     *
     */
    OWN_50,

    /**
     *
     */
    OWN_40,

    /**
     *
     */
    OWN_30,

    /**
     *
     */
    OWN_20,

    /**
     *
     */
    OWN_10,

    /**
     *
     */
    OTHER_10,

    /**
     *
     */
    OTHER_20,

    /**
     *
     */
    OTHER_30,

    /**
     *
     */
    OTHER_40,

    /**
     *
     */
    OTHER_50,

    /**
     *
     */
    LEFT_10,

    /**
     *
     */
    LEFT_20,

    /**
     *
     */
    LEFT_30,

    /**
     *
     */
    RIGHT_10,

    /**
     *
     */
    RIGHT_20,

    /**
     *
     */
    RIGHT_30;

    /**
     * Checks if the enum flag is LEFT RIGHT or CENTER.
     * @param pointer The flag to check.
     * @return true or false
     */
    public static boolean isLeftRightCenter(Flag pointer) {
        if (pointer.name().equals("LEFT") || pointer.name().equals("CENTER") || pointer.name().equals("RIGHT")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks if the enum flag is LEFT or RIGHT.
     * @param pointer The flag to check.
     * @return true or false
     */
    public static boolean isLeftRight(Flag pointer) {
        if (pointer.name().equals("LEFT") || pointer.name().equals("RIGHT")) {
            return true;
        } else {
            return false;
        }
    }
}
