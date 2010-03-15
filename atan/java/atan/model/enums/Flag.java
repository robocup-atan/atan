package atan.model.enums;

/**
 * An Enum for Flags.
 * @author Atan
 */
public enum Flag {

    /**
     * A flag used to indicate the center of something. Could be of a goal,
     * penalty box etc.
     */
    CENTER,

    /**
     * A flag used to indicate the left of something. Could be of a goal,
     * left corner flag, penalty box etc.
     */
    LEFT,

    /**
     * The flag on the left hand side of the goal, 10 along from the center of the goal. (could be left or right goal)
     */
    LEFT_10,

    /**
     * The flag on the left hand side of the goal, 20 along from the center of the goal. (could be left or right goal)
     */
    LEFT_20,

    /**
     * The flag on the left hand side of the goal, 30 along from the center of the goal. (could be left or right goal)
     */
    LEFT_30,

    /**
     * The flag on the other side of the pitch, 10 along from the center line. (could be top or bottom)
     */
    OTHER_10,

    /**
     * The flag on the other side of the pitch, 20 along from the center line. (could be top or bottom)
     */
    OTHER_20,

    /**
     * The flag on the other side of the pitch, 30 along from the center line. (could be top or bottom)
     */
    OTHER_30,

    /**
     * The flag on the other side of the pitch, 40 along from the center line. (could be top or bottom)
     */
    OTHER_40,

    /**
     * The flag on the other side of the pitch, 50 along from the center line. (could be top or bottom)
     */
    OTHER_50,

    /**
     * The flag on our side of the pitch, 10 along from the center line. (could be top or bottom)
     */
    OWN_10,

    /**
     * The flag on our side of the pitch, 20 along from the center line. (could be top or bottom)
     */
    OWN_20,

    /**
     * The flag on our side of the pitch, 30 along from the center line. (could be top or bottom)
     */
    OWN_30,

    /**
     * The flag on our side of the pitch, 40 along from the center line. (could be top or bottom)
     */
    OWN_40,

    /**
     * The flag on our side of the pitch, 50 along from the center line. (could be top or bottom)
     */
    OWN_50,

    /**
     * A flag used to indicate the right of something. Could be of a goal,
     * left corner flag, penalty box etc.
     */
    RIGHT,

    /**
     * The flag on the right hand side of the goal, 10 along from the center of the goal. (could be left or right goal)
     */
    RIGHT_10,

    /**
     * The flag on the right hand side of the goal, 20 along from the center of the goal. (could be left or right goal)
     */
    RIGHT_20,

    /**
     * The flag on the right hand side of the goal, 30 along from the center of the goal. (could be left or right goal)
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
