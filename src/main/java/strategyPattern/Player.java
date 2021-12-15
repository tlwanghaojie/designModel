package strategyPattern;

/**
 * @description: 玩家类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 19:06
 */
public class Player {
	private String name;
	private Strategy strategy;
	private int winCount;
	private int loseCount;
	private int gameCount;

	/**
	 * description 赋予姓名与策略
	 **/
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	/**
	 * description 策略决定下一局要出的手势
	 **/
	public Hand nextHand() {
		return strategy.nextHand();
	}

	/**
	 * description 胜
	 **/
	public void win() {
		strategy.study(true);
		winCount++;
		gameCount++;
	}

	/**
	 * description 负
	 **/
	public void lose() {
		strategy.study(false);
		loseCount++;
		gameCount++;
	}

	/**
	 * description 平
	 **/
	public void even() {
		gameCount++;
	}

	@Override
	public String toString() {
		return "[" + name + ":" + gameCount + " games, "
				+ winCount + " win, " + loseCount + " lose" + "]";
	}
}
