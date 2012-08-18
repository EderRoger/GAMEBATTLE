package engine;

import type.Attack;

public class EngineBattle {

	private int damage;
	private int powerAttacker;
	private Attack attackType;

	public int executeAttackWithAttackPowerAndLuckPoint(int powerAttacker, int luckPoint) {
		this.powerAttacker = powerAttacker;

		if (luckPoint >= 0 && luckPoint <= 3)
			return calculateDamageWithAttackType(Attack.LOST);
		if (luckPoint >= 4 && luckPoint <= 70)
			return calculateDamageWithAttackType(Attack.NORMAL);
		if (luckPoint >= 71 && luckPoint <= 96)
			return calculateDamageWithAttackType(Attack.LUCK);
		if (luckPoint >= 97 && luckPoint <= 100)
			return calculateDamageWithAttackType(Attack.CRITICAL);
		return 0;
	}

	private int calculateDamageWithAttackType(Attack attackType) {
		this.attackType = attackType;
		
		int normalAttackDamage = powerAttacker / 3;
		
		if (attackType.equals(Attack.NORMAL)) {
			this.damage = normalAttackDamage;
		}
		if (attackType.equals(Attack.LUCK)) {
			
			this.damage = (int) (normalAttackDamage + (  (normalAttackDamage / 100.0) * 20.0));
		}
		if (attackType.equals(Attack.CRITICAL)) {
			this.damage = normalAttackDamage * 2;
		}
		if (attackType.equals(Attack.LOST)) {
			this.damage = 0;
		}
		return this.damage;
	}

	public int getDamage() {
		return this.damage;
	}

	public Attack getAttackType() {
		return this.attackType;
	}

}
