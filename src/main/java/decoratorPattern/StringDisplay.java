package decoratorPattern;

/**
 * @description: 用于显示单行字符串的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 11:29
 */
public class StringDisplay extends Display {
	/**
	 * description 要显示的字符串
	 **/
	private String string;

	/**
	 * description 通过参数传入要显示字符串
	 **/
	public StringDisplay(String string) {
		this.string = string;
	}

	/**
	 * description 字符数
	 **/
	@Override
	public int getColumns() {
		return string.getBytes().length;
	}

	/**
	 * description 行数是1
	 **/
	@Override
	public int getRows() {
		return 1;
	}

	/**
	 * description 仅当row=0时返回值
	 **/
	@Override
	public String getRowText(int row) {
		if (row == 0) {
			return string;
		} else {
			return null;
		}
	}
}
