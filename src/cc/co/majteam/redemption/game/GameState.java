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

public class GameState {
	private static GameState instance = new GameState();
	
	public static GameState getInstance() {
		return instance;
	}
	
	private int currentStage;
	
	private GameState() {
	}

	public int getCurrentStage() {
		return currentStage;
	}

	public void setCurrentStage(int currentStage) {
		this.currentStage = currentStage;
	}

	public void init() {
		this.currentStage = 1;
	}
}
