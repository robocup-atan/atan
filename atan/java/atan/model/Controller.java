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

	public void infoHearReferee(RefereeMessage refereeMessage);

	public void infoHearPlayMode(PlayMode playMode);

	public void infoHear(double direction, String message);

	public void infoSenseBody(ViewQuality viewQuality, ViewAngle viewAngle, double stamina,
			double speed, double headAngle, int kickCount, int dashCount,
			int turnCount, int sayCount, int turnNeckCount);
}
