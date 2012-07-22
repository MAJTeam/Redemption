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

package cc.co.majteam.redemption.player.input;

import java.awt.event.KeyEvent;

public enum KeyDefaults{
	Arrows(
		KeyEvent.VK_UP,		// up
		KeyEvent.VK_DOWN,	// down
		KeyEvent.VK_LEFT,	// left
		KeyEvent.VK_RIGHT,	// right
		KeyEvent.VK_Z,		// fire 
		KeyEvent.VK_ESCAPE	// quit
	),
	
	WASD(
		KeyEvent.VK_W,
		KeyEvent.VK_S,
		KeyEvent.VK_A,
		KeyEvent.VK_D,
		KeyEvent.VK_M,
		KeyEvent.VK_ESCAPE);
	
	private final KeyConfig keyConfig;
	
	private KeyDefaults(int up, int down, int left, int right, int fire, int quit){
		keyConfig = new KeyConfig(new int[]{up, down, left, right, fire, quit});
	}
	
	public KeyConfig getKeyConfig(){
		return keyConfig;
	}
}