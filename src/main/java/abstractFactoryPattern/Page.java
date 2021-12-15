package abstractFactoryPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @description: 抽象的产品（抽象地表示HTML页面的类）
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 14:51
 */
public abstract class Page {
	protected String title;
	protected String author;
	protected ArrayList content = new ArrayList();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}

	public void output() {
		try {
			String fileName = title + ".html";
			Writer writer = new FileWriter(fileName);
			writer.write(this.makeHtml());
			writer.close();
			System.out.println(fileName + " 编写完成。");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * description 制作html页面
	 *
	 * @return String
	 **/
	public abstract String makeHtml();
}
