package prototypePattern;

/**
 * @description: 产品接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 17:43
 */
public interface Product {
	/**
	 * description 使用产品
	 *
	 * @param s 字符串
	 * @return void
	 **/
	void use(String s);

	/**
	 * description 对象克隆
	 *
	 * @return prototypePattern.Product 产品
	 **/
	Product createClone();
}
