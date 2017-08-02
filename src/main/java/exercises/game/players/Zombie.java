package main.java.exercises.game.players;

import java.util.Random;

public class Zombie extends Player {

	private Random random;

	public Zombie() {
		setHealth(7);
		this.random = new Random();
	}

	@Override
	public int attack() {
		return random.nextInt(3) + 2;
	}
}
