/* 
 * File Name: Tile.java
 * Contributors:	Jonathan Bradley 	- 7/18/2013
 * 					Ryan Meier			- 
 * 					Ben Emrick			-
 * 
 * Purpose: This class creates a new sprite
 * 
 * Future Goals: Create spritesheet class to reduce number of image files
 * 		and re-work class to incorporate this
 */
package td.graphics;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	BufferedImage spriteIMG;
	String resourceLocation;
	int spriteWidth, spriteHeight, x, y;
	
	public Sprite(String imgString, int w, int h) {
		this.resourceLocation = imgString;
		File file = new File(resourceLocation);
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			try {
				this.spriteIMG = ImageIO.read(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.spriteWidth = w;
		this.spriteHeight = h;
	}
	
	public int getHeight() {
		return spriteHeight;
	}
	
	public int getWidth() {
		return spriteWidth;
	}
	
	public BufferedImage getImage() {
		return spriteIMG;
	}
}
