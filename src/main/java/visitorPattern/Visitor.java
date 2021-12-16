package visitorPattern;

/**
 * @description: 访问者的抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 14:50
 */
public abstract class Visitor {
	/**
	 * description 查看文件
	 *
	 * @param file 文件
	 **/
	public abstract void visit(File file);

	/**
	 * description 查看目录
	 *
	 * @param directory 目录
	 **/
	public abstract void visit(Directory directory);
}
