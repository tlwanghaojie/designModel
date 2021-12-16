package chainOfResponsibility;

/**
 * @description: 不解决问题的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 16:05
 */
public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		return false;
	}
}
