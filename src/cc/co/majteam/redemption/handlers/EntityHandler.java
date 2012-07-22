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
