package factoryPattern;

import java.util.HashMap;

/**
 * @description:
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 16:42
 */
public class IDCardFactory extends Factory {
	private HashMap database = new HashMap();
	private int serial = 100;

	@Override
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	@Override
	protected void registerProduct(Product product) {
		IDCard card = (IDCard) product;
		database.put(card.getSerial(), card.getOwner());
	}

	public HashMap getDatabase() {
		return database;
	}
}
