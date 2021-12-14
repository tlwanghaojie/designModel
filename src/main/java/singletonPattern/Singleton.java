package singletonPattern;

/**
 * @description: 单例类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 16:59
 */
public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("生成了一个实例");
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
