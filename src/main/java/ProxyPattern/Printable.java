package ProxyPattern;

/**
 * @description: Printer和PrintProxy共同接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 14:19
 */
public interface Printable {
	/**
	 * description 设置名字
	 *
	 * @param name 名字
	 **/
	void setPrinterName(String name);

	/**
	 * description 获取名字
	 *
	 * @return String 名字
	 **/
	String getPrinterName();

	/**
	 * description 显示文字（打印输出）
	 *
	 * @param string 要显示的文字
	 **/
	void print(String string);
}
