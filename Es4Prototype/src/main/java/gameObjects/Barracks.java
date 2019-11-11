package gameObjects;

import java.util.ArrayList;

public class Barracks extends Building {
	public Barracks() {
		super();
		id=BuildingId.Barracks;
	}
	public Barracks Clone() {
		return new Barracks();
		
		
	}
	@Override
	public ArrayList<BuildingId> requirements() {
		ArrayList<BuildingId> r = new ArrayList<BuildingId>();
		r.add(BuildingId.Hall_L1);
		return r;
	}

}
