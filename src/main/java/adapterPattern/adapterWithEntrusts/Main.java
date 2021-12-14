package adapterPattern.adapterWithEntrusts;

/**
 * @description: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/14 15:41
 */
public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeek();
		p.printStrong();
	}
}
