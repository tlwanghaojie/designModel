package ProxyPattern;

/**
 * @description: 表示带名字的打印机的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 14:19
 */
public class Printer implements Printable {
	private String name;

	/**
	 * description 构造函数
	 **/
	public Printer(String name) {
		this.name = name;
		heavyJob("正在生成Printer实例");
	}

	/**
	 * description 设置名字
	 **/
	@Override
	public void setPrinterName(String name) {
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
	 * description 显示带打印机名字的文字
	 **/
	@Override
	public void print(String string) {
		System.out.println("===" + name + "===");
		System.out.println(string);
	}

	/**
	 * description 重活
	 *
	 * @param msg 消息内容
	 **/
	public void heavyJob(String msg) {
		System.out.println(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ignored) {
			}
			System.out.print(". ");
		}
		System.out.println("\n结束。");
	}
}
