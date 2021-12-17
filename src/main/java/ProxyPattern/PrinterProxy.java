package ProxyPattern;

/**
 * @description: 表示带名字的打印机的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 14:20
 */
public class PrinterProxy implements Printable {
	/**
	 * description 名字
	 **/
	private String name;

	/**
	 * description 本人
	 **/
	private Printer real;

	/**
	 * description 构造函数
	 **/
	public PrinterProxy(String name) {
		this.name = name;
	}

	/**
	 * description 设置名字
	 **/
	@Override
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	/**
	 * description 获取名字
	 **/
	@Override
	public String getPrinterName() {
		return name;
	}

	/**
	 * description 显示
	 **/
	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}

	/**
	 * description 生成本人
	 **/
	public synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}
	}
}
