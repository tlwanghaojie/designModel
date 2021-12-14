package adapterPattern.adapterWithExtends;

/**
 * @description: 使用继承的适配器类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 15:24
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeek() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
}
