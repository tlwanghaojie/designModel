package adapterPattern.adapterWithExtends;

/**
 * @description: 需求接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 15:21
 */
public interface Print {
	/**
	 * description 弱输出
	 *
	 * @return void
	 **/
	void printWeek();

	/**
	 * description 强输出
	 *
	 * @return void
	 **/
	void printStrong();
}
