package td.map;

import graphics.Sprite;
import java.awt.Image;

public class Tile {
	private Sprite sprite;
	private int tileID, w, h;
	
	public Tile(String img, int ID) {
		sprite = new Sprite(img);
		w = sprite.getWidth();
		h = sprite.getHeight();
	}
	
	public int getTileID() {
		return tileID;
	}
	
	public int getTileHeight() {
		return h;
	}
	
	public int getTileWidth() {
		return w;
	}
	
	public Image getTileImage() {
		return sprite.getSprite();
	}
	
}
