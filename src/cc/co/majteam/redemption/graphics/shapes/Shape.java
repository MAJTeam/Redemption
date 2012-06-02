package cc.co.majteam.redemption.graphics.shapes;

public abstract class Shape {
	
	private final ShapeType type;
	
	protected Shape(ShapeType type) {
		this.type = type;
	}

	public ShapeType getType() {
		return type;
	}
}
