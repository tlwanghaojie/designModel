package prototypePattern;

/**
 * @descripton: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 18:24
 */
public class Main {
	public static void main(String[] args) {
		// 准备
		Manager manager = new Manager();
		UnderLinePen uPen = new UnderLinePen('~');
		MessageBox mBox = new MessageBox('*');
		MessageBox sBox = new MessageBox('/');
		manager.register("strong message", uPen);
		manager.register("warning box", mBox);
		manager.register("slash box", sBox);

		// 生成
		Product p1 = manager.create("strong message");
		p1.use("Hello world.");
		Product p2 = manager.create("warning box");
		p2.use("Hello world.");
		Product p3 = manager.create("slash box");
		p3.use("Hello world.");
	}
}
