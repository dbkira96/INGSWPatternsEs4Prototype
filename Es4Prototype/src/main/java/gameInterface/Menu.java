package gameInterface;

import java.awt.Color;

import javax.swing.JPanel;

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
}
