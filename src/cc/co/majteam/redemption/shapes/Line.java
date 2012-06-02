package cc.co.majteam.redemption.shapes;

public class Line implements Shape {

	private Point point1, point2;

	public Line(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}

	public Line(int x1, int y1, int x2, int y2) {
		this.point1 = new Point(x1, y1);
		this.point2 = new Point(x2, y2);
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
}
