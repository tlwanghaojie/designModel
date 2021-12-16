package visitorPattern;

import iteratorPattern.Iterator;

/**
 * @description: 增加、显示目录条目
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 14:55
 */
public abstract class Entry implements Element {
	/**
	 * description 获取名字
	 *
	 * @return java.lang.String
	 **/
	public abstract String getName();

	/**
	 * description 获取大小
	 *
	 * @return int
	 **/
	public abstract int getSize();

	/**
	 * description 增加目录条目
	 *
	 * @param entry 目录条目
	 * @return visitorPattern.Entry
	 **/
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	/**
	 * description 生成Iterator
	 *
	 * @return iteratorPattern.Iterator
	 **/
	public Iterator iterator() throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	/**
	 * description 显示字符串
	 **/
	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
