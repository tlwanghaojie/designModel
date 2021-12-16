package observerPattern;

import java.util.Random;

/**
 * @description: 生成随机数
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 16:57
 */
public class RandomNumberGenerator extends NumberGenerator {
	/**
	 * description 随机数生成器
	 **/
	private Random random = new Random();

	/**
	 * description 当前数值
	 **/
	private int number;

	/**
	 * description 获取当前数值
	 **/
	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}
}
