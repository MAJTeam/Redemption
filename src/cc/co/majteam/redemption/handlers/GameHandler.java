package cc.co.majteam.redemption.handlers;

import java.util.Set;

import cc.co.majteam.redemption.entities.PlayerSprite;
import cc.co.majteam.redemption.game.GameConfig;
import cc.co.majteam.redemption.game.GameState;
import cc.co.majteam.redemption.graphics.Drawer;

public class GameHandler {
	private static GameHandler instance = new GameHandler();

	public static GameHandler getInstance() {
		return instance;
	}

	private GameState gameState;
	private GameConfig gameConfig;
	
	private GraphicsHandler graphicsHandler;
	private EntityHandler entityHandler;

	private GameHandler() {
		this.gameState = GameState.getInstance();
		this.gameConfig = GameConfig.getInstance();
		this.graphicsHandler = GraphicsHandler.getInstance();
		this.entityHandler = EntityHandler.getInstance();
	}

	public void start() {
		gameConfig.load();
		gameState.init();
		graphicsHandler.init();
		entityHandler.init();
		
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
		Drawer drawer = graphicsHandler.getDrawer();
		drawer.init();
		
		// Draw all players
		Set<PlayerSprite> players = entityHandler.getPlayers();
		for(PlayerSprite ps : players) {
			drawer.draw(ps.getDrawables(), ps.getCenter());
		}
		
		drawer.commit();
	}
}
