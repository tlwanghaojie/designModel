package visitorPattern;

/**
 * @description: 文件类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 15:14
 */
public class File extends Entry {
	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
