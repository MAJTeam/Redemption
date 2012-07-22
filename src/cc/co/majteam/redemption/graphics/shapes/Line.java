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

package cc.co.majteam.redemption.graphics.shapes;

import cc.co.majteam.redemption.graphics.Coords;

public class Line extends Shape {

	private Coords point1, point2;

	public Line(Coords point1, Coords point2) {
		super(ShapeType.Line);
		this.point1 = point1;
		this.point2 = point2;
	}

	public Line(int x1, int y1, int x2, int y2) {
		this(new Coords(x1, y1), new Coords(x2, y2));
	}

	public Coords getPoint1() {
		return point1;
	}

	public void setPoint1(Coords point1) {
		this.point1 = point1;
	}

	public Coords getPoint2() {
		return point2;
	}

	public void setPoint2(Coords point2) {
		this.point2 = point2;
	}
}
