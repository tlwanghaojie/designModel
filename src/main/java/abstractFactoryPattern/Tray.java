package abstractFactoryPattern;

import java.util.ArrayList;

/**
 * @description: 一个含有多个Link类和Tray类的容器
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 14:49
 */
public abstract class Tray extends Item {
	protected ArrayList tray = new ArrayList();

	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		tray.add(item);
	}
}
