package atan.model;

import org.apache.commons.lang.enums.Enum;

public class ViewAngle extends Enum {

	public static final ViewAngle NARROW = new ViewAngle("narrow");

	public static final ViewAngle NORMAL = new ViewAngle("normal");

	public static final ViewAngle WIDE = new ViewAngle("wide");

	public ViewAngle(String name) {
		super(name);
	}

}
