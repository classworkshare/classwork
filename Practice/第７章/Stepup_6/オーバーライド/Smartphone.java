package pack1;

/**
 * @author You
 *
 *         メール付きスマートフォンクラス（オーバーライド）
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
		super(contract, telNum); 					// 親のコンストラクタ呼出
		this.mailAddress = mailAddress; 			// メールアドレス設定
		packetPrice = 0; 							// パケット料金を0に設定
		model = "S_PHONE-001"; 						// 機種設定
	}

	/**
	 * メールをやり取りするメソッド ①
	 * 
	 * @return パケット料金
	 */
	public int mail() {
		System.out.println("メールをしました");
		packetPrice = packetPrice + PACKET_AT_APRICE * 5; // 5パケット使用
		return packetPrice;
	}

	/**
	 * メールをやり取りするメソッド ②
	 * 
	 * @param status send(送信)／receive(受信)
	 * @return パケット料金
	 */
	public int mail(String status) {
		System.out.println("メールを" + status + "しました");
		packetPrice = packetPrice + PACKET_AT_APRICE * 5; // 5パケット使用
		return packetPrice;
	}

	/**
	 * メールをやり取りするメソッド ③
	 * 
	 * @param status send(送信)／receive(受信)
	 * @param times  実行する回数
	 * @return パケット料金
	 */
	public int mail(String status, int times) {
		int i;
		for (i = 0; i < times; i++) {
			System.out.println((i + 1) + "通目のメールを" + status + "しました");
			packetPrice = packetPrice + PACKET_AT_APRICE * 5; // 5パケット使用
		}
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

	/**
	 * 料金クリアメソッド（親クラスのメソッドをオーバーライド）
	 * 
	 * @return void
	 */
	public void clearPrice() {
		super.clearPrice(); // 親のclearRyokiにより電話料金クリア
		packetPrice = 0; // 自パケット料金をクリア
	}

	/**
	 * 電話をかけるメソッド（親クラスのメソッドをオーバーライド）
	 * 
	 * @return void
	 */
	public void call() {
		System.out.print("アドレス帳で探しました ---> ");
		super.call(); // 親のcallにより電話をかける
	}
}