package cc.co.majteam.redemption.player;

import java.awt.Color;

public class Player {
	private int id;
	private String name;
	private Color color;
	private int score;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
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
}
