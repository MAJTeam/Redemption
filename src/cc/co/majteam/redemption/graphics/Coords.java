package cc.co.majteam.redemption.graphics;

public class Coords {
	
	private int x, y;

	public Coords(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Coords(Coords coords) {
		this.x = coords.getX();
		this.y = coords.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isBetween(Coords p1, Coords p2) {
		return isBetween(p1.x, p1.y, p2.x, p2.y);
	}
	
	public boolean isBetween(int x1, int y1, int x2, int y2) {
		return x > x1 && y > y1 && x < x2 && y < y2;
	}
	
	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}

}
