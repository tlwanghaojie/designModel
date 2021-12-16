package chainOfResponsibility;

/**
 * @description: 发生问题的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 15:51
 */
public class Trouble {
	/**
	 * description 问题编号
	 **/
	private int number;

	/**
	 * description 生成问题
	 **/
	public Trouble(int number) {
		this.number = number;
	}

	/**
	 * description 获取问题的编号
	 **/
	public int getNumber() {
		return number;
	}

	/**
	 * description 代表问题的字符串
	 **/
	@Override
	public String toString() {
		return "[Trouble " + number + "]";
	}
}
