package cc.co.majteam.redemption.player;

import java.awt.Color;

import cc.co.majteam.redemption.graphics.Coords;
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
}
