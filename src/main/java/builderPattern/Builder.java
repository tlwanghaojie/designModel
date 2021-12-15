package builderPattern;

/**
 * @description: 声明编写文档方法的抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 10:23
 */
public abstract class Builder {
	/**
	 * description 创建标题
	 * @param title 标题
	 **/
	public abstract void makeTitle(String title);

	/**
	 * description 创建字符串
	 * @param str 字符串
	 **/
	public abstract void makeString(String str);

	/**
	 * description 创建条目
	 * @param items 条目
	 **/
	public abstract void makeItems(String[] items);

	/**
	 * description 关闭
	 **/
	public abstract void close();
}
