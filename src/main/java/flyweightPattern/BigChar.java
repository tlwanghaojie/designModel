package flyweightPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description: 大型字符
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 13:52
 */
public class BigChar {
	/**
	 * description 字符名字
	 **/
	private char charName;

	/**
	 * description 大型字符对应的字符串（由'#'，'.'，'\n'组成）
	 **/
	private String fontData;

	public BigChar(char charName) {
		this.charName = charName;
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("G:\\exercisecode\\designPattern\\src\\main\\java\\flyweightPattern\\big" + charName + ".txt")
			);
			String line;
			StringBuffer buffer = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
				buffer.append("\n");
			}
			reader.close();
			this.fontData = buffer.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * description 显示大型字符
	 **/
	public void print() {
		System.out.println(fontData);
	}
}
