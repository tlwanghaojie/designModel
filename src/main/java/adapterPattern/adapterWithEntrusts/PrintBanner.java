package adapterPattern.adapterWithEntrusts;

/**
 * @description: 使用委托的适配器类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 15:37
 */
public class PrintBanner extends Print {
	private Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeek() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
}
