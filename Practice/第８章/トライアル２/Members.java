
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 会員管理画面
 *
 * 会員情報の「一覧表示」「更新」「挿入」「削除」を選択する
 * 終了する場合は「終了」を選択する。
 */
public class Members extends JFrame implements ActionListener {

	private JButton listButton = new JButton("一覧表示");
	private JButton updateButton = new JButton("更新");
	private JButton insertButton = new JButton("挿入");
	private JButton deleteButton = new JButton("削除");
	private JButton exitButton = new JButton("終了");

	private final String url;
	private final String userName;
	private final String password;

	/**
	 * コンストラクタ
	 *
	 * 会員管理画面の内容を設定する
	 *
	 * @param url データベース接続URL
	 * @param userName ユーザ名
	 * @param password パスワード
	 */
	public Members(String url, String userName, String password) {

		super("会員管理画面");

		// 機能選択画面からデータベースに接続するためのURLとユーザ名、パスワードを引き継ぐ
		this.url = url;
		this.userName = userName;
		this.password = password;

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

		// 一覧表示ボタンを押した際の処理を設定
		listButton.addActionListener(this);
	}

	/**
	 * ボタンを押した際の処理
	 *
	 * 全会員の情報ボタンが押された際、全会員の情報をコンソールに表示する
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {

		// 全会員の情報を取得するSQL
		String sql = "SELECT * FROM memberTb";

		// データベースに接続し、会員情報テーブルに登録されている全会員の情報を取得する
		try (Connection connection = DriverManager.getConnection(url, userName, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);) {

			// 見出し
			System.out.print("会員番号\t");
			System.out.print("氏名\t");
			System.out.print("電話番号\t");
			System.out.println("住所");

			// 会員の情報を1行ずつ表示する
			while (resultSet.next()) {
				System.out.print(resultSet.getString("number") + "\t"); // 会員番号
				System.out.print(resultSet.getString("name") + "\t"); // 氏名
				System.out.print(resultSet.getString("tel") + "\t"); // 電話番号
				System.out.println(resultSet.getString("address")); // 住所
			}

		} catch (SQLException e) {

			// エラーが発生した場合はエラー内容を出力する
			e.printStackTrace();
		}

	}
}
