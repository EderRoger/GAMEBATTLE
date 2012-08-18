package gamebattle.test.player;

import org.junit.Test;

import type.CharacterType;
import engine.Battlefield;
import entity.Enemy;
import entity.Hero;
import exception.Damage;

public class TestCharacterPower {

	Hero hero = new Hero(CharacterType.human, 50, 100);
	Enemy globin = new Enemy(CharacterType.globin, 10, 80);
	Battlefield battlefield = new Battlefield(hero, globin);

	@Test
	public void attackTest() throws Damage {

		battlefield.executeBallteTurn();

	}

}
