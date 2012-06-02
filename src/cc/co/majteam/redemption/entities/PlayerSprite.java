package cc.co.majteam.redemption.entities;

import java.awt.Color;

import cc.co.majteam.redemption.player.PlayerDefaults;
import cc.co.majteam.redemption.shapes.Circle;
import cc.co.majteam.redemption.shapes.Coords;
import cc.co.majteam.redemption.shapes.Drawable;

public class PlayerSprite extends MovingSprite {
	private Color color;

	public PlayerSprite(PlayerDefaults defaults) {
		// TODO: Change both the Coords and Orientation to get them from PlayerDefaults
		super(new Coords(5, 5), 0, Orientation.Right);
		this.color = defaults.getColor();
		this.addDrawable(new Drawable(this.color, new Circle(5)));
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
