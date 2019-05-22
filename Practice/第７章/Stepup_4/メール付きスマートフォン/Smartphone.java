package pack1;

/**
 * @author You
 *
 *         メール付きスマートフォンクラス
 */
public class Smartphone extends Phone {
	private String mailAddress; 					// メールアドレス
	private int packetPrice; 						// パケット料金
	public static final int PACKET_AT_APRICE = 1; 	// １パケット当たりの加算額

	/**
	 * コンストラクタ 契約者名・電話番号・メールアドレスを受け取り、
	 * フィールドに設定する 契約者名・電話番号の設定は親のコンストラクタで行う
	 * 機種に”S_PHONE-001”を設定する
	 * 
	 * @param contract    契約者名
	 * @param telNum      電話番号
	 * @param mailAddress メールアドレス
	 */
	public Smartphone(String contract, String telNum, String mailAddress) {
		super(contract, telNum); 					// 親のコンストラクタ呼び出し
		this.mailAddress = mailAddress; 			// メールアドレス設定
		packetPrice = 0; 							// パケット料金を0に設定
		model = "S_PHONE-001";						// 機種設定
	}

	/**
	 * メールをやり取りするメソッド
	 * 
	 * @return パケット料金
	 */
	public int mail() {
		System.out.println("メールをしました");
		packetPrice = packetPrice + PACKET_AT_APRICE * 5; // 5パケット使用
		return packetPrice;
	}

	/**
	 * メールアドレスGETメソッド
	 * 
	 * @return メールアドレス
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * メールアドレスSETメソッド
	 * 
	 * @return void
	 */
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	/**
	 * パケット料金GETメソッド
	 * 
	 * @return パケット料金
	 */
	public int getPacketPrice() {
		return packetPrice;
	}
}