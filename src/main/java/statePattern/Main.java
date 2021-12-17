package statePattern;

/**
 * @description: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 10:25
 */
public class Main {
	public static void main(String[] args) {
		SafeFrame frame = new SafeFrame("State Sample");
		while (true) {
			for (int hour = 0; hour < 24; hour++) {
				frame.setClock(hour);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ignored) {
				}
			}
		}
	}
}
