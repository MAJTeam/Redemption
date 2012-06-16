package cc.co.majteam.redemption.handlers;

import java.util.HashSet;
import java.util.Set;

import cc.co.majteam.redemption.graphics.sprites.PlayerSprite;
import cc.co.majteam.redemption.player.PlayerDefaults;

public class EntityHandler {
	private static EntityHandler instance = new EntityHandler();
	
	public static EntityHandler getInstance() {
		return instance;
	}
	
	private Set<PlayerSprite> players;
	
	private EntityHandler() {
		players = new HashSet<PlayerSprite>();
	}
	
	public void init() {
		players.add(new PlayerSprite(PlayerDefaults.Player1));
	}
	
	public Set<PlayerSprite> getPlayers() {
		return players;
	}
}
