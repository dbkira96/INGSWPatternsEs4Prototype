package gameInterface;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


import gameObjects.BuildingId;
import gameObjects.Status;

public class Media {
	
	private static Media instance;
	public static Media getInstance(){
		if (instance==null)
			instance=new Media();
		return instance;
	}
	private SpriteSheet HallSheet;
	private SpriteSheet buildingsSheet;
	private Media() {
		initialize();
	}
	private void initialize() {
		BufferedImage img=null;
		try {
			img = ImageIO.read(new File(System.getProperty("user.dir")+"\\src\\main\\resources\\"+"HumanBuildings.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		HallSheet =new SpriteSheet(img,0, 0, 1, 1, new Point(128,128));
		buildingsSheet=new SpriteSheet(img, 0, 256, 0, 0,new Point(100,100));
	}
	public BufferedImage getImage(BuildingId b,Status s) {
		switch (b) {
		case Barracks:
				return buildingsSheet.getImageFor(new Point(4,3));
		case Deposit:
				return buildingsSheet.getImageFor(new Point(2,1));
		case Hall_L1:
			return HallSheet.getImageFor(new Point(3,1));
		case Hall_L2:
			return HallSheet.getImageFor(new Point(1,1));
		default:
			break;}
		return buildingsSheet.getImageFor(new Point(6,3));
	}
}
