package entity;

import type.Type;
import exception.Damage;
import exception.NormalDamage;

public class Hero extends Player {

	public Hero(Type type, int power, int strengh) {
		super(type, power, strengh);
	}

	public void attack(Enemy enemy) throws Damage {
		super.attack();
		throw new NormalDamage("Critical damage");
	}

}
