package cc.co.majteam.redemption.handlers;

import roujo.lib.gui.windows.GraphicWindow;
import cc.co.majteam.redemption.game.GameConfig;
import cc.co.majteam.redemption.game.GameState;

public class GameHandler {
	private static GameHandler instance = new GameHandler();

	public static GameHandler getInstance() {
		return instance;
	}

	private GameState gameState;
	private GameConfig gameConfig;
	private GraphicWindow gameWindow;

	private GameHandler() {
		this.gameState = GameState.getInstance();
		this.gameConfig = GameConfig.getInstance();
	}

	public void start() {
		gameConfig.load();
		gameState.init();
		gameWindow = new GraphicWindow("Redemption", gameConfig.getWidth(),
				gameConfig.getHeight());
		gameWindow.setVisible(true);
		gameWindow.draw();
	}
}
