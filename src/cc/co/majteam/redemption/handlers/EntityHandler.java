package cc.co.majteam.redemption.handlers;

import java.util.HashSet;
import java.util.Set;

import cc.co.majteam.redemption.player.Player;

public class EntityHandler {
	private static EntityHandler instance = new EntityHandler();
	
	public static EntityHandler getInstance() {
		return instance;
	}
	
	private Set<Player> players;
	
	private EntityHandler() {
		players = new HashSet<Player>();
	}
	
	public void init() {
	}
	
	public Set<Player> getPlayers() {
		return players;
	}
	
	public boolean addPlayer(Player p) {
		return players.add(p);
	}
}
