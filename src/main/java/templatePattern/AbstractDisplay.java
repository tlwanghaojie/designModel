package templatePattern;

/**
 * @description: 抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 15:59
 */
public abstract class AbstractDisplay {
	/**
	 * description 开启方法
	 *
	 * @return void
	 **/
	public abstract void open();

	/**
	 * description 打印方法
	 *
	 * @return void
	 **/
	public abstract void print();

	/**
	 * description 关闭方法
	 *
	 * @return void
	 **/
	public abstract void close();

	/**
	 * description 展示方法
	 *
	 * @return void
	 **/
	public final void display() {
		open();
		for (int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
