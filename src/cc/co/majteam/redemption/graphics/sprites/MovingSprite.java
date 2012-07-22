/*
 * Copyright 2012, Jonathan Rouillard
 * 
 * This file is part of Project Redemption.
 * 
 * Project Redemption is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Project Redemption is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Project Redemption.  If not, see <http://www.gnu.org/licenses/>.
 */

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
