package chainOfResponsibility;

/**
 * @description: 解决奇数编号的问题
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 16:08
 */
public class OddSupport extends Support {
	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return trouble.getNumber() % 2 == 1;
	}
}
