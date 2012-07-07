package cc.co.majteam.redemption.handlers;

import javax.swing.JFrame;

import roujo.lib.gui.windows.GraphicWindow;
import cc.co.majteam.redemption.game.GameConfig;
import cc.co.majteam.redemption.graphics.Drawer;
import cc.co.majteam.redemption.graphics.DrawerG2D;

public class GraphicsHandler {
	private static GraphicsHandler instance = new GraphicsHandler();

	public static GraphicsHandler getInstance() {
		return instance;
	}

	private GraphicWindow gameWindow;
	private GameConfig gameConfig;
	private Drawer drawer;

	private GraphicsHandler() {
	}
	
	public void init() {
		gameConfig = GameConfig.getInstance();
		gameWindow = new GraphicWindow("Redemption", gameConfig.getWidth(),
				gameConfig.getHeight());
		gameWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		gameWindow.setVisible(true);
		drawer = new DrawerG2D();
	}

	public Drawer getDrawer() {
		return drawer;
	}
	
	public GraphicWindow getGameWindow() {
		return gameWindow;
	}

	public void cleanup() {
		gameWindow.dispose();		
	}
}
