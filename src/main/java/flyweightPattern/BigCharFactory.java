package flyweightPattern;

import java.util.HashMap;

/**
 * @description: 生成共用BigChar类的实例的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 13:53
 */
public class BigCharFactory {
	/**
	 * description 管理已经生成的BigChar类
	 **/
	private HashMap pool = new HashMap();

	/**
	 * description Singleton模式
	 **/
	private static BigCharFactory singleton = new BigCharFactory();

	/**
	 * description 构造函数
	 **/
	public BigCharFactory() {
	}

	/**
	 * description 获取唯一的实例
	 **/
	public static BigCharFactory getInstance() {
		return singleton;
	}

	/**
	 * description 生成（共享）BigChar类的实例
	 **/
	public synchronized BigChar getBigChar(char charName) {
		BigChar bc = (BigChar) pool.get("" + charName);
		if (bc == null) {
			// 生成BigChar实例
			bc = new BigChar(charName);
			pool.put("" + charName, bc);
		}
		return bc;
	}
}
