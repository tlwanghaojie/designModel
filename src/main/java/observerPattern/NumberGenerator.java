package observerPattern;

import java.util.ArrayList;

/**
 * @description: 生成数值对象的抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 16:49
 */
public abstract class NumberGenerator {
	/**
	 * description 保存observer们
	 * **/
	private ArrayList observers = new ArrayList();

	/**
	 * description 注册observer
	 **/
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * description 删除observer
	 **/
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * description 向observer发送通知
	 **/
	public void notifyObservers() {
		for (Object observer : observers) {
			Observer o = (Observer) observer;
			o.update(this);
		}
	}

	/**
	 * description 获取数值
	 *
	 * @return int 数值
	 **/
	public abstract int getNumber();

	/**
	 * description 生成数值
	 **/
	public abstract void execute();
}
