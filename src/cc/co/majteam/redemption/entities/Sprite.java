package cc.co.majteam.redemption.entities;

import java.util.Set;

import cc.co.majteam.redemption.shapes.Coords;
import cc.co.majteam.redemption.shapes.Drawable;

public abstract class Sprite {
	private Coords center;
	private Set<Drawable> drawables;

	public Sprite(int x, int y) {
		this(new Coords(x, y));
	}

	public Sprite(Coords center) {
		this.setCenter(center);
	}

	public Coords getCenter() {
		return center;
	}

	public void setCenter(Coords center) {
		this.center = center;
	}

	public void addDrawable(Drawable primitive) {
		drawables.add(primitive);
	}

	public void removeDrawable(Drawable primitive) {
		drawables.remove(primitive);
	}

	public Set<Drawable> getDrawables() {
		return drawables;
	}
}
