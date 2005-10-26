package atan.parser;

import atan.model.Controller;
import atan.model.Line;

class ObjNameLine implements ObjName {
	char qualifier;

	ObjNameLine(char qualifier) {
		this.qualifier = qualifier;
	}

	public void infoSeeFromEast(Controller c, double dist, double dir) {
		switch (qualifier) {
		case 't':
			c.infoSeeLine(Line.LINE_RIGHT, dist, dir);
			break;
		case 'b':
			c.infoSeeLine(Line.LINE_LEFT, dist, dir);
			break;
		case 'l':
			c.infoSeeLine(Line.LINE_OTHER, dist, dir);
			break;
		case 'r':
			c.infoSeeLine(Line.LINE_OWN, dist, dir);
			break;
		}
	}

	public void infoSeeFromWest(Controller c, double dist, double dir) {
		switch (qualifier) {
		case 't':
			c.infoSeeLine(Line.LINE_LEFT, dist, dir);
			break;
		case 'b':
			c.infoSeeLine(Line.LINE_RIGHT, dist, dir);
			break;
		case 'l':
			c.infoSeeLine(Line.LINE_OWN, dist, dir);
			break;
		case 'r':
			c.infoSeeLine(Line.LINE_OTHER, dist, dir);
			break;
		}
	}
}
