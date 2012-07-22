/*
 * Copyright 2012, Jonathan Rouillard
 * 
 * This file is part of Project Redemption.
 * 
 * Project Redemption is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Project Redemption is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Project Redemption.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.co.majteam.redemption.graphics;

import cc.co.majteam.redemption.graphics.sprites.Direction;

public class Coords {
	public static Coords midpoint(Coords p1, Coords p2) {
		return midpoint(p1.x, p1.y, p2.x, p2.y);
	}
	
	public static Coords midpoint(double x1, double y1, double x2, double y2) {
		return midpoint((int) x1, (int) y1, (int) x2, (int) y2);
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
