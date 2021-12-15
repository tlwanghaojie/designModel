package builderPattern;

/**
 * @description: 编写文档类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 10:29
 */
public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * description 编写文档
	 **/
	public void construct() {
		// 标题
		builder.makeTitle("Greeting");
		// 字符串
		builder.makeString("从早上至下午");
		// 条目
		builder.makeItems(new String[]{
				"早上好。",
				"下午好。",
		});
		// 其他字符串
		builder.makeString("晚上");
		builder.makeItems(new String[]{
				"晚上好。",
				"晚安。",
				"再见。",
		});
		// 完成文档
		builder.close();
	}
}
