package atan.model;

import org.apache.commons.lang.enums.Enum;

public class Flag extends Enum {

	  public static final Flag FLAG_CENTER = new Flag("center");
	  public static final Flag FLAG_LEFT = new Flag("left");
	  public static final Flag FLAG_RIGHT = new Flag("right");
	  public static final Flag FLAG_OWN_50 = new Flag("own50");
	  public static final Flag FLAG_OWN_40 = new Flag("own40");
	  public static final Flag FLAG_OWN_30 = new Flag("own30");
	  public static final Flag FLAG_OWN_20 = new Flag("own20");
	  public static final Flag FLAG_OWN_10 = new Flag("own10");
	  public static final Flag FLAG_OTHER_10 = new Flag("other10");
	  public static final Flag FLAG_OTHER_20 = new Flag("other20");
	  public static final Flag FLAG_OTHER_30 = new Flag("other30");
	  public static final Flag FLAG_OTHER_40 = new Flag("other40");
	  public static final Flag FLAG_OTHER_50 = new Flag("other50");
	  public static final Flag FLAG_LEFT_10 = new Flag("left10");
	  public static final Flag FLAG_LEFT_20 = new Flag("left20");
	  public static final Flag FLAG_LEFT_30 = new Flag("left30");
	  public static final Flag FLAG_RIGHT_10 = new Flag("right10");
	  public static final Flag FLAG_RIGHT_20 = new Flag("right20");
	  public static final Flag FLAG_RIGHT_30 = new Flag("right30");

	
	public Flag(String name) {
		super(name);
	}

}
