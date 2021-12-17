package statePattern;

/**
 * @description: 表示管理金库的状态，并与警报中心联系的接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 10:23
 */
public interface Context {
	/**
	 * description 设置时间
	 *
	 * @param hour 时间
	 **/
	void setClock(int hour);

	/**
	 * description 改变状态
	 *
	 * @param state 状态
	 **/
	void changeState(State state);

	/**
	 * description 联系警报中心
	 *
	 * @param msg 消息
	 **/
	void callSecurityCenter(String msg);

	/**
	 * description 在警报中心留下记录
	 *
	 * @param msg 消息
	 **/
	void recordLog(String msg);
}
