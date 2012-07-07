package cc.co.majteam.redemption.handlers;

import java.awt.event.KeyEvent;
import java.util.Set;

import cc.co.majteam.redemption.game.GameConfig;
import cc.co.majteam.redemption.game.GameState;
import cc.co.majteam.redemption.graphics.Drawer;
import cc.co.majteam.redemption.graphics.sprites.PlayerSprite;
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
		gameConfig.load();
		gameState.init();
		graphicsHandler.init();
		graphicsHandler.getGameWindow().addKeyListener(keyboard);
		entityHandler.init();
		
		// Main game loop
		isRunning = true;
		while(isRunning) {
			processInput();
			processLogic();
			drawScreen();
		}
		
		cleanup();
	}
	
	private void processInput() {		
		// Get the latest keyboard state
		keyboard.poll();
		
		// Check if the user wants to quit
		if(keyboard.keyDownOnce(KeyEvent.VK_ESCAPE)) {
			isRunning = false;
		}
	}
	
	private void processLogic() {
		
	}
	
	private void drawScreen() {
		Drawer drawer = graphicsHandler.getDrawer();
		drawer.init();
		
		// Draw all players
		Set<PlayerSprite> players = entityHandler.getPlayers();
		for(PlayerSprite ps : players) {
			drawer.draw(ps.getDrawables(), ps.getCenter());
		}
		
		drawer.commit();
	}
	
	private void cleanup() {
		graphicsHandler.cleanup();
	}
}
