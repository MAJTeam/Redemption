package cc.co.majteam.redemption.graphics;

import java.awt.Graphics2D;

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
			g2d.drawOval(center.getX(), center.getY(), circle.getRadius() * 2,
					circle.getRadius() * 2);
		case Line:
			Line line = (Line) shape;
			g2d.drawLine(center.getX() + line.getPoint1().getX(), center.getY()
					+ line.getPoint1().getY(), center.getX()
					+ line.getPoint2().getX(), center.getY()
					+ line.getPoint2().getY());
		default:
			System.err.println("Invalid shape in drawable! Skipped.");
		}
	}

	@Override
	public void commit() {
		this.gameWindow.draw();
		this.g2d = null;
	}

}
