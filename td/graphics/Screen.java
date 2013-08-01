/* 
 * File Name: Tile.java
 * Contributors:	Jonathan Bradley 	- 7/18/2013
 * 					Ryan Meier			- 
 * 					Ben Emrick			-
 * 
 * Purpose: This will handle what we see inside the frame.. WIP
 */
package td.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import td.Game;

public class Screen extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6468166128684414161L;
	private Game game;
	
	public Screen(Game gme) {
		game = gme;
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);
		//setPreferredSize(new Dimension(game.map.getWidth(), game.map.getHeight()));
	}
	
	public void addNotify() {
		super.addNotify();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.drawImage(game.map.getMapImage(), null, 0, 0);
		
		//Toolkit.getDefaultToolkit().sync();
	    //g2d.dispose();
	    
	}
	
	public void render() {
		repaint();
	}

}
