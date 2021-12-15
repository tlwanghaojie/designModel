package strategyPattern;

/**
 * @description: 定义猜拳策略的抽象方法的接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 18:17
 */
public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);
}
