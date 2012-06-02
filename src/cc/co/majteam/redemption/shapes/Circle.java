package cc.co.majteam.redemption.shapes;

public class Circle implements Shape {
	private Point center;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.center = new Point(x, y);
		this.radius = radius;
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
