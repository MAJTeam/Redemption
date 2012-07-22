/*
 * Copyright 2012, Jonathan Rouillard
 * 
 * This file is part of Project Redemption.
 * 
 * Project Redemption is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Project Redemption is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Project Redemption.  If not, see <http://www.gnu.org/licenses/>.
 */

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
