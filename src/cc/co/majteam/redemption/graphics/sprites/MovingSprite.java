package cc.co.majteam.redemption.graphics.sprites;

import cc.co.majteam.redemption.graphics.Coords;

public abstract class MovingSprite extends Sprite {
	private int speed;
	private Direction orientation;

	public MovingSprite(Coords center, int speed, Direction orientation) {
		super(center);
		this.speed = speed;
		this.orientation = orientation;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Direction getOrientation() {
		return orientation;
	}

	public void setOrientation(Direction orientation) {
		this.orientation = orientation;
	}
}
