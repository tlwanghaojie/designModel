package iteratorPattern;

/**
 * @description: 书架迭代类
 * @projectName:designPattern
 * @author:WangHaojie
 * @createTime:2021/12/13 18:58
 */
public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < bookShelf.getLength();
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
