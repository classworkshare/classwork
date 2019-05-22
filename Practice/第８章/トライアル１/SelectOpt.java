
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 機能選択画面
 *
 * 「会員管理」「DVD管理」「貸出」「返却」の各機能を選択する。
 * 終了する場合は「終了」を選択する。
 */
public class SelectOpt extends JFrame implements ActionListener {

	private JButton memberButton = new JButton("会員管理");
	private JButton dvdsButton = new JButton("DVD管理");
	private JButton rentButton = new JButton("貸出");
	private JButton giveBackButton = new JButton("返却");
	private JButton exitButton = new JButton("終了");

	/**
	 * コンストラクタ
	 *
	 * 機能選択画面の内容を設定する
	 */
	public SelectOpt() {

		super("機能選択画面");

		setLocation(300, 300);
		setSize(300, 300);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(3, 2, 5, 5);
		container.setLayout(gridLayout);

		container.add(memberButton);
		container.add(dvdsButton);
		container.add(rentButton);
		container.add(giveBackButton);
		container.add(exitButton);

		// DVD管理ボタンを押した際の処理を追加
		memberButton.addActionListener(this);

	}

	/**
	 * ボタンを押した際の処理
	 *
	 * 会員管理ボタンが押された際、会員管理画面を表示する。
	 *
	 * @param event イベント内容
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		// 会員管理画面を表示する
		Members members = new Members();
		members.setVisible(true);
	}
}
