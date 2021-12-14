package templatePattern;

/**
 * @description: 字符展示类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 16:03
 */
public class CharDisplay extends AbstractDisplay {
	/**
	 * description 需要展示的字符
	 **/
	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.print("<<");
	}

	@Override
	public void print() {
		System.out.print(ch);
	}

	@Override
	public void close() {
		System.out.println(">>");
	}
}
