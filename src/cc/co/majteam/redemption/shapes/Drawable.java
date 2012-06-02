package cc.co.majteam.redemption.shapes;

import java.awt.Color;

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
