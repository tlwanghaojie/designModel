package decoratorPattern;

/**
 * @description: 用于显示字符串的抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 11:29
 */
public abstract class Display {
	/**
	 * description 获取横向字符数
	 *
	 * @return int
	 **/
	public abstract int getColumns();

	/**
	 * description 获取纵向行数
	 *
	 * @return int
	 **/
	public abstract int getRows();

	/**
	 * description 获取row行的字符串
	 *
	 * @param row row行
	 * @return java.lang.String row行的字符串
	 **/
	public abstract String getRowText(int row);

	/**
	 * description 全部显示
	 **/
	public final void show() {
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
