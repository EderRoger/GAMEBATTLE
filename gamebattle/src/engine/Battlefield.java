package engine;

import java.util.Random;

import entity.Player;
import exception.Damage;

public class Battlefield {

	private Player attacker;
	private Player target;

	public Battlefield(Player attacker, Player target) {

		this.attacker = attacker;
		this.target = target;
	}

	public void displayStatusBattle(Player target) {
		System.out.println();
		System.out.println("Target:" + target.getType() +" energy:" + target.getEnergy());
		System.out.println("Attack: " + attacker.getEngineBattle().getAttackType());
		System.out.println("Damage: " + attacker.getEngineBattle().getDamage());
		System.out.println("IS dead:" + !target.isAlive());
		System.out.println();
	}

	public void executeBallteTurn() throws Damage {
		do {
			this.attacker.executeAttackInTargetWithLuckPoint(this.target,getLuck());
			displayStatusBattle(this.target);
			
			changeAttacker(this.attacker,this.target);
			
		} while (this.target.isAlive());

	}

	private void changeAttacker(Player actualAttacker,Player actualTarget){
		this.attacker = actualTarget;
		this.target = actualAttacker;
		System.out.println();
		System.out.println("*****************************Change turn********************");
		System.out.println();
	}
	
	public Player getAttacker() {
		return attacker;
	}

	public Player getTarget() {
		return target;
	}
	private int getLuck(){
		return new Random().nextInt(100);
	}

}
