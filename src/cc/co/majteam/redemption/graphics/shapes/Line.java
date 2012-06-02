package cc.co.majteam.redemption.graphics.shapes;

import cc.co.majteam.redemption.graphics.Coords;

public class Line implements Shape {

	private Coords point1, point2;

	public Line(Coords point1, Coords point2) {
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
