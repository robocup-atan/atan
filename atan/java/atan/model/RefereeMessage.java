package atan.model;

import org.apache.commons.lang.enums.Enum;

public class RefereeMessage extends Enum {

	public static final RefereeMessage FOUL_OWN = new RefereeMessage("foulOwn");

	public static final RefereeMessage FOUL_OTHER = new RefereeMessage(
			"foulOther");

	public static final RefereeMessage HALF_TIME = new RefereeMessage(
			"halfTime");

	public static final RefereeMessage TIME_UP = new RefereeMessage("timeUp");

	public static final RefereeMessage TIME_UP_WITHOUT_A_TEAM = new RefereeMessage(
			"timeUpWithoutATeam");

	public static final RefereeMessage TIME_EXTENDED = new RefereeMessage(
			"timeExtended");

	public static final RefereeMessage DROP_BALL = new RefereeMessage(
			"dropBall");

	public static final RefereeMessage OFFSIDE_OWN = new RefereeMessage(
			"offsideOwn");

	public static final RefereeMessage OFFSIDE_OTHER = new RefereeMessage(
			"offsideOther");

	public RefereeMessage(String name) {
		super(name);
	}

}
