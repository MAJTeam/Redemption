package cc.co.majteam.redemption.graphics.sprites;

import java.awt.Color;

import cc.co.majteam.redemption.graphics.Coords;
import cc.co.majteam.redemption.graphics.Drawable;
import cc.co.majteam.redemption.graphics.shapes.Circle;

public class Bullet extends MovingSprite {

	public Bullet(Coords center, int speed, Direction orientation) {
		super(center, speed, orientation);
		this.addDrawable(new Drawable(Color.BLUE, new Circle(5)));
	}

}
