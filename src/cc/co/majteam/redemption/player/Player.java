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

package cc.co.majteam.redemption.player;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

import cc.co.majteam.redemption.graphics.Coords;
import cc.co.majteam.redemption.graphics.sprites.Bullet;
import cc.co.majteam.redemption.graphics.sprites.PlayerSprite;
import cc.co.majteam.redemption.player.input.KeyConfig;

public class Player {
	public static final int DefaultPlayerSpeed = 5;

	private int id;
	private String name;
	private Color color;
	private int score;
	private int speed;
	private PlayerSprite sprite;
	private KeyConfig keyConfig;

	public Player(int id, PlayerDefaults defaults) {
		this.id = id;
		this.name = defaults.getName();
		this.color = defaults.getColor();
		this.score = 0;
		this.speed = DefaultPlayerSpeed;
		this.sprite = new PlayerSprite(defaults);
		this.keyConfig = defaults.getKeyDefaults().getKeyConfig();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public PlayerSprite getSprite() {
		return sprite;
	}

	public KeyConfig getKeyConfig() {
		return keyConfig;
	}

	public Coords getCoords() {
		return sprite.getCenter();
	}

	public void setCoords(Coords coords) {
		sprite.setCenter(coords);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Set<Bullet> fire() {
		Set<Bullet> bullets = new HashSet<Bullet>();
		Coords c = new Coords(getCoords());
		// TODO: Externalize Player size
		c.move(sprite.getOrientation(), 10);
		bullets.add(new Bullet(this, c, 10, sprite.getOrientation()));
		return bullets;
	}
}
