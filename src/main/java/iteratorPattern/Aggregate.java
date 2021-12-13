package iteratorPattern;

/**
 * @description:
 * @projectName:designPattern
 * @author:WangHaojie
 * @createTime:2021/12/13 18:57
 */
public interface Aggregate {
	/**
	 * description 迭代类
	 * @return iteratorPattern.Iterator
	 * @author WangHaojie
	 * @createTime 2021/12/13 18:57
	 **/
	public abstract Iterator iterator();
}
