package abstractFactoryPattern;

/**
 * @description: 具体的产品
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 16:11
 */
public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>").append(title).append("</title></head>\n")
			.append("<body>\n").append("<h1>").append(title).append("</h1>\n")
			.append("<ul>\n");
		for (Object o : content) {
			Item item = (Item) o;
			buffer.append(item.makeHtml());
		}
		buffer.append("</ul>\n").append("<hr><address>").append(author)
				.append("</address>").append("</body>").append("</html>\n");
		return buffer.toString();
	}
}
