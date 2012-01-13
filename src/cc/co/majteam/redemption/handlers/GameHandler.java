package cc.co.majteam.redemption.handlers;

public class GameHandler {
	private static GameHandler instance = new GameHandler();
	
	public static GameHandler getInstance() {
		return instance;
	}
	
	private GameHandler() {
	}
}
