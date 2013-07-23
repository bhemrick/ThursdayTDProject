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
	
	public void render() {
		
	}

}
