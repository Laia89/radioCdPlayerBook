package main.java.exercises.game.players;

import main.java.exercises.game.players.Player;

import java.util.Random;

public class Knight extends Player {

	private Random random;

	public Knight() {
		this.random = new Random();
		setHealth(25);
	}

	@Override
	public int attack() {
		return random.nextInt(10);
	}
}
