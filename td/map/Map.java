package td.map;



public class Map {
	
	public Map(int width, int height) {
		Tile mapGrid[][] = new Tile[height][width];
		int TileID = 0;
		for (int i = 0; i < width; i++) {
			for (int k = 0; k < height; k++)	 {
				mapGrid[i][k] = new Tile(
						"../artAssets/mapTile_Grid.png", 
						TileID++); 
			}
		}
		
		
	}
	
	public void tick() {
		
	}
	
	public void render() {
		
	}
}
