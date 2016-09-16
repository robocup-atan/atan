package com.github.robocup_atan.atan.parser.objects;

//~--- non-JDK imports --------------------------------------------------------

import java.rmi.activation.UnknownObjectException;

import com.github.robocup_atan.atan.model.ControllerCoach;
import com.github.robocup_atan.atan.model.ControllerPlayer;
import com.github.robocup_atan.atan.model.ControllerTrainer;
import com.github.robocup_atan.atan.model.enums.UnknownObject;

/**
 * A unknown Object. If the name of the specific object is unknown it is stated
 * as G, F or P for Goal, Flag or Player.
 *
 * @author Atan modified by @author René Kremer
 */
public class ObjNameUnknown implements ObjName {
	/**
	 * Object Type as stated in the manual (GOAL, FLAG or PLAYER)
	 */
	private UnknownObject objType;

	/**
	 * Constructor
	 * 
	 * @param type
	 *            is the UnknownObject Type given via see command
	 */
	public ObjNameUnknown(UnknownObject type) {
		if (type != null) {
			switch (type) {
			case GOAL:
				this.objType = UnknownObject.GOAL;
				break;
			case FLAG:
				this.objType = UnknownObject.FLAG;
				break;
			case PLAYER:
				this.objType = UnknownObject.PLAYER;
				break;
			default:
				this.objType = null;
			}
		} else {
			this.objType = null;
		}

	}

	/** {@inheritDoc} */
	@Override
	public void infoSeeFromEast(ControllerPlayer c, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		c.infoSeeUnknownObject(this.objType, distance, direction, distChange,
				dirChange, bodyFacingDirection, headFacingDirection);
	}

	/** {@inheritDoc} */
	@Override
	public void infoSeeFromWest(ControllerPlayer c, double distance,
			double direction, double distChange, double dirChange,
			double bodyFacingDirection, double headFacingDirection) {
		c.infoSeeUnknownObject(this.objType, distance, direction, distChange,
				dirChange, bodyFacingDirection, headFacingDirection);
	}

	/** {@inheritDoc} */
	@Override
	public void infoSeeFromEast(ControllerCoach c, double x, double y,
			double deltaX, double deltaY, double bodyAngle, double neckAngle) {
	}

	/** {@inheritDoc} */
	@Override
	public void infoSeeFromWest(ControllerCoach c, double x, double y,
			double deltaX, double deltaY, double bodyAngle, double neckAngle) {
	}

	/** {@inheritDoc} */
	@Override
	public void infoSee(ControllerTrainer c) {
	}
}
