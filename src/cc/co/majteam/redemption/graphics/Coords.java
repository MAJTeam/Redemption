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
	
	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}

}
