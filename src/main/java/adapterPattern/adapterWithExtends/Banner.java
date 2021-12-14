package adapterPattern.adapterWithExtends;

/**
 * @description: 现在的实际情况
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 15:19
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
