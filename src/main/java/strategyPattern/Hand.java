package strategyPattern;

/**
 * @description: 猜拳游戏算法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 17:14
 */
public class Hand {
	/**
	 * description 表示石头的值
	 **/
	public static final int HANDVALUE_GUU = 0;
	/**
	 * description 表示剪刀的值
	 **/
	public static final int HANDVALUE_CHO = 1;

	/**
	 * description 表示布的值
	 **/
	public static final int HANDVALUE_PAA = 2;

	/**
	 * description 表示猜拳中3种手势的实例
	 **/
	public static final Hand[] hand = {
			new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA),
	};

	/**
	 * description 表示猜拳中手势对应的字符串
	 **/
	private static final String[] name = {
			"石头", "剪刀", "布",
	};

	/**
	 * description 猜拳中出的手势的值
	 **/
	private int handValue;

	public Hand(int handValue) {
		this.handValue = handValue;
	}

	/**
	 * description 根据手势的值获取对应的实例
	 **/
	public static Hand getHand(int handValue) {
		return hand[handValue];
	}

	/**
	 * description 如果this胜了则返回true
	 **/
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}

	/**
	 * description 如果this输了则返回true
	 **/
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}

	/**
	 * description 计分：平0，胜1，负-1
	 **/
	public int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handValue + 1) % 3 == h.handValue) {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * description 转换为手势值所对应的字符串
	 **/
	@Override
	public String toString() {
		return name[handValue];
	}
}
