package iteratorPattern;

import java.util.ArrayList;

/**
 * @description: 书架类
 * @projectName:designPattern
 * @author:WangHaojie
 * @createTime:2021/12/13 18:56
 */
public class BookShelf implements Aggregate {
	private ArrayList books;

	public BookShelf(int initialize) {
		this.books = new ArrayList(initialize);
	}

	public Book getBookAt(int index) {
		return (Book)books.get(index);
	}

	public void appendBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
