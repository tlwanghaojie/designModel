package bridgePattern;

/**
 * @description:
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 16:30
 */
public class Display {
	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rawOpen();
	}

	public void print() {
		impl.rawPrint();
	}

	public void close() {
		impl.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}
