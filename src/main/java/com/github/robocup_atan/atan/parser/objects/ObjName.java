package com.github.robocup_atan.atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.ControllerTrainer;

/**
 * The interface for all objects on the pitch. This is used to translate
 * them so that they are relative to each team (ie. ourGoal, theirGoal)
 *
 * @author Atan
 */
public interface ObjName {

    /**
     * The object viewed from the east, in the eyes of the player.
     *
     * @param c An instance of ControllerPlayer.
     * @param distance The distance of the object.
     * @param direction The direction of the object.
     * @param distChange The change in distance of the object.
     * @param dirChange The change in direction of the object.
     * @param bodyFacingDirection The direction the players body is facing.
     * @param headFacingDirection The direction the players head is facing.
     */
    public void infoSeeFromEast(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The object viewed from the west, in the eyes of the player.
     *
     * @param c An instance of ControllerPlayer.
     * @param distance The distance of the object.
     * @param direction The direction of the object.
     * @param distChange The change in distance of the object.
     * @param dirChange The change in direction of the object.
     * @param bodyFacingDirection The direction the players body is facing.
     * @param headFacingDirection The direction the players head is facing.
     */
    public void infoSeeFromWest(ControllerPlayer c, double distance, double direction, double distChange,
                                double dirChange, double bodyFacingDirection, double headFacingDirection);

    /**
     * The object viewed from the east, in the eyes of the coach.
     *
     * @param c An instance of ControllerCoach.
     * @param x The x coordinate of the object.
     * @param y The y coordinate of the object.
     * @param deltaX The change in x of the object.
     * @param deltaY The change in y of the object.
     * @param bodyAngle The body angle of the seen player.
     * @param neckAngle The neck angle of the seen player.
     */
    public void infoSeeFromEast(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle);

    /**
     * The object viewed from the west, in the eyes of the coach.
     *
     * @param c An instance of ControllerCoach.
     * @param x The x coordinate of the object.
     * @param y The y coordinate of the object.
     * @param deltaX The change in x of the object.
     * @param deltaY The change in y of the object.
     * @param bodyAngle The body angle of the seen player.
     * @param neckAngle The neck angle of the seen player.
     */
    public void infoSeeFromWest(ControllerCoach c, double x, double y, double deltaX, double deltaY, double bodyAngle,
                                double neckAngle);

    /**
     * The object viewed in the eyes of the trainer.
     *
     * @param c An instance of ControllerTrainer.
     */
    public void infoSee(ControllerTrainer c);
}
