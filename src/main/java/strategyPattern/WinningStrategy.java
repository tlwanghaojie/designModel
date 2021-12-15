package strategyPattern;

import java.util.Random;

/**
 * @description: 猜拳策略：如果上一局的手势获胜了，则下一局与上一局相同；
 * 如果上一局的手势输了，则下一局就随机出手势。
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 18:20
 */
public class WinningStrategy implements Strategy {
	private Random random;
	private boolean won = false;
	private Hand preHand;

	public WinningStrategy(int seed) {
		random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		if (!won) {
			preHand = Hand.getHand(random.nextInt(3));
		}
		return preHand;
	}

	@Override
	public void study(boolean win) {
		won = win;
	}
}
