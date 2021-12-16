package decoratorPattern;

/**
 * @description: 用于只显示左右边框的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 11:30
 */
public class SideBorder extends Border {
	/**
	 * description 表示装饰边框的字符
	 **/
	private char borderChar;

	protected SideBorder(Display display, char borderChar) {
		super(display);
		this.borderChar = borderChar;
	}

	/**
	 * description 字符数为字符串字符数加上两侧边框的字符数
	 **/
	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	/**
	 * description 行数为被装饰物的行数
	 **/
	@Override
	public int getRows() {
		return display.getRows();
	}

	/**
	 * description 指定的那一行的字符串为被装饰物的字符串加上两侧的边框的字符
	 **/
	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}
}
