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
			if (keyboard.keyDown(k.getKey(Input.Up))) {
				p.getSprite().move(Direction.North);
			}
			if (keyboard.keyDown(k.getKey(Input.Down))) {
				p.getSprite().move(Direction.South);
			}
			if (keyboard.keyDown(k.getKey(Input.Left))) {
				p.getSprite().move(Direction.West);
			}
			if (keyboard.keyDown(k.getKey(Input.Right))) {
				p.getSprite().move(Direction.East);
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
