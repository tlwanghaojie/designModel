package builderPattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description: 使用html编写文档并返回html文件的名字
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 13:44
 */
public class HtmlBuilder extends Builder {
	/**
	 * description 文件名
	 **/
	private String fileName;

	/**
	 * description 用于编写文件的PrintWriter
	 **/
	private PrintWriter writer;

	/**
	 * description html文件的标题
	 **/
	@Override
	public void makeTitle(String title) {
		fileName = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><meta charset=\"UTF-8\"><title>" + title + "</title></head><body>");
		// 输出标题
		writer.println("<h1>" + title + "</h1>");
	}

	/**
	 * description html文件中的字符串
	 **/
	@Override
	public void makeString(String str) {
		writer.println("<p>" + str + "</p>");
	}

	/**
	 * description html文件中的条目
	 **/
	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");
		for (String item : items) {
			writer.println("<li>" + item + "</li>");
		}
		writer.println("</ul>");
	}

	/**
	 * description 完成文档
	 **/
	@Override
	public void close() {
		writer.println("</body></html>");
		writer.close();
	}

	/**
	 * description 编写完成的文档
	 **/
	public String getResult() {
		// 返回文件名
		return fileName;
	}
}
