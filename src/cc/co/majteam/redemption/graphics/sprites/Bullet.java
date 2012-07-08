package cc.co.majteam.redemption.graphics.sprites;

import cc.co.majteam.redemption.graphics.Coords;
import cc.co.majteam.redemption.graphics.Drawable;
import cc.co.majteam.redemption.graphics.shapes.Circle;
import cc.co.majteam.redemption.player.Player;

public class Bullet extends MovingSprite {
	private Player owner;
	
	public Bullet(Player player, Coords center, int speed, Direction orientation) {
		super(center, speed, orientation);
		this.addDrawable(new Drawable(player.getColor(), new Circle(2), new Coords(-2, -2)));
		this.owner = player;
	}
	
	public Player getOwner() {
		return owner;
	}
}
