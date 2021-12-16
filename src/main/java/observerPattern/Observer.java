package observerPattern;

/**
 * @description: 观察者接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 16:49
 */
public interface Observer {
	/**
	 * description 更新方法
	 *
	 * @param generator 数值更新
	 **/
	void update(NumberGenerator generator);
}
