package gamebattle.test.player;

import org.junit.Test;

import type.Type;
import entity.Enemy;
import entity.Hero;
import exception.CriticalDamage;
import exception.Damage;

public class TestCharacterPower {

	Hero hero = new Hero(Type.human, 50, 100);
	Enemy globin = new Enemy(Type.globin, 50, 200);

	@Test(expected = CriticalDamage.class)
	public void attackTest() throws Damage {
		while (globin.isAlive) {
			hero.attack(globin);
		}
	}

}
