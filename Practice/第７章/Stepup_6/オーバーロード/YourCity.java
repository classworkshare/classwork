import pack1.Smartphone;

/**
 * @author You
 *
 *         架空の居住空間クラス（オーバーロード対応）
 */
class YourCity {
	/**
	 * mainメソッド
	 */
	public static void main(String[] args) {
		Smartphone she;
		int i;
		she = new Smartphone("花子", "090-0000-0000", "ZZZ@zzz.ne.jp"); // メール付きスマートフォン生成
		she.mail(); 								// 通常の呼び出し
		she.mail("send"); 							// 送信の呼び出し
		she.mail("receive"); 						// 受信の呼び出し
		she.mail("send", 3); 						// ３通送信の呼び出し
		she.mail("receive", 3); 					// ３通受信の呼び出し
		int price = she.getPacketPrice();
		System.out.println("パケット料金：" + price);
	}
}