package abstractFactoryPattern;

/**
 * @description: 具体的零件
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 16:07
 */
public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHtml() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n").append(caption).append("\n")
				.append("<ul>\n");
		for (Object o : tray) {
			Item item = (Item) o;
			buffer.append(item.makeHtml());
		}
		buffer.append("</ul>\n").append("</li>\n");
		return buffer.toString();
	}
}
