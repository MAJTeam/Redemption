package cc.co.majteam.redemption.entities;

import java.awt.Color;
import java.util.Set;

import cc.co.majteam.redemption.shapes.Coords;
import cc.co.majteam.redemption.shapes.Drawable;

public abstract class Sprite {	
	private Coords center;
	private Color color;
	private Set<Drawable> drawables;
	
	public Sprite(Color color, int x, int y) {
		this(color, new Coords(x, y));
	}
	
	public Sprite(Color color, Coords center) {
		this.color = color;
		this.setCenter(center);
	}

	public Coords getCenter() {
		return center;
	}

	public void setCenter(Coords center) {
		this.center = center;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
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
