package gameLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import gameObjects.Barracks;
import gameObjects.Building;
import gameObjects.BuildingId;
import gameObjects.Deposit;
import gameObjects.Hall1;
import gameObjects.Hall2;

public class PrototypesDispatcher {
	HashMap<BuildingId,Building> allBuildings;
	public PrototypesDispatcher(){
		allBuildings= new HashMap<BuildingId,Building>();
		allBuildings.put(BuildingId.Barracks, new Barracks());
		allBuildings.put(BuildingId.Hall_L1, new Hall1());
		allBuildings.put(BuildingId.Hall_L2, new Hall2());
		allBuildings.put(BuildingId.Deposit, new Deposit());
		
	}
	public ArrayList<Building> getAvaibleBuildings(){
		ArrayList<Building> r =new ArrayList<Building>();
		for(Map.Entry<BuildingId, Building> entry : allBuildings.entrySet()) {
		    
		    Building b = entry.getValue();
		    if (isAvaible(b))
		    	r.add(b);
		}
		return r;
	}
	private boolean isAvaible(Building b) {
		ArrayList<BuildingId>r= b.requirements();
		ArrayList<BuildingId>present = new ArrayList<BuildingId>();
		GameManager gm= GameManager.getInstance();
		for (int i=0;i<gm.placed.size();i++)
			present.add(gm.placed.get(i).getId());
		if (present.containsAll(r))
			return true;
		return false;
		
	}
	public Building Clone(BuildingId id) {
		// TODO Auto-generated method stub
		return allBuildings.get(id).Clone();
	}
}
