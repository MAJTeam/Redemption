package cc.co.majteam.redemption.shapes;

public class Circle implements Shape {
	private Coords center;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.center = new Coords(x, y);
		this.radius = radius;
	}
	
	public Circle(Coords center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Coords getCenter() {
		return center;
	}

	public void setCenter(Coords center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
