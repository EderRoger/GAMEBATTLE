package entity;

import type.CharacterType;
import engine.EngineBattle;
import exception.Damage;

public abstract class Player {

	private CharacterType type;
	private int energy;
	private int power;
	public boolean alive = true;
	private EngineBattle engineBattle;

	public Player(CharacterType type, int power, int energy) {
		this.type = type;
		this.power = power;
		this.energy = energy;
		this.engineBattle = new EngineBattle();
	}

	public CharacterType getType() {
		return type;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getPower() {
		return power;
	}

	public boolean isAlive() {
		return energy > 0;
	}

	public EngineBattle getEngineBattle() {
		return engineBattle;
	}

	public Player executeAttackInTargetWithLuckPoint(Player target, int luckPoint) throws Damage {
		target.setEnergy(target.getEnergy() - engineBattle.executeAttackWithAttackPowerAndLuckPoint(getPower(), luckPoint));
		return target;

	}

	@Override
	public String toString() {
		return "Type: " + type.toString() + " Energy:" + energy + " Power: " + power;
	}

}
