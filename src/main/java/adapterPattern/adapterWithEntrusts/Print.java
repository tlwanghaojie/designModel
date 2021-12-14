package adapterPattern.adapterWithEntrusts;

/**
 * @description: 需求抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 15:34
 */
public abstract class Print {
	/**
	 * description 弱输出
	 *
	 * @return void
	 **/
	public abstract void printWeek();

	/**
	 * description 强输出
	 *
	 * @return void
	 **/
	public abstract void printStrong();
}
