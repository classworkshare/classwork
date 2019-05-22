package pack1;

import pack2.Game;

/**
 * @author You
 *
 *         ゲーム付きスマートフォンクラス �A
 */
public class SmartphoneGame2 extends Smartphone implements Game {
	/**
	 * コンストラクタ 契約者名・電話番号・メールアドレスを受け取り、
	 * フィールドに設定する 引数による項目の設定は親のコンストラクタで行う
	 * 機種に”GAME-001”を設定する
	 * 
	 * @param contract    契約者名
	 * @param telNum      電話番号
	 * @param mailAddress メールアドレス
	 */
	public SmartphoneGame2(String contract, String telNum, String mailAddress) {
		super(contract, telNum, mailAddress); // 親のコンストラクタ呼び出し
		model = "GAME-002";
	}

	/**
	 * ゲームメソッド
	 * 
	 * @return void
	 */
	public void playGame() {
		System.out.println("バーチャルライフゲームで遊びました");
	}
}