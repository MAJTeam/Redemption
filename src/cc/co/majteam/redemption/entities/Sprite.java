package cc.co.majteam.redemption.entities;

import java.awt.Color;
import java.util.Set;

import cc.co.majteam.redemption.shapes.Drawable;

public abstract class Sprite {	
	private int x, y;
	private Color color;
	private Set<Drawable> drawables;
	
	public Sprite(Color color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
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
