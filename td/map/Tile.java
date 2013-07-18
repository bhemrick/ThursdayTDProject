package td.map;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tile {
	Image tileIMG;
	private int tileID, xWidth, yHeight;
	
	public Tile(String img, int ID) {
		tileID = ID;
		ImageIcon ii = new ImageIcon(this.getClass().getResource(img));
		tileIMG = ii.getImage();
		xWidth = tileIMG.getWidth(null);
		yHeight = tileIMG.getHeight(null);
	}
	
	public int getTileID() {
		return tileID;
	}
	
	public int getTileHeight() {
		return yHeight;
	}
	
	public int getTileWidth() {
		return xWidth;
	}
	
}
