package cc.co.majteam.redemption.graphics;

import cc.co.majteam.redemption.graphics.sprites.Direction;

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
	
	public void move(Direction direction, int dist) {
		switch (direction) {
		case South:
			y += dist;
			break;
		case West:
			x -= dist;
			break;
		case East:
			x += dist;
			break;
		case North:
			y -= dist;
			break;
		case NorthEast:
			x += dist/2 * Math.sqrt(2);
			y -= dist/2 * Math.sqrt(2);
			break;
		case NorthWest:
			x -= dist/2 * Math.sqrt(2);
			y -= dist/2 * Math.sqrt(2);
			break;
		case SouthEast:
			x += dist/2 * Math.sqrt(2);
			y += dist/2 * Math.sqrt(2);
			break;
		case SouthWest:
			x -= dist/2 * Math.sqrt(2);
			y += dist/2 * Math.sqrt(2);
			break;
		default:
			System.out.println("Invalid Direction @ Coords.move()");
			break;
		}
	}
	
	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}

}
