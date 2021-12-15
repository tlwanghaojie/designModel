package builderPattern;

/**
 * @description: 使用纯文本编写文档并以String返回结果
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 13:36
 */
public class TextBuilder extends Builder {
	/**
	 * description 文档内容保存在该字段中
	 **/
	private StringBuffer buffer = new StringBuffer();

	/**
	 * description 纯文本的标题
	 **/
	@Override
	public void makeTitle(String title) {
		buffer.append("=====================\n")
				.append("[").append(title).append("]\n\n");
	}

	/**
	 * description 纯文本的字符串
	 **/
	@Override
	public void makeString(String str) {
		buffer.append("💕").append(str).append("\n\n");
	}

	/**
	 * description 纯文本的条目
	 **/
	@Override
	public void makeItems(String[] items) {
		for (String item : items) {
			buffer.append(" .").append(item).append("\n");
		}
		buffer.append("\n");
	}

	/**
	 * description 完成文档
	 **/
	@Override
	public void close() {
		buffer.append("====================\n");
	}

	/**
	 * description 完成的文档
	 **/
	public String getResult() {
		return buffer.toString();
	}
}
