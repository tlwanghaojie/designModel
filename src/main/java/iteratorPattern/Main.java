package iteratorPattern;

/**
 * @description: 主方法
 * @projectName:designPattern
 * @author:WangHaojie
 * @createTime:2021/12/13 19:07
 */
public class Main {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("Around the World in 80 Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("East of Eden"));
		bookShelf.appendBook(new Book("Frankenstein"));
		bookShelf.appendBook(new Book("Hamlet"));
		Iterator it = bookShelf.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
	}
}
