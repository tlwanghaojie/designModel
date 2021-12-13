package iteratorPattern;

/**
 * @description:
 * @projectName:designPattern
 * @author:WangHaojie
 * @createTime:2021/12/13 18:52
 */
public interface Iterator {
	/**
	 * description 判断是否存在下一个元素
	 *
	 * @return boolean
	 * author WangHaojie
	 * createTime 2021/12/13 18:53
	 **/
	public abstract boolean hasNext();

	/**
	 * description 获取下一个元素
	 *
	 * @return java.lang.Object
	 * @author WangHaojie
	 * @createTime 2021/12/13 18:54
	 **/
	public abstract Object next();
}
