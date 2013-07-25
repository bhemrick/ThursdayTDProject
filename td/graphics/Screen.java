/* 
 * File Name: Tile.java
 * Contributors:	Jonathan Bradley 	- 7/18/2013
 * 					Ryan Meier			- 
 * 					Ben Emrick			-
 * 
 * Purpose: This will handle what we see inside the frame.. WIP
 */
package td.graphics;

public class Screen {

	private int w, h;
	private int[] pixels;
	
	public Screen(int w, int h) {
		this.w = w;
		this.h = h;
		pixels = new int[w*h];
	}
	
	public int getWidth() {
		return w;
	}
	
	public int getHeight() {
		return h;
	}
	
	public int getPixels(int x) {
		return pixels[x];
	}
	
	public void render(int xa, int ya, int xb, int yb) {
//		for (int y = 0; y < yb; y++) {
//			for (int x = 0; x < xb; x++) {
//				int col = fuckit;
//			}
//		}
		
		
	}

}
