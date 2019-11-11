package gameLogic;

import java.util.HashMap;

import gameObjects.Building;

public class GameManager {

	private static GameManager gm;
	
	HashMap<String,Boolean> avaiableBuildings;
	
	private GameManager() {
		
	}
	public static GameManager getInstance() {
		if (gm==null)
			gm=new GameManager();
		return gm;
	}
	public Building getToInsert() {
		// TODO Auto-generated method stub
		return null;
	}
}
