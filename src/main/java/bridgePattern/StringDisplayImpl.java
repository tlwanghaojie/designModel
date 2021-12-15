package bridgePattern;

/**
 * @description: 显示字符串的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 16:35
 */
public class StringDisplayImpl extends DisplayImpl {
	/**
	 * description 要显示的字符串
	 **/
	private String string;

	/**
	 * description 以字节单位计算出的字符串的宽度
	 **/
	private int width;

	public StringDisplayImpl(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void rawClose() {
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
