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

import java.util.HashSet;
import java.util.Set;

import cc.co.majteam.redemption.graphics.Coords;
import cc.co.majteam.redemption.graphics.Drawable;

public abstract class Sprite {
	private Coords center;
	private Set<Drawable> drawables;

	public Sprite(int x, int y) {
		this(new Coords(x, y));
	}

	public Sprite(Coords center) {
		this.setCenter(center);
		this.drawables = new HashSet<Drawable>();
	}

	public Coords getCenter() {
		return center;
	}

	public void setCenter(Coords center) {
		this.center = center;
	}

	public void addDrawable(Drawable drawable) {
		drawables.add(drawable);
	}

	public void removeDrawable(Drawable drawable) {
		drawables.remove(drawable);
	}

	public Set<Drawable> getDrawables() {
		return drawables;
	}
}
