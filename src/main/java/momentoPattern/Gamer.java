package momentoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description: 表示游戏主人公的类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 17:31
 */
public class Gamer {
	/**
	 * description 所持金钱
	 **/
	private int money;

	/**
	 * description 获得的水果
	 **/
	private List fruits = new ArrayList();

	/**
	 * description 随机数生成器
	 **/
	private Random random = new Random();

	/**
	 * description 表示水果种类的数组
	 **/
	private static String[] fruitsName = {
			"苹果", "葡萄", "香蕉", "橘子",
	};

	/**
	 * description 构造函数
	 **/
	public Gamer(int money) {
		this.money = money;
	}

	/**
	 * description 获得当前所持的金钱
	 *
	 * @return int
	 **/
	public int getMoney() {
		return money;
	}

	/**
	 * description 投掷骰子进行游戏
	 **/
	public void bet() {
		int dice = random.nextInt(6) + 1;
		if (dice == 1) {
			money += 100;
			System.out.println("所持金钱增加了。");
		} else if (dice == 2) {
			money /= 2;
			System.out.println("所持金额减半了。");
		} else if (dice == 6) {
			String f = getFruit();
			System.out.println("获得了水果(" + f + ")。");
			fruits.add(f);
		} else {
			System.out.println("什么都没有发生。");
		}
	}

	/**
	 * description 拍摄快照
	 *
	 * return momentoPattern.Momento
	 **/
	public Momento createMomento() {
		Momento m = new Momento(money);
		for (Object fruit : fruits) {
			String f = (String) fruit;
			if (f.startsWith("好吃的")) {
				m.addFruit(f);
			}
		}
		return m;
	}

	/**
	 * description 撤销
	 **/
	public void restoreMomento(Momento momento) {
		this.money = momento.money;
		this.fruits = momento.getFruits();
	}

	@Override
	public String toString() {
		return "[" + "money = " + money +
				", fruits = " + fruits + "]";
	}

	private String getFruit() {
		String prefix = "";
		if (random.nextBoolean()) {
			prefix = "好吃的";
		}
		return prefix + fruitsName[random.nextInt(fruitsName.length)];
	}
}
