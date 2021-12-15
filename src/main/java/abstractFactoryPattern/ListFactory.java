package abstractFactoryPattern;

/**
 * @description: 具体的factory
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 16:03
 */
public class ListFactory extends Factory {
	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}
}
