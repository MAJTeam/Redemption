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

package cc.co.majteam.redemption.game;

public class GameConfig {
	private static GameConfig instance = new GameConfig();
	
	public static GameConfig getInstance() {
		return instance;
	}
	
	private int height, width;
	
	private GameConfig() {
	}
	
	public boolean load() {
		// TODO: Remove hard-coded values and load from ConfigFile instead.
		this.width = 800;
		this.height = 800;
		
		return true;
	}
	
	public boolean save() {
		// TODO: Make it actually save, using ConfigFile
		return true;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
