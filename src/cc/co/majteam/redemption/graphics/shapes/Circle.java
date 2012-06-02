package cc.co.majteam.redemption.graphics.shapes;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius) {
		super(ShapeType.Circle);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
