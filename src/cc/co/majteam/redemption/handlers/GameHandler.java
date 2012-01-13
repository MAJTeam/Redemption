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
	
	private GameHandler() {
		this.gameState = GameState.getInstance();
		this.gameConfig = GameConfig.getInstance();
	}
	
	public void start() {
	}
}
