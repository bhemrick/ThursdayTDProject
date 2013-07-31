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
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JPanel;

import td.Game;
import td.map.Tile;

public class Screen extends JPanel {

	private static final long serialVersionUID = 1L;
	private int w, h;
	//private int[] pixels;
	private Game game;
	
	public Screen(int w, int h, Game gme) {
		this.w = w;
		this.h = h;
		this.game = gme;
		//pixels = new int[w*h];
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);
		setPreferredSize(new Dimension(game.map.getWidth(), game.map.getHeight()));
	}
	
//	public int getWidth() {
//		return w;
//	}
//	
//	public int getHeight() {
//		return h;
//	}
	
//	public int getPixels(int x) {
//		return pixels[x];
//	}
	
	public void renderMap(Graphics2D g2d) {
		for (int i = 0; i < game.map.getHeight(); i++) {
			for (int k = 0; k < game.map.getWidth(); k++) {
				Tile temp = game.map.getTile(i, k);
				g2d.drawImage(temp.getImage(), 
						    i * temp.getWidth(), 
						    k * temp.getHeight(), 
						    this);
			}
		}
	}
	
	public void renderTowers(Graphics2D g2d) {
		
	}
	
	public void renderMobs(Graphics2D g2d) {
		
	}
	
	public void addNotify() {
		super.addNotify();
//		init();
//		thread = new Thread(this);
//		thread.start();
	}
	
	@Override
	public void paintComponent(Graphics g) {
//		System.out.println("Paint was called!");
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLACK);
//		g.setColor(Color.BLACK);
//		g.fillRect(0, 0, game.map.getWidth(), game.map.getHeight());
		
		renderMap(g2d);
		renderTowers(g2d);
		renderMobs(g2d);
		
		Toolkit.getDefaultToolkit().sync();
	    g2d.dispose();
		
	}
	
	public void render() {
		//revalidate();
		repaint();
	}

}
