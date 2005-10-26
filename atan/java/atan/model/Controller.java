package atan.model;

/**
 * Interface that has to be implemented in order to control players. The methods
 * are run in a cycle whenever a see command arrives from sserver. At first
 * preInfo() is invoked. then the info*() methods are called according to what
 * kind of objects are currently seen or what other commands where received from
 * the server. At last postInfo() is called. All objects are relative to the
 * current side of the controller.
 */

public interface Controller {

	public void preInfo();

	public void postInfo();

	public Player getPlayer();

	public void setPlayer(Player c);

	public void infoSeeFlagRight(Flag flag, double distance, double direction);

	public void infoSeeFlagLeft(Flag flag, double distance, double direction);

	public void infoSeeFlagOwn(Flag flag, double distance, double direction);

	public void infoSeeFlagOther(Flag flag, double distance, double direction);

	public void infoSeeFlagCenter(Flag flag, double distance, double direction);

	public void infoSeeFlagCornerOwn(Flag flag, double distance,
			double direction);

	public void infoSeeFlagCornerOther(Flag flag, double distance,
			double direction);

	public void infoSeeFlagPenaltyOwn(Flag flag, double distance,
			double direction);

	public void infoSeeFlagPenaltyOther(Flag flag, double distance,
			double direction);

	public void infoSeeFlagGoalOwn(Flag flag, double distance, double direction);

	public void infoSeeFlagGoalOther(Flag flag, double distance,
			double direction);

	public void infoSeeLine(Line line, double distance, double direction);

	public void infoSeePlayerOther(int number, double distance, double direction);

	public void infoSeePlayerOwn(int number, double distance, double direction);

	public void infoSeeBall(double distance, double direction);

	public static final int PLAY_MODE_BEFORE_KICK_OFF = 3090;

	public static final int PLAY_MODE_TIME_OVER = 3100;

	public static final int PLAY_MODE_PLAY_ON = 3110;

	public static final int PLAY_MODE_KICK_OFF_OWN = 3120;

	public static final int PLAY_MODE_KICK_OFF_OTHER = 3130;

	public static final int PLAY_MODE_KICK_IN_OWN = 3140;

	public static final int PLAY_MODE_KICK_IN_OTHER = 3150;

	public static final int PLAY_MODE_FREE_KICK_OWN = 3160;

	public static final int PLAY_MODE_FREE_KICK_OTHER = 3170;

	public static final int PLAY_MODE_CORNER_KICK_OWN = 3180;

	public static final int PLAY_MODE_CORNER_KICK_OTHER = 3190;

	public static final int PLAY_MODE_GOAL_KICK_OWN = 3200;

	public static final int PLAY_MODE_GOAL_KICK_OTHER = 3210;

	public static final int PLAY_MODE_GOAL_OWN = 3220;

	public static final int PLAY_MODE_GOAL_OTHER = 3230;

	public void infoHearReferee(RefereeMessage refereeMessage);

	public void infoHearPlayMode(int playMode);

	public void infoHear(double direction, String message);

	public static final int VIEW_QUALITY_HIGH = 0;

	public static final int VIEW_QUALITY_LOW = 1;

	public static final int VIEW_ANGLE_NARROW = 2;

	public static final int VIEW_ANGLE_NORMAL = 3;

	public static final int VIEW_ANGLE_WIDE = 4;

	public void infoSenseBody(int viewQuality, int viewAngle, double stamina,
			double speed, double headAngle, int kickCount, int dashCount,
			int turnCount, int sayCount, int turnNeckCount);
}
