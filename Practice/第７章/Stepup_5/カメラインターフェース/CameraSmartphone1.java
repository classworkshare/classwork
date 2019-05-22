package pack1;

import pack3.Camera;

/**
 * @author You
 *
 *         カメラ付きスマートフォンクラス ①
 */
public class CameraSmartphone1 extends SmartphoneGame1 implements Camera {
	/**
	 * コンストラクタ 契約者名・電話番号・メールアドレスを受け取り、
	 * フィールドに設定する 引数による項目の設定は親のコンストラクタで行う
	 * 機種に”CAMERA-001”を設定する
	 * 
	 * @param contract    契約者名
	 * @param telNum      電話番号
	 * @param mailAddress メールアドレス
	 */
	public CameraSmartphone1(String contract, String telNum, String mailAddress) {
		super(contract, telNum, mailAddress); 		// 親のコンストラクタ呼出
		model = "CAMERA-001";
	}

	/**
	 * カメラ撮影メソッド
	 * 
	 * @return void
	 */
	public void takePicture() {
		System.out.println("シャッターを『カシャッ』と切りました");
	}
}