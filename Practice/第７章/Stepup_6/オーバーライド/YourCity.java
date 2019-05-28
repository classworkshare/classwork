import pack1.Phone;
import pack1.Smartphone;

/**
 * @author You
 *
 *         架空の居住空間クラス（オーバーライド対応）
 */
class YourCity {
	/**
	 * mainメソッド
	 */
	public static void main(String args[]) {
		Phone he;
		Smartphone she;
		int i;
		
		he = new Phone("太郎", "000-000-0000"); // 電話生成
		she = new Smartphone("花子", "090-1111-1111", "ZZZ@zzz.ne.jp"); // メール付きスマートフォン生成
		
		for (i = 0; i < 2; i++) { 					// heの電話を２回かける
			he.call();
		}
		for (i = 0; i < 3; i++) { 					// sheの電話を３回かける
			she.call();
		}
		
		she.mail(); 								// sheで普通にメール
		she.mail("send"); 							// sheで送信指定でメール
		she.mail("receive"); 						// sheで受信指定でメール
		she.mail("send", 2); 						// sheで２通の送信指定でメール
		she.mail("receive", 3); 					// sheで３通の受信指定でメール
		
		int price = he.getPrice();
		System.out.println("heの電話料金 ：" + price);
		
		price = she.getPrice();
		System.out.println("sheの電話料金：" + price);
		
		price = she.getPacketPrice();
		System.out.println("sheのパケット料金：" + price);
		
		he.clearPrice(); 							// heで料金クリアメソッド呼び出し
		she.clearPrice(); 							// sheで料金クリアメソッド呼び出し
		
		price = he.getPrice();
		System.out.println("heの電話料金 ：" + price);
		
		price = she.getPrice();
		System.out.println("sheの電話料金：" + price);
		
		price = she.getPacketPrice();
		System.out.println("sheのパケット料金：" + price);
	}
}