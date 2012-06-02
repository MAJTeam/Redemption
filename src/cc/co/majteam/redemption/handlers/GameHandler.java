package cc.co.majteam.redemption.handlers;

import cc.co.majteam.redemption.game.GameConfig;
import cc.co.majteam.redemption.game.GameState;

public class GameHandler {
	private static GameHandler instance = new GameHandler();

	public static GameHandler getInstance() {
		return instance;
	}

	private GameState gameState;
	private GameConfig gameConfig;
	
	private GraphicsHandler graphicsHandler;

	private GameHandler() {
		this.gameState = GameState.getInstance();
		this.gameConfig = GameConfig.getInstance();
		this.graphicsHandler = GraphicsHandler.getInstance();
	}

	public void start() {
		gameConfig.load();
		gameState.init();
		graphicsHandler.init();		
		
		// Main game loop
		// TODO: Make the loop check gamestate to see if it should quit
		while(true) {
			getInput();
			processLogic();
			drawScreen();
		}
	}
	
	private void getInput() {
		
	}
	
	private void processLogic() {
		
	}
	
	private void drawScreen() {
		graphicsHandler.draw();
	}
}
