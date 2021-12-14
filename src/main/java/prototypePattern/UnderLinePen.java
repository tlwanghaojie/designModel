package prototypePattern;

/**
 * @description:
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 18:21
 */
public class UnderLinePen implements Product, Cloneable {
	private char unChar;

	public UnderLinePen(char unChar) {
		this.unChar = unChar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.println(" ");
		for (int i = 0; i < length; i++) {
			System.out.print(unChar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
