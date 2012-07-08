package cc.co.majteam.redemption.player;

import java.awt.Color;

import cc.co.majteam.redemption.graphics.sprites.PlayerSprite;

public class Player {
	private int id;
	private String name;
	private Color color;
	private int score;
	private PlayerSprite sprite;
	
	public Player(int id, PlayerDefaults defaults) {
		this.id = id;
		this.name = defaults.getName();
		this.color = defaults.getColor();
		this.score = 0;
		this.sprite = new PlayerSprite(defaults);
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
}
