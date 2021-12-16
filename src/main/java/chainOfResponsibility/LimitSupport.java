package chainOfResponsibility;

/**
 * @description: 解决编号小于limit值的问题
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 16:06
 */
public class LimitSupport extends Support {
	private int limit;

	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return trouble.getNumber() < limit;
	}
}
