package statePattern;

/**
 * @description: 表示金库状态的接口
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 10:21
 */
public interface State {
	/**
	 * description 设置时间
	 *
	 * @param context 金库状态
	 * @param hour 时间
	 **/
	void doClock(Context context, int hour);

	/**
	 * description 使用金库
	 *
	 * @param context 金库状态
	 **/
	void doUse(Context context);

	/**
	 * description 按下警铃
	 *
	 * @param context 金库状态
	 **/
	void doAlarm(Context context);

	/**
	 * description 正常通话
	 *
	 * @param context 金库状态
	 **/
	void doPhone(Context context);
}
