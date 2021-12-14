package templatePattern;

/**
 * @description: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 16:10
 */
public class Main {
	public static void main(String[] args) {
		// 生成一个持有'H'的CharDisplay类的实例
		AbstractDisplay d1 = new CharDisplay('H');
		// 生成一个持有"Hello, world."的StringDisplay类的实例
		AbstractDisplay d2 = new StringDisplay("Hello world.");
		// 生成一个持有"你好，世界。"的StringDisplay类的实例
		AbstractDisplay d3 = new StringDisplay("你好, 世界。");
		d1.display();
		d2.display();
		d3.display();
	}
}
