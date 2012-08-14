package entity;

import type.Attack;
import type.Type;
import exception.Damage;

public class Hero extends Player {

	public Hero(Type type, int power, int energy) {
		super(type, power, energy);
	}

	public void attack(Enemy enemy) throws Damage {
		int damage = 0;
		Attack attack = Attack.execute();

		if (attack.equals(Attack.NORMAL)) {
			damage = getPower() / 3;
		}
		if (attack.equals(Attack.LUCK)) {
			damage = (getPower() / 3) + (((getPower() / 3) / 100 * 20));
		}
		if (attack.equals(Attack.CRITICAL)){
			damage = (getPower() / 3) * 2;
		}
		enemy.setEnergy(enemy.getEnergy()-damage);
		System.out.println();
		System.out.println("Enemy energy:" + enemy.getEnergy());
		System.out.println("Attack: " + attack);
		System.out.println("Damage: " + damage);
		System.out.println("IS dead:" + enemy.isAlive);
		System.out.println();
	}

}
