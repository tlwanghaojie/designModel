package momentoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 表示Gamer状态的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 17:27
 */
public class Momento implements Cloneable {
	/**
	 * description 所持金钱
	 **/
	int money;

	/**
	 * description 获得的水果
	 **/
	ArrayList fruits;

	public int getMoney() {
		return money;
	}

	public Momento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
	}

	/**
	 * description 添加水果
	 *
	 * @param fruit 水果
	 **/
	public void addFruit(String fruit) {
		fruits.add(fruit);
	}

	List getFruits() {
		return (List) fruits.clone();
	}
}
