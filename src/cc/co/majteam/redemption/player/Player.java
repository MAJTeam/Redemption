package cc.co.majteam.redemption.player;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import cc.co.majteam.redemption.graphics.Coords;
import cc.co.majteam.redemption.graphics.sprites.Bullet;
import cc.co.majteam.redemption.graphics.sprites.PlayerSprite;
import cc.co.majteam.redemption.player.input.KeyConfig;

public class Player {
	public static final int DefaultPlayerSpeed = 5;

	private int id;
	private String name;
	private Color color;
	private int score;
	private int speed;
	private PlayerSprite sprite;
	private KeyConfig keyConfig;

	public Player(int id, PlayerDefaults defaults) {
		this.id = id;
		this.name = defaults.getName();
		this.color = defaults.getColor();
		this.score = 0;
		this.speed = DefaultPlayerSpeed;
		this.sprite = new PlayerSprite(defaults);
		this.keyConfig = defaults.getKeyDefaults().getKeyConfig();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public PlayerSprite getSprite() {
		return sprite;
	}

	public KeyConfig getKeyConfig() {
		return keyConfig;
	}

	public Coords getCoords() {
		return sprite.getCenter();
	}

	public void setCoords(Coords coords) {
		sprite.setCenter(coords);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Set<Bullet> fire() {
		Set<Bullet> bullets = new HashSet<Bullet>();
		Coords c = new Coords(getCoords());
		switch (sprite.getOrientation()) {
		case Down:
			// TODO: Externalize size
			c.setY(c.getY() + 5);
			break;
		case Left:
			c.setX(c.getX() - 5);
			break;
		case Right:
			c.setX(c.getX() + 5);
			break;
		case Up:
			c.setY(c.getY() - 5);
			break;
		}
		bullets.add(new Bullet(c, 10, sprite.getOrientation()));
		return bullets;
	}
}
