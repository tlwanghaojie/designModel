package prototypePattern;

import java.util.HashMap;

/**
 * @description:
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 18:15
 */
public class Manager {
	private HashMap showcase = new HashMap();

	public void register(String name, Product product) {
		showcase.put(name, product);
	}

	public Product create(String protoName) {
		Product p = (Product) showcase.get(protoName);
		return p.createClone();
	}
}
