package entity;

import type.Type;

public abstract class Player {

	private Type type;
	private int energy;
	private int power;
	public boolean isAlive = true;

	public Player(Type type, int power, int energy) {
		this.type = type;
		this.power = power;
		this.energy = energy;
	}

	public Type getType() {
		return type;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		if (this.energy <= 0)
			this.isAlive = false;
		this.energy = energy;
	}

	public int getPower() {
		return power;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

}
