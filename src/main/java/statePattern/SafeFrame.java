package statePattern;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @description: 持有按钮和画面显示等UI信息
 * @projectName:designModel
 * @author:WangHaojie
 * @createTime:2021/12/17 10:24
 */
public class SafeFrame extends Frame implements ActionListener, Context {
	/**
	 * description 显示当前时间
	 **/
	private TextField textClock = new TextField(60);

	/**
	 * description 显示警报中心的记录
	 **/
	private TextArea textScreen = new TextArea(10, 60);

	/**
	 * description 使用金库按钮
	 **/
	private Button buttonUse = new Button("使用金库");

	/**
	 * description 按下警铃按钮
	 **/
	private Button buttonAlarm = new Button("按下警铃");

	/**
	 * description 正常通话按钮
	 **/
	private Button buttonPhone = new Button("正常通话");

	/**
	 * description 结束按钮
	 **/
	private Button buttonExit = new Button("结束按钮");

	/**
	 * description 当前的状态
	 **/
	private State state = DayState.getInstance();

	public SafeFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		add(panel, BorderLayout.SOUTH);
		pack();
		show();
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		if (e.getSource() == buttonUse) {
			state.doUse(this);
		} else if (e.getSource() == buttonAlarm) {
			state.doAlarm(this);
		} else if (e.getSource() == buttonPhone) {
			state.doPhone(this);
		} else if (e.getSource() == buttonExit) {
			System.exit(0);
		} else {
			System.out.println("?");
		}
	}

	@Override
	public void setClock(int hour) {
		String clockString = "现在时间是";
		if (hour < 10) {
			clockString += "0" + hour + ":00";
		} else {
			clockString += hour + ":00";
		}
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		System.out.println("从" + this.state + "状态变为了" + state + "状态。");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("call!" + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		textScreen.append("record..." + msg + "\n");
	}
}
