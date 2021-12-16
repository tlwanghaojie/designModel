package observerPattern;

/**
 * @description: 以数字形式显示观察到的数值
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 17:00
 */
public class DigitObserver implements Observer {
	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException ignored) {}
	}
}
