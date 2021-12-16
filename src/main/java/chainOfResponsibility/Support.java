package chainOfResponsibility;

/**
 * @description: 解决问题的抽象类
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/16 15:54
 */
public abstract class Support {
	/**
	 * description 解决问题的实例的名字
	 **/
	private String name;

	/**
	 * description 要推卸给的对象
	 **/
	private Support next;

	/**
	 * description 生成解决问题的实例
	 **/
	public Support(String name) {
		this.name = name;
	}

	/**
	 * description 设置要推卸给的对象
	 **/
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	/**
	 * description 解决问题的步骤
	 **/
	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	/**
	 * description 解决问题的办法
	 *
	 * @param trouble 问题
	 * @return boolean
	 **/
	protected abstract boolean resolve(Trouble trouble);

	/**
	 * description 解决
	 **/
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + ".");
	}

	/**
	 * description 未解决
	 **/
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}
}
