package cc.co.majteam.redemption.player;

import java.awt.Color;

public enum PlayerDefaults {
	Player1("Player 1", Color.CYAN),

	Player2("Player 2", Color.RED),

	Player3("Player 3", Color.YELLOW),
	
	Player4("Player 4", Color.GREEN);

	private final String name;
	private final Color color;

	private PlayerDefaults(String name, Color color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public static PlayerDefaults getPlayerDefault(int playerNb) {
		switch (playerNb) {
		case 1:
			return Player1;
		case 2:
			return Player2;
		case 3:
			return Player3;
		case 4:
			return Player4;
		default:
			return Player1;
		}
	}
}
