package graphics;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	Image spriteIMG;
	String resourceLocation;
	int spriteWidth, spriteHeight, x, y;
	
	public Sprite(String imgString) {
		try {
			spriteIMG = ImageIO.read(this.getClass().getResource(imgString));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		spriteWidth = spriteIMG.getWidth(null);
		spriteHeight = spriteIMG.getHeight(null);
	}
	
	public int getHeight() {
		return spriteHeight;
	}
	
	public int getWidth() {
		return spriteWidth;
	}
	
	public Image getSprite() {
		return spriteIMG;
	}
}
