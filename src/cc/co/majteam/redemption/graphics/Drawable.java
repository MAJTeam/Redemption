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

import java.awt.Color;

import cc.co.majteam.redemption.graphics.shapes.Shape;

public class Drawable {
	private Color color;
	private Shape shape;
	private Coords offset;

	public Drawable(Color color, Shape shape) {
		this(color, shape, new Coords(0, 0));
	}
	
	public Drawable(Color color, Shape shape, int x, int y) {
		this(color, shape, new Coords(x, y));
	}

	public Drawable(Color color, Shape shape, Coords offset) {
		this.color = color;
		this.shape = shape;
		this.offset = offset;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public Coords getOffset() {
		return offset;
	}

	public void setOffset(Coords offset) {
		this.offset = offset;
	}
}
