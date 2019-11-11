package gameObjects;

import java.awt.Image;
import java.awt.Point;

public interface Building {
	Point getPos();
	Status getStatus();
	Image getImage();
	String getName();
}
