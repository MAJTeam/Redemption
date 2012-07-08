package cc.co.majteam.redemption.handlers;

import java.util.HashSet;
import java.util.Set;

import cc.co.majteam.redemption.graphics.sprites.Bullet;
import cc.co.majteam.redemption.player.Player;

public class EntityHandler {
	private static EntityHandler instance = new EntityHandler();
	
	public static EntityHandler getInstance() {
		return instance;
	}
	
	private Set<Player> players;
	private Set<Bullet> bullets;
	
	private EntityHandler() {
		players = new HashSet<Player>();
		bullets = new HashSet<Bullet>();
	}
	
	public void init() {
	}
	
	public Set<Player> getPlayers() {
		return players;
	}
	
	public boolean addPlayer(Player p) {
		return players.add(p);
	}
	
	public Set<Bullet> getBullets() {
		return bullets;
	}

	public void addBullets(Set<Bullet> bullets) {
		this.bullets.addAll(bullets);
	}
}
