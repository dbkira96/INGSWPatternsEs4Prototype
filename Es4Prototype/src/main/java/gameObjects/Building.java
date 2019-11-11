package gameObjects;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

import gameInterface.Media;

public abstract class Building implements Cloneable{

	Point pos;
	Status state=Status.PREVIEW;
	BuildingId id;
	
	public Point getPos() {
		return pos;
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}

	public void setState(Status state) {
		this.state = state;
	}

	public Status getState() {
		return state;
	}

	public Image getImage() {
		Image i=Media.getInstance().getImage(id, state);
		return i;
	}

	public abstract ArrayList<BuildingId> requirements();
	public abstract Building Clone();
	public BuildingId getId() {
		return id;
	}

}
