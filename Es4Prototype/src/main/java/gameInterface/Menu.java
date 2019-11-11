package gameInterface;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gameLogic.GameManager;
import gameObjects.Building;


public class Menu extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Menu() {
		initialize();
	}

	public void initialize() {
		setBackground(Color.GREEN);
		setBounds(0, 600, 600, 100);
	}
	public void addEntry(final Building b) {
		JLabel l=new JLabel();
		l.addMouseListener(new myMouseAdapter(b));
		l.setIcon(new ImageIcon(b.getImage().getScaledInstance(100, 100,Image.SCALE_FAST)));
		this.add(l);
		repaint();
	}
	class myMouseAdapter extends MouseAdapter{
		Building bu;
		public myMouseAdapter(Building b) {
			super();
			bu=b;
		}
		 @Override
        public void mousePressed(MouseEvent e) {
           GameManager.getInstance().toInsert=bu.getId();
        }
			
	}
	
}
