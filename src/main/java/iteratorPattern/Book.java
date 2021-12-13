package iteratorPattern;

/**
 * @description: 书类
 * @projectName:designPattern
 * @author:WangHaojie
 * @createTime:2021/12/13 18:55
 */
public class Book {
	/**
	 * description 书名
	 **/
	private String name;

	public Book(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
