package cc.co.majteam.redemption.game;

public class GameConfig {
	private static GameConfig instance = new GameConfig();
	
	public static GameConfig getInstance() {
		return instance;
	}
	
	private int height, width;
	
	private GameConfig() {
	}
	
	public boolean load() {
		// TODO: Remove hard-coded values and load from ConfigFile instead.
		this.width = 800;
		this.height = 800;
		
		return true;
	}
	
	public boolean save() {
		// TODO: Make it actually save, using ConfigFile
		return true;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
