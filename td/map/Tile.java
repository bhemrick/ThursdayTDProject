/* 
 * File Name: Tile.java
 * Contributors:	Jonathan Bradley 	- 7/18/2013
 * 					Ryan Meier			- 
 * 					Ben Emrick			-
 * 
 * Purpose: This class creates a new game tile with a sprite
 */
package td.map;

import td.graphics.Sprite;
import java.awt.Image;

public class Tile {
	private Sprite sprite;
	private final int tileID;
//	private final int w, h;
	
	public Tile(String img, int ID) {
		this.tileID = ID;
		sprite = new Sprite(img, 51, 51);
	}
	
	public int getID() {
		return tileID;
	}
	
//	public int getHeight() {
//		return h;
//	}
//	
//	public int getWidth() {
//		return w;
//	}
	
	public Image getImage() {
		return sprite.getImage();
	}
	
}
