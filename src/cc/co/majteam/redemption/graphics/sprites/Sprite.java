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
