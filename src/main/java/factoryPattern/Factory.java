package factoryPattern;

/**
 * @description: 工厂抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 16:36
 */
public abstract class Factory {
	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	/**
	 * description 创建产品
	 *
	 * @param owner 产品持有者
	 * @return factoryPattern.Product
	 **/
	protected abstract Product createProduct(String owner);

	/**
	 * description 注册产品
	 *
	 * @param product 产品
	 * @return void
	 **/
	protected abstract void registerProduct(Product product);
}
