package visitorPattern;

import iteratorPattern.Iterator;

/**
 * @description:
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 15:20
 */
public class ListVisitor extends Visitor {
	/**
	 * description 当前访问文件夹的名字
	 **/
	private String currentDir = "";

	/**
	 * description 在访问文件时被调用
	 **/
	@Override
	public void visit(File file) {
		System.out.println(currentDir + "/" + file);
	}

	/**
	 * description 在访问文件夹时被调用
	 **/
	@Override
	public void visit(Directory directory) {
		System.out.println(currentDir + "/" + directory);
		String saveDir = currentDir;
		currentDir = currentDir + "/" + directory.getName();
		Iterator it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(this);
		}
		currentDir = saveDir;
	}
}
