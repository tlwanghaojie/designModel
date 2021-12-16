package observerPattern;

/**
 * @description: 将数值以图的形式显示出来
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 17:06
 */
public class GraphObserver implements Observer {
	@Override
	public void update(NumberGenerator generator) {
		System.out.print("GraphObserver:");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException ignored) {}
	}
}
