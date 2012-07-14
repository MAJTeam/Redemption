package cc.co.majteam.redemption.graphics;

import cc.co.majteam.redemption.graphics.sprites.Direction;

public class Coords {
	public static Coords midpoint(Coords p1, Coords p2) {
		return midpoint((int) p1.x, (int) p1.y, (int) p2.x, (int) p2.y);
	}
	
	public static Coords midpoint(int x1, int y1, int x2, int y2) {
		return new Coords((x2 - x1) / 2 + x1, (y2 - y1) / 2 + y1);
	}

	private double x, y;

	public Coords(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Coords(Coords coords) {
		this.x = coords.getX();
		this.y = coords.getY();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public boolean isBetween(Coords p1, Coords p2) {
		return isBetween(p1.x, p1.y, p2.x, p2.y);
	}

	public boolean isBetween(double x1, double y1, double x2, double y2) {
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
			x += dist / 2 * Math.sqrt(2);
			y -= dist / 2 * Math.sqrt(2);
			break;
		case NorthWest:
			x -= dist / 2 * Math.sqrt(2);
			y -= dist / 2 * Math.sqrt(2);
			break;
		case SouthEast:
			x += dist / 2 * Math.sqrt(2);
			y += dist / 2 * Math.sqrt(2);
			break;
		case SouthWest:
			x -= dist / 2 * Math.sqrt(2);
			y += dist / 2 * Math.sqrt(2);
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
