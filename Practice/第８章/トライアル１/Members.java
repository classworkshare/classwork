
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 会員管理画面
 *
 * 会員情報の「一覧表示」「更新」「挿入」「削除」を選択する
 * 終了する場合は「終了」を選択する。
 */
public class Members extends JFrame {

	private JButton listButton = new JButton("一覧表示");
	private JButton updateButton = new JButton("更新");
	private JButton insertButton = new JButton("挿入");
	private JButton deleteButton = new JButton("削除");
	private JButton exitButton = new JButton("終了");

	/**
	 * コンストラクタ
	 *
	 * 会員管理画面の内容を設定する
	 */
	public Members() {

		super("会員管理画面");

		setLocation(400, 400);
		setSize(300, 300);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(3, 2, 5, 5);
		container.setLayout(gridLayout);

		container.add(listButton);
		container.add(updateButton);
		container.add(insertButton);
		container.add(deleteButton);
		container.add(exitButton);

	}
}
