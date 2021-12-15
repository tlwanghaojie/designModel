package abstractFactoryPattern;

/**
 * @description: 抽象的零件
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 14:31
 */
public abstract class Item {
	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	/**
	 * description 制作html页面
	 *
	 * @return String
	 **/
	public abstract String makeHtml();
}
