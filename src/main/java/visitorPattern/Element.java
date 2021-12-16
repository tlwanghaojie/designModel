package visitorPattern;

/**
 * @description: 接受访问者访问的接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 14:53
 */
public interface Element {
	/**
	 * description 接受访问者方法
	 *
	 * @param v 参观者类
	 **/
	public abstract void accept(Visitor v);
}
