package gameLogic;

import java.awt.EventQueue;
import java.util.ArrayList;


import gameInterface.MainWindow;
import gameInterface.Media;
import gameObjects.Building;
import gameObjects.BuildingId;

public class GameManager {

	private static GameManager instance=null;
	public static MainWindow window;
	public ArrayList<Building>placed;
	public PrototypesDispatcher dp;
	public Media media;
	public BuildingId toInsert;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new MainWindow();
					window.getFrame().setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		GameManager gm= GameManager.getInstance();
		gm.start();
	}
	
	private void start() {
		ArrayList<Building>l=dp.getAvaibleBuildings();
		for(int i=0;i<l.size();i++) {
			window.menu.addEntry(l.get(i));
		}
		
	}

	private GameManager() {
		media=Media.getInstance();
		dp=new PrototypesDispatcher();
		placed=new ArrayList<Building>();
		
		
	}
	public static GameManager getInstance() {
		if (instance==null)
			instance=new GameManager();
		return instance;
	}
	public BuildingId getToInsert() {
		// TODO Auto-generated method stub
		return toInsert;
	}
}
