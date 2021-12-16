package momentoPattern;

import java.time.Month;

/**
 * @description: 主方法
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 17:45
 */
public class Main {
	public static void main(String[] args) {
		// 所持金钱数为100
		Gamer gamer = new Gamer(100);
		// 保存最初的状态
		Momento momento = gamer.createMomento();
		for (int i = 0; i < 100; i++) {
			System.out.println("投骰子的次数：" + i);
			System.out.println("当前状态：" + gamer);
			// 开始游戏
			gamer.bet();
			System.out.println("所持金钱为" + gamer.getMoney() + "元。");
			if (gamer.getMoney() > momento.getMoney()) {
				System.out.println("（所持金钱增加了许多，因此保存游戏当前状态）");
				momento = gamer.createMomento();
			} else if (gamer.getMoney() < momento.getMoney()) {
				System.out.println("（所持金钱减少了许多，因此游戏恢复至以前的状态）");
				gamer.restoreMomento(momento);
			}
			// 等待一段时间
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ignored) {}
			System.out.println("");
		}
	}
}
