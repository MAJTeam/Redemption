package cc.co.majteam.redemption.game;

public class GameState {
	private static GameState instance = new GameState();
	
	public static GameState getInstance() {
		return instance;
	}
	
	private int currentStage;
	
	private GameState() {
	}

	public int getCurrentStage() {
		return currentStage;
	}

	public void setCurrentStage(int currentStage) {
		this.currentStage = currentStage;
	}

	public void init() {
		this.currentStage = 1;
	}
}
