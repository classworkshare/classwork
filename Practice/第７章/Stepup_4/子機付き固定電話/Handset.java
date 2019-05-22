package pack1;

/**
 * @author You
 *
 *         子機付き固定電話クラス
 */
public class Handset extends Phone {
	private int handsetNo; 							// 子機数

	/**
	 * コンストラクタ 契約者名・電話番号・子機数を受け取り、フィールドに設定する
	 * 契約者名・電話番号の設定は親のコンストラクタで行う
	 * 最後に機種に”HANDSET-001”を設定する
	 * 
	 * @param contract  契約者名
	 * @param telNum    電話番号
	 * @param handsetNo 子機数
	 */
	public Handset(String contract, String telNum, int handsetNo) {
		super(contract, telNum); 					// 親のコンストラクタ呼出し
		this.handsetNo = handsetNo; 				// 子機数の設定
		this.model = "HANDSET-001"; 				// 機種の設定
	}

	/**
	 * 内線電話をかけるメソッド 子機数以上の番号が渡されたらエラーを表示する
	 * 
	 * @param handsetExtens 子機番号
	 * @return void
	 */
	public void extens(int handsetExtens) {
		if (handsetExtens > handsetNo) {
			System.out.println("その番号の子機はありません");
		} else {
			System.out.println(handsetExtens + "番の子機と内線通話しました");
		}
	}

	/**
	 * 子機数GETメソッド
	 * 
	 * @return 子機数
	 */
	public int getHandsetNo() {
		return handsetNo;
	}

	/**
	 * 子機数SETメソッド
	 * 
	 * @return void
	 */
	public void setHandsetNo(int handsetNo) {
		this.handsetNo = handsetNo;
	}
}