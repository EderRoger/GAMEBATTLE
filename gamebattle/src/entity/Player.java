package entity;

import type.Attack;
import type.Type;

public abstract class Player {

	private Type type;
	private Attack attack;
	private int strengh;
	private int power;

	public Player(Type type, int power, int strengh) {
		this.type = type;
		this.power = power;
		this.strengh = strengh;
	}

	public Type getType() {
		return type;
	}

	public int getStrengh() {
		return strengh;
	}

	public int getPower() {
		return power;
	}

	public Attack getAttack() {
		return attack;
	}

	public Player attack() {
		this.attack = Attack.toAttack();
		return this;
	}

}
