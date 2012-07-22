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

package cc.co.majteam.redemption.handlers;

import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;

import cc.co.majteam.redemption.game.GameConfig;
import cc.co.majteam.redemption.game.GameState;
import cc.co.majteam.redemption.graphics.Coords;
import cc.co.majteam.redemption.graphics.Drawer;
import cc.co.majteam.redemption.graphics.sprites.Bullet;
import cc.co.majteam.redemption.graphics.sprites.Direction;
import cc.co.majteam.redemption.player.Player;
import cc.co.majteam.redemption.player.PlayerDefaults;
import cc.co.majteam.redemption.player.input.Input;
import cc.co.majteam.redemption.player.input.KeyConfig;
import cc.co.majteam.redemption.player.input.KeyboardInput;

public class GameHandler {
	private static GameHandler instance = new GameHandler();

	public static GameHandler getInstance() {
		return instance;
	}

	private GameState gameState;
	private GameConfig gameConfig;

	private GraphicsHandler graphicsHandler;
	private EntityHandler entityHandler;

	private KeyboardInput keyboard;

	private boolean isRunning;

	private GameHandler() {
		this.gameState = GameState.getInstance();
		this.gameConfig = GameConfig.getInstance();
		this.graphicsHandler = GraphicsHandler.getInstance();
		this.entityHandler = EntityHandler.getInstance();
		this.keyboard = new KeyboardInput();
	}

	public void start() {
		// Game start: Prepare everything
		gameConfig.load();
		gameState.init();
		graphicsHandler.init();
		graphicsHandler.getGameWindow().addKeyListener(keyboard);

		entityHandler.init();
		entityHandler.addPlayer(new Player(1, PlayerDefaults.Player1));
		entityHandler.addPlayer(new Player(2, PlayerDefaults.Player2));

		// Main game loop
		isRunning = true;
		while (isRunning) {
			processInput();
			processLogic();
			drawScreen();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
			}
		}

		cleanup();
	}

	private void processInput() {
		// Get the latest keyboard state
		keyboard.poll();

		// Check if the user wants to quit
		if (keyboard.keyDownOnce(KeyEvent.VK_ESCAPE)) {
			isRunning = false;
			// Yes, this is short-circuiting the whole method.
			// It's cleaner this way. =P
			return;
		}

		// Check if any player is trying to do something
		for (Player p : entityHandler.getPlayers()) {
			KeyConfig k = p.getKeyConfig();
			int x = 0, y = 0;
			if (keyboard.keyDown(k.getKey(Input.Up))) {
				y -= 1;
			}
			if (keyboard.keyDown(k.getKey(Input.Down))) {
				y += 1;
			}
			if (keyboard.keyDown(k.getKey(Input.Left))) {
				x -= 1;
			}
			if (keyboard.keyDown(k.getKey(Input.Right))) {
				x += 1;
			}
			Direction dir = Direction.get(x, y);
			if (dir != Direction.None) {
				p.getSprite().move(dir);
			}
			if (keyboard.keyDownOnce(k.getKey(Input.Fire))) {
				entityHandler.addBullets(p.fire());
			}
		}
	}

	private void processLogic() {
		// Keep the window corners in scope for easy access
		Coords tlCorner = new Coords(0, 0);
		Coords lrCorner = new Coords(gameConfig.getWidth(),
				gameConfig.getHeight());

		// Move the bullets, destroying those that have wandered off-screen
		Set<Bullet> bullets = entityHandler.getBullets();
		Set<Bullet> removedBullets = new HashSet<Bullet>();
		for (Bullet b : bullets) {
			b.move();
			if (!b.getCenter().isBetween(tlCorner, lrCorner)) {
				removedBullets.add(b);
			}
		}
		bullets.removeAll(removedBullets);
	}

	private void drawScreen() {
		Drawer drawer = graphicsHandler.getDrawer();
		drawer.init();

		// Draw all players
		for (Player p : entityHandler.getPlayers()) {
			drawer.draw(p.getSprite().getDrawables(), p.getSprite().getCenter());
		}

		// Draw all bullets
		for (Bullet b : entityHandler.getBullets()) {
			drawer.draw(b.getDrawables(), b.getCenter());
		}

		drawer.commit();
	}

	private void cleanup() {
		graphicsHandler.cleanup();
	}
}
