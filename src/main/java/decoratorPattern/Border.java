package decoratorPattern;

/**
 * @description: 用于显示边框的抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 11:30
 */
public abstract class Border extends Display {
	/**
	 * description 表示被装饰物
	 **/
	protected Display display;

	/**
	 * description 在生成实例时通过参数指定被装饰物
	 **/
	protected Border(Display display) {
		this.display = display;
	}
}
