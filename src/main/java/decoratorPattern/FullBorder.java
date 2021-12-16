package decoratorPattern;

/**
 * @description: 用于显示上下左右边框的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 11:31
 */
public class FullBorder extends Border{
	protected FullBorder(Display display) {
		super(display);
	}

	/**
	 * description 字符数为被装饰物的字符数加上两侧边框的字符数
	 **/
	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	/**
	 * description 行数为被装饰物的行数加上上下边框的行数
	 **/
	@Override
	public int getRows() {
		return 1 + display.getRows() + 1;
	}

	/**
	 * description 指定的那一行的字符串
	 **/
	@Override
	public String getRowText(int row) {
		// 下边框
		if (row == 0) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		// 上边框
		} else if (row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumns()) + "+";
		//其他边框
		} else {
			return "|" + display.getRowText(row - 1) + "|";
		}
	}

	/**
	 * description 生成一个重复count次字符ch的字符串
	 **/
	private String makeLine(char ch, int count) {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < count; i++) {
			buf.append(ch);
		}
		return buf.toString();
	}
}
