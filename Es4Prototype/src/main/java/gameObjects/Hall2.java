package gameObjects;

import java.util.ArrayList;

public class Hall2 extends Building {

	@Override
	public ArrayList<BuildingId> requirements() {
		// TODO Auto-generated method stub
		return new  ArrayList<BuildingId>() ;
	}
	public Hall2() {
		super();
			id=BuildingId.Hall_L2;
	}

	@Override
	public Hall2 Clone() {
		// TODO Auto-generated method stub
		return new Hall2();
	}

}
