package atan.model;

/**
 * Interface that has to be implemented in order to control players. The methods
 * are run in a cycle whenever a see command arrives from sserver. At first preInfo()
 * is invoked. then the info*() methods are called according to what kind of objects
 * are currently seen or what other commands where received from the server. At last
 * postInfo() is called. All objects are relative to the current side of the controller.
 */

public interface Controller {

  public void preInfo ();
  public void postInfo ();

  public Player getPlayer ();
  public void setPlayer (Player c);

  public static final int FLAG_CENTER = 1000;
  public static final int FLAG_OWN = 1001;
  public static final int FLAG_OTHER = 1002;
  public static final int FLAG_LEFT = 1003;
  public static final int FLAG_RIGHT = 1004;
  public static final int FLAG_OWN_50 = 1010;
  public static final int FLAG_OWN_40 = 1011;
  public static final int FLAG_OWN_30 = 1012;
  public static final int FLAG_OWN_20 = 1013;
  public static final int FLAG_OWN_10 = 1014;
  public static final int FLAG_OTHER_10 = 1020;
  public static final int FLAG_OTHER_20 = 1021;
  public static final int FLAG_OTHER_30 = 1022;
  public static final int FLAG_OTHER_40 = 1023;
  public static final int FLAG_OTHER_50 = 1024;
  public static final int FLAG_LEFT_10 = 1030;
  public static final int FLAG_LEFT_20 = 1031;
  public static final int FLAG_LEFT_30 = 1032;
  public static final int FLAG_RIGHT_10 = 1040;
  public static final int FLAG_RIGHT_20 = 1041;
  public static final int FLAG_RIGHT_30 = 1042;
  /**
  * @param id possible values: FLAG_OWN_50, FLAG_OWN_40, FLAG_OWN_30, FLAG_OWN_20, FLAG_OWN_10,
  * FLAG_OTHER_10, FLAG_OTHER_20, FLAG_OTHER_30, FLAG_OTHER_40, FLAG_OTHER_50
  */
  public void infoSeeFlagRight (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_OWN_50, FLAG_OWN_40, FLAG_OWN_30, FLAG_OWN_20, FLAG_OWN_10,
  * FLAG_OTHER_10, FLAG_OTHER_20, FLAG_OTHER_30, FLAG_OTHER_40, FLAG_OTHER_50
  */
  public void infoSeeFlagLeft (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT_10, FLAG_LEFT_20, FLAG_LEFT_30, FLAG_RIGHT_10,
  * FLAG_RIGHT_20, FLAG_RIGHT_30
  */
  public void infoSeeFlagOwn (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT_10, FLAG_LEFT_20, FLAG_LEFT_30, FLAG_RIGHT_10,
  * FLAG_RIGHT_20, FLAG_RIGHT_30
  */
  public void infoSeeFlagOther (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT, FLAG_CENTER, FLAG_RIGHT
  */
  public void infoSeeFlagCenter (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT, FLAG_RIGHT
  */
  public void infoSeeFlagCornerOwn (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT, FLAG_RIGHT
  */
  public void infoSeeFlagCornerOther (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT, FLAG_CENTER, FLAG_RIGHT
  */
  public void infoSeeFlagPenaltyOwn (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT, FLAG_CENTER, FLAG_RIGHT
  */
  public void infoSeeFlagPenaltyOther (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT, FLAG_CENTER, FLAG_RIGHT
  */
  public void infoSeeFlagGoalOwn (int id, double distance, double direction);
  /**
  * @param id possible values: FLAG_LEFT, FLAG_CENTER, FLAG_RIGHT
  */
  public void infoSeeFlagGoalOther (int id, double distance, double direction);

  public static final int LINE_CENTER = 2000;
  public static final int LINE_OWN = 2001;
  public static final int LINE_OTHER = 2002;
  public static final int LINE_LEFT = 2003;
  public static final int LINE_RIGHT = 2004;

  /**
  * @param id possible values: LINE_CENTER, LINE_OWN, LINE_OTHER, LINE_LEFT, LINE_RIGHT
  */
  public void infoSeeLine (int id, double distance, double direction);

  public void infoSeePlayerOther (int number, double distance, double direction);
  public void infoSeePlayerOwn (int number, double distance, double direction);

  public void infoSeeBall (double distance, double direction);

  public static final int REFREE_MESSAGE_FOUL_OWN = 3030;
  public static final int REFREE_MESSAGE_FOUL_OTHER = 3040;
  public static final int REFREE_MESSAGE_HALF_TIME = 3050;
  public static final int REFREE_MESSAGE_TIME_UP = 3060;
  public static final int REFREE_MESSAGE_TIME_UP_WITHOUT_A_TEAM = 3070;
  public static final int REFREE_MESSAGE_TIME_EXTENDED = 3080;
  public static final int REFREE_MESSAGE_DROP_BALL = 3085;
  public static final int REFREE_MESSAGE_OFFSIDE_OWN = 3086;
  public static final int REFREE_MESSAGE_OFFSIDE_OTHER = 3087;
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

  /**
  * @param refereeMessage possible values: REFREE_MESSAGE_FOUL_OWN, REFREE_MESSAGE_FOUL_OTHER,
  * REFREE_MESSAGE_HALF_TIME, REFREE_MESSAGE_TIME_UP, REFREE_MESSAGE_TIME_UP_WITHOUT_A_TEAM,
  * REFREE_MESSAGE_TIME_EXTENDED, REFREE_MESSAGE_DROP_BALL, REFREE_MESSAGE_OFFSIDE_OWN,
  * REFREE_MESSAGE_OFFSIDE_OTHER
  */
  public void infoHearReferee (int refereeMessage);
  /**
  * @param playMode possible values: PLAY_MODE_BEFORE_KICK_OFF, PLAY_MODE_TIME_OVER, PLAY_MODE_PLAY_ON,
  * PLAY_MODE_KICK_OFF_OWN, PLAY_MODE_KICK_OFF_OTHER, PLAY_MODE_FREE_KICK_OWN,
  * PLAY_MODE_FREE_KICK_OTHER, PLAY_MODE_GOAL_KICK_OWN, PLAY_MODE_CORNER_KICK_OTHER,
  * PLAY_MODE_GOAL_KICK_OWN, PLAY_MODE_GOAL_KICK_OTHER, PLAY_MODE_GOAL_OWN,
  * PLAY_MODE_GOAL_OTHER
  */
  public void infoHearPlayMode (int playMode);
  public void infoHear (double direction, String message);

  public static final int VIEW_QUALITY_HIGH = 0;
  public static final int VIEW_QUALITY_LOW = 1;
  public static final int VIEW_ANGLE_NARROW = 2;
  public static final int VIEW_ANGLE_NORMAL = 3;
  public static final int VIEW_ANGLE_WIDE = 4;

  /**
  * @param viewQuality possible values: VIEW_QUALITY_HIGH, VIEW_QUALITY_LOW<br>
  * @param viewAngle possible values: VIEW_ANGLE_NARROW, VIEW_ANGLE_NORMAL, VIEW_ANGLE_WIDE
  */
  public void infoSenseBody
    (int viewQuality, int viewAngle,
    double stamina, double speed, double headAngle, int kickCount,
    int dashCount, int turnCount, int sayCount, int turnNeckCount);
}
/**
 * Empty Controller

  public void preInfo (){}
  public void postInfo (){}
  public Player getPlayer (){}
  public void setPlayer (Player c){}
  public void infoSeeFlagRight (int id, double distance, double direction){}
  public void infoSeeFlagLeft (int id, double distance, double direction){}
  public void infoSeeFlagOwn (int id, double distance, double direction){}
  public void infoSeeFlagOther (int id, double distance, double direction){}
  public void infoSeeFlagCenter (int id, double distance, double direction){}
  public void infoSeeFlagCornerOwn (int id, double distance, double direction){}
  public void infoSeeFlagCornerOther (int id, double distance, double direction){}
  public void infoSeeFlagPenaltyOwn (int id, double distance, double direction){}
  public void infoSeeFlagPenaltyOther (int id, double distance, double direction){}
  public void infoSeeFlagGoalOwn (int id, double distance, double direction){}
  public void infoSeeFlagGoalOther (int id, double distance, double direction){}
  public void infoSeeLine (int id, double distance, double direction){}
  public void infoSeePlayerOther (int number, double distance, double direction){}
  public void infoSeePlayerOwn (int number, double distance, double direction){}
  public void infoSeeBall (double distance, double direction){}
  public void infoHearReferee (int refereeMessage){}
  public void infoHearPlayMode (int playMode){}
  public void infoHear (double direction, String message){}
  public void infoSenseBody
    (int viewQuality, int viewAngle,
    double stamina, double speed, double headAngle, int kickCount,
    int dashCount, int turnCount, int sayCount, int turnNeckCount){}

*/
