/*
 * Copyright 2012, Jonathan Rouillard
 * 
 * This file is part of Project Redemption.
 * 
 * Project Redemption is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Project Redemption is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Project Redemption.  If not, see <http://www.gnu.org/licenses/>.
 */

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
