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

import java.awt.Color;

import cc.co.majteam.redemption.graphics.Coords;
import cc.co.majteam.redemption.graphics.Drawable;
import cc.co.majteam.redemption.graphics.shapes.Circle;
import cc.co.majteam.redemption.player.PlayerDefaults;

public class PlayerSprite extends MovingSprite {
	private Color color;

	public PlayerSprite(PlayerDefaults defaults) {
		// TODO: Change both the Coords and Orientation to get them from PlayerDefaults
		super(new Coords(0, 0), 5, Direction.East);
		this.color = defaults.getColor();
		this.addDrawable(new Drawable(this.color, new Circle(10), new Coords(-10, -10)));
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
