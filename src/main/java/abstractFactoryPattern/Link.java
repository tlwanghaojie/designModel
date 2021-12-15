package abstractFactoryPattern;

/**
 * @description: 抽象地表示HTML的超链接的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 14:45
 */
public abstract class Link extends Item {
	protected String url;

	public Link(String caption) {
		super(caption);
	}

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
}
