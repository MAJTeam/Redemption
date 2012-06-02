package cc.co.majteam.redemption.entities;

import java.awt.Color;
import java.util.Set;

import cc.co.majteam.redemption.shapes.Drawable;

public abstract class Sprite {	
	private int x, y, width, height;
	private Color color;
	private Set<Drawable> drawables;
	
	public Sprite(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
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
