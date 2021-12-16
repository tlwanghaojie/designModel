package observerPattern;

/**
 * @description: 具有递增功能的数值生成类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 17:20
 */
public class IncrementalNumberGenerator extends NumberGenerator {
	/**
	 * description 当前数值
	 **/
	private int number;

	/**
	 * description 结束数值（不包含该值）
	 **/
	private int end;

	/**
	 * description 步长
	 **/
	private int inc;

	public IncrementalNumberGenerator(int number, int end, int inc) {
		this.number = number;
		this.end = end;
		this.inc = inc;
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void execute() {
		while (number < end) {
			notifyObservers();
			number += inc;
		}
	}
}
