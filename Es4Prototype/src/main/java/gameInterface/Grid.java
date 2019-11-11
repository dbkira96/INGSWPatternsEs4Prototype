package gameInterface;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gameLogic.GameManager;
import gameObjects.Building;

public class Grid extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Grid() {
		super();
		initialize();
	}
	private void initialize() {
		setBounds(0, 0, 600, 600);
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				GameManager gm = GameManager.getInstance();
				Building ts = gm.dp.Clone(gm.toInsert);
				if(ts!=null) {
					JLabel lbl = new JLabel();
					lbl.setIcon(new ImageIcon(ts.getImage()));
					lbl.setBounds(e.getX()-(e.getX()%100), e.getY()-(e.getY()%100), 100, 100);
					add(lbl);
					repaint();
				}
				
			}
			
		});
	}

}
