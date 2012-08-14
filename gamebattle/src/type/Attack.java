package type;

import java.util.Random;

public enum Attack {
	LOST, NORMAL, LUCK, CRITICAL;

	public static Attack toAttack() {
		int luckPoint = new Random().nextInt(100);
		if (luckPoint >= 0 && luckPoint <= 3)
			return LOST;
		if (luckPoint >= 4 && luckPoint <= 70)
			return NORMAL;
		if (luckPoint >= 71 && luckPoint <= 96)
			return LUCK;
		if (luckPoint >= 97 && luckPoint <= 100)
			return CRITICAL;

		return LOST;
	}
}
