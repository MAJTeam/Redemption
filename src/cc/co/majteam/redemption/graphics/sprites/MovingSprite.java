package cc.co.majteam.redemption.graphics.sprites;

import cc.co.majteam.redemption.graphics.Coords;

public abstract class MovingSprite extends Sprite {
	private int speed;
	private Direction direction;

	public MovingSprite(Coords center, int speed, Direction orientation) {
		super(center);
		this.speed = speed;
		this.direction = orientation;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Direction getOrientation() {
		return direction;
	}

	public void setOrientation(Direction orientation) {
		this.direction = orientation;
	}
	
	public void move() {
		move(direction, speed);
	}
	
	public void move(Direction direction) {
		move(direction, speed);
	}
	
	public void move(int speed) {
		move(direction, speed);
	}
	
	public void move(Direction direction, int speed) {
		Coords c = getCenter();
		this.direction = direction;
		c.move(direction, speed);
	}
}
