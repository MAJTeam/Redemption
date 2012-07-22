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
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {

	private static final int KEY_COUNT = 256;

	private enum KeyState {
		RELEASED, // Not down
		PRESSED, // Down, but not the first time
		ONCE // Down for the first time
	}

	// Current state of the keyboard
	private boolean[] currentKeys = null;

	// Polled keyboard state
	private KeyState[] keys = null;

	public KeyboardInput() {
		currentKeys = new boolean[KEY_COUNT];
		keys = new KeyState[KEY_COUNT];
		for (int i = 0; i < KEY_COUNT; ++i) {
			keys[i] = KeyState.RELEASED;
		}
	}

	public synchronized void poll() {
		for (int i = 0; i < KEY_COUNT; ++i) {
			// Set the key state
			if (currentKeys[i]) {
				// If the key is down now, but was not
				// down last frame, set it to ONCE,
				// otherwise, set it to PRESSED
				if (keys[i] == KeyState.RELEASED)
					keys[i] = KeyState.ONCE;
				else
					keys[i] = KeyState.PRESSED;
			} else {
				keys[i] = KeyState.RELEASED;
			}
		}
	}

	public boolean keyDown(int keyCode) {
		return keys[keyCode] == KeyState.ONCE
				|| keys[keyCode] == KeyState.PRESSED;
	}

	public boolean keyDownOnce(int keyCode) {
		return keys[keyCode] == KeyState.ONCE;
	}

	public synchronized void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode >= 0 && keyCode < KEY_COUNT) {
			currentKeys[keyCode] = true;
		}
	}

	public synchronized void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode >= 0 && keyCode < KEY_COUNT) {
			currentKeys[keyCode] = false;
		}
	}

	public void keyTyped(KeyEvent e) {
		// Not needed
	}
}
