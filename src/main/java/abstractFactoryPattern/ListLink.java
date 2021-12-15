package abstractFactoryPattern;

/**
 * @description: 具体的零件类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 16:05
 */
public class ListLink extends Link {
	public ListLink(String caption) {
		super(caption);
	}

	public ListLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHtml() {
		return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}
}
