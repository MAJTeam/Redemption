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
		super(new Coords(5, 5), 0, Direction.Right);
		this.color = defaults.getColor();
		this.addDrawable(new Drawable(this.color, new Circle(10)));
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
