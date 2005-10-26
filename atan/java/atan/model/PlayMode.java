package atan.model;

import org.apache.commons.lang.enums.Enum;

public class PlayMode extends Enum {

	public static final PlayMode BEFORE_KICK_OFF = new PlayMode("beforeKickOff");

	public static final PlayMode TIME_OVER = new PlayMode("timeOver");

	public static final PlayMode PLAY_ON = new PlayMode("playOn");

	public static final PlayMode KICK_OFF_OWN = new PlayMode("kickOffOwn");

	public static final PlayMode KICK_OFF_OTHER = new PlayMode("kickOffOther");

	public static final PlayMode KICK_IN_OWN = new PlayMode("kickInOwn");

	public static final PlayMode KICK_IN_OTHER = new PlayMode("kickInOther");

	public static final PlayMode FREE_KICK_OWN = new PlayMode("freeKickOwn");

	public static final PlayMode FREE_KICK_OTHER = new PlayMode("freeKickOther");

	public static final PlayMode CORNER_KICK_OWN = new PlayMode("cornerKickOwn");

	public static final PlayMode CORNER_KICK_OTHER = new PlayMode(
			"cornerKickOther");

	public static final PlayMode GOAL_KICK_OWN = new PlayMode("goalKickOwn");

	public static final PlayMode GOAL_KICK_OTHER = new PlayMode("goalKickOther");

	public static final PlayMode GOAL_OWN = new PlayMode("goalOwn");

	public static final PlayMode GOAL_OTHER = new PlayMode("goalOther");

	public PlayMode(String name) {
		super(name);
	}

}
