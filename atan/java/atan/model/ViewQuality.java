package atan.model;

import org.apache.commons.lang.enums.Enum;

public class ViewQuality extends Enum {

	public static final ViewQuality HIGH = new ViewQuality("high");

	public static final ViewQuality LOW = new ViewQuality("low");

	public ViewQuality(String name) {
		super(name);
	}

}
