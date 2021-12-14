package templatePattern;

/**
 * @description: 字符串展示类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 16:05
 */
public class StringDisplay extends AbstractDisplay {
	/**
	 * description 需要展示的字符串
	 **/
	private String string;

	/**
	 * description 以字节为单位计算出的字符串长度
	 **/
	private int width;

	/**
	 * description 构造函数中接收的字符串被保存在字段中
	 * 同时将字符串的字节长度也保存在字段中
	 **/
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
