package builderPattern;

/**
 * @description: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/15 13:57
 */
public class Main {
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}
		if ("plain".equals(args[0])) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			String result = textBuilder.getResult();
			System.out.println(result);
		} else if ("html".equals(args[0])) {
			HtmlBuilder htmlBuilder = new HtmlBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			String fileName = htmlBuilder.getResult();
			System.out.println(fileName + " 文件编写完成");
		} else {
			usage();
			System.exit(0);
		}
	}

	public static void usage() {
		System.out.println("Usage: java Main plain    编写纯文本文档");
		System.out.println("Usage: java Main html    编写html文档");
	}
}
