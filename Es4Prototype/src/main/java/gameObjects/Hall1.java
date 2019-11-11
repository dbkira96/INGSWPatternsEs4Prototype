package gameObjects;

import java.util.ArrayList;

public class Hall1 extends Building {
	public Hall1() {
		super();
		id=BuildingId.Hall_L1;
		
	}
	public Hall1 Clone() {
		return new Hall1();
		
	}
	@Override
	public ArrayList<BuildingId> requirements() {
		// TODO Auto-generated method stub
		return new ArrayList<BuildingId>() ;
	}

}
