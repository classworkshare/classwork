
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * レンタルシステム
 *
 * システムの開始画面
 * データベースへ接続するためのユーザ名とパスワードを入力する。
 */
public class Rental extends JFrame implements ActionListener {

	/** ユーザ名のラベル */
	private JLabel userNameLabel = new JLabel("ユーザ名：", JLabel.RIGHT);

	/** ユーザ名の入力欄 */
	private JTextField userNameField = new JTextField();

	/** パスワードのラベル */
	private JLabel passwordLabel = new JLabel("パスワード：", JLabel.RIGHT);

	/** パスワードの入力欄 */
	private JPasswordField passwordField = new JPasswordField();

	/** 入力ボタン */
	private JButton inputButton = new JButton("入力");

	/**
	 * メインメソッド
	 *
	 * TODO 本文の説明内容
	 * プログラムを起動した際に最初に呼び出されるメソッド。
	 *
	 * @param args 起動時に指定した引数
	 */
	public static void main(String[] args) throws Exception {

		// レンタルシステムの開始画面（この画面）を表示する
		Rental rental = new Rental();
		rental.setDefaultCloseOperation(EXIT_ON_CLOSE);
		rental.setVisible(true);
	}

	/**
	 * コンストラクタ
	 *
	 * システムの開始画面の内容を設定している。
	 */
	public Rental() {

		// 画面のタイトルを指定
		super("データベース接続");

		// 表示する画面のサイズと位置を指定
		setLocation(200, 200);
		setSize(300, 150);

		Container container = getContentPane();

		GridLayout gridLayout = new GridLayout(4, 2);
		container.setLayout(gridLayout);

		// ユーザ名の入力欄
		container.add(userNameLabel);
		container.add(userNameField);
		// パスワードの入力欄
		container.add(passwordLabel);
		container.add(passwordField);

		// 入力ボタン
		container.add(inputButton);

		// 入力ボタンを押した際の処理を設定
		inputButton.addActionListener(this);
	}

	/**
	 * ボタンを押した際の処理
	 *
	 * 入力ボタンが押された際、機能選択画面を表示する。
	 *
	 * @param event イベント内容
	 */
	@Override
	public void actionPerformed(ActionEvent event) {

		// 機能選択画面を表示する
		SelectOpt selectOpt = new SelectOpt();
		selectOpt.setVisible(true);
	}
}
