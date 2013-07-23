/* 
 * File Name: Map.java
 * Contributors:	Jonathan Bradley 	- 7/18/2013
 * 					Ryan Meier			- 
 * 					Ben Emrick			-
 * 
 * Purpose: This class creates a map grid to keep track of each game tile
 * 
 * Future Goals: change constructor to read-in a text file for different
 * 		levels once we have the different types of tiles developed
 */
package td.map;

public class Map {
	//private boolean hasChanged;
	private int mapWidth, mapHeight;
	private Tile mapGrid[][];
	private int TileID;
	
	public Map(int width, int height) {
		Tile mapGrid[][] = new Tile[height][width];
		TileID = 0;
		for (int i = 0; i < width; i++) {
			for (int k = 0; k < height; k++)	 {
				mapGrid[i][k] = new Tile(
						"artAssets/mapTile_Grid.png", 
						TileID++);
			}
		}
		//hasChanged = true;
				
	}
	
	public Map(Map m) {
		this.mapGrid = m.getMap();
//		hasChanged = true;
	}
	
	public int getHeight() {
		return mapHeight;
	}
	
	public int getWidth() {
		return mapWidth;
	}
	
	public void tick() {
		
	}
	
//	public boolean hasChanged() {
//		return hasChanged;
//	}
	
	public Tile[][] getMap() {
		return mapGrid;
	}
	
//	public Tile[][] getNewMap() {
//		hasChanged = false;
//		return mapGrid;
//	}
	
	public void changeTile(String img, int ID){
		// use black magic to find the location in the grid
		mapGrid	[(int)(Math.floor(ID/mapWidth))]
				[(ID % mapWidth)] 
			    = new Tile(img, ID);
//		hasChanged = true;
	}
}
