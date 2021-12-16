package visitorPattern;

import java.util.ArrayList;

/**
 * @description: 目录类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 15:16
 */
public class Directory extends Entry {
	private String name;
	private ArrayList dir = new ArrayList();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (Object o : dir) {
			Entry entry = (Entry) o;
			size += entry.getSize();
		}
		return size;
	}

	@Override
	public Entry add(Entry entry) {
		dir.add(entry);
		return this;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
