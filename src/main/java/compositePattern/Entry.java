package compositePattern;

/**
 * @description: 表示目录条目的抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 10:39
 */
public abstract class Entry {
	/**
	 * description 获取名字
	 *
	 * @return String 名字
	 **/
	public abstract String getName();

	/**
	 * description 获取大小
	 *
	 * @return int 大小
	 **/
	public abstract int getSize();

	/**
	 * description 加入目录条目
	 **/
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	/**
	 * description 显示目录条目一览
	 **/
	public void printList() {
		printList("");
	}

	/**
	 * description 显示目录条目一览
	 *
	 * @param prefix 前缀
	 **/
	protected abstract void printList(String prefix);

	/**
	 * description 显示代表类文字
	 **/
	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
