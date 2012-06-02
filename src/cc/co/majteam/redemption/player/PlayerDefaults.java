package cc.co.majteam.redemption.player;

import java.awt.Color;

import cc.co.majteam.redemption.player.input.KeyDefaults;

public enum PlayerDefaults {
	Player1("Player 1", Color.CYAN, KeyDefaults.Arrows),

	Player2("Player 2", Color.RED, KeyDefaults.WASD);
	
	// TODO: Add players once more input methods can exist.
	//, Player3("Player 3", Color.YELLOW),
	
	//Player4("Player 4", Color.GREEN);

	private final String name;
	private final Color color;
	private final KeyDefaults keyDefaults;

	private PlayerDefaults(String name, Color color, KeyDefaults keyDefaults) {
		this.name = name;
		this.color = color;
		this.keyDefaults = keyDefaults;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}
	
	public KeyDefaults getKeyDefaults() {
		return keyDefaults;
	}

	public static PlayerDefaults getPlayerDefault(int playerNb) {
		switch (playerNb) {
		case 1:
			return Player1;
		case 2:
			return Player2;
		default:
			return Player1;
		}
	}
}
