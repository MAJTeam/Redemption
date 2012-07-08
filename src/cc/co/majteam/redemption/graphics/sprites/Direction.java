package cc.co.majteam.redemption.graphics.sprites;

public enum Direction {
	None, North, NorthEast, East, SouthEast, South, SouthWest, West, NorthWest;

	public static final Direction[][] matrix = new Direction[][] {
			{ NorthWest, North, NorthEast }, { West, None, East },
			{ SouthWest, South, SouthEast } };

	public static Direction get(int x, int y) {
		return matrix[y + 1][x + 1];
	}
}