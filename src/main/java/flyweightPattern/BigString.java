package flyweightPattern;

import java.util.Arrays;

/**
 * @description: 多个BigChar组成的大型字符串类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 13:54
 */
public class BigString {
	/**
	 * description 大型字符的数组
	 **/
	private BigChar[] bigChars;

	/**
	 * description 构造函数
	 **/
	public BigString(String string) {
		bigChars = new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i = 0; i < bigChars.length; i++) {
			bigChars[i] = factory.getBigChar(string.charAt(i));
		}
	}

	/**
	 * description 显示
	 **/
	public void print() {
		Arrays.stream(bigChars).forEach(BigChar::print);
	}
}
