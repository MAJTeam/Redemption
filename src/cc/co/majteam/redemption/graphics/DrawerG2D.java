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

import java.awt.Graphics2D;
import java.util.Set;

import roujo.lib.gui.windows.GraphicWindow;
import cc.co.majteam.redemption.graphics.shapes.Circle;
import cc.co.majteam.redemption.graphics.shapes.Line;
import cc.co.majteam.redemption.graphics.shapes.Shape;
import cc.co.majteam.redemption.handlers.GraphicsHandler;

public class DrawerG2D implements Drawer {
	private GraphicWindow gameWindow;
	private Graphics2D g2d;

	public DrawerG2D() {
	}

	@Override
	public void init() {
		this.gameWindow = GraphicsHandler.getInstance().getGameWindow();
		this.g2d = this.gameWindow.getG2D();
	}

	@Override
	public void draw(Drawable drawable, Coords origin) {
		// TODO: Actually draw stuff here.
		Shape shape = drawable.getShape();
		Coords center = new Coords(origin.getX() + drawable.getOffset().getX(),
				origin.getY() + drawable.getOffset().getY());

		g2d.setColor(drawable.getColor());
		switch (shape.getType()) {
		case Circle:
			Circle circle = (Circle) shape;
			g2d.drawOval((int) center.getX(), (int) center.getY(),
					circle.getRadius() * 2, circle.getRadius() * 2);
			break;
		case Line:
			Line line = (Line) shape;
			g2d.drawLine((int) (center.getX() + line.getPoint1().getX()),
					(int) (center.getY() + line.getPoint1().getY()),
					(int) (center.getX() + line.getPoint2().getX()),
					(int) (center.getY() + line.getPoint2().getY()));
			break;
		default:
			System.err.println("Invalid shape in drawable! Skipped.");
		}
	}

	@Override
	public void draw(Set<Drawable> drawables, Coords origin) {
		for (Drawable d : drawables) {
			draw(d, origin);
		}
	}

	@Override
	public void commit() {
		this.gameWindow.draw();
		this.g2d = null;
	}

}
