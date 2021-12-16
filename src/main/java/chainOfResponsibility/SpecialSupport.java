package chainOfResponsibility;

/**
 * @description: 只解决指定编号的问题
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 16:11
 */
public class SpecialSupport extends Support {
	private int number;

	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return trouble.getNumber() == number;
	}
}
