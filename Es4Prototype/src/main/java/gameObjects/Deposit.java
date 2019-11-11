package gameObjects;

import java.util.ArrayList;

public class Deposit extends Building {
	public Deposit() {
		super();
		id=BuildingId.Barracks;
	}
	public Deposit Clone() {
		return new Deposit();
	}
	@Override
	public ArrayList<BuildingId> requirements() {
		ArrayList<BuildingId> r = new ArrayList<BuildingId>();
		r.add(BuildingId.Hall_L1);
		return r;
	}	
	
}
