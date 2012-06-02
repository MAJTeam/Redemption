package cc.co.majteam.redemption.shapes;

import java.awt.Color;
import java.awt.Shape;

public abstract class Drawable {
	private Color color;
	private Shape shape;

	public Drawable(Color color, Shape shape) {
		this.color = color;
		this.setShape(shape);
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
}
