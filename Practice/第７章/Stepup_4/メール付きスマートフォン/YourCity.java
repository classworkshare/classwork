import pack1.Smartphone;

/**
 * @author You
 *
 *         架空の居住空間を表現したクラス（メール付きスマートフォン対応）
 */
public class YourCity {
	/**
	 * mainメソッド
	 */
	public static void main(String[] args) {
		Smartphone she;
		int i;
		
		she = new Smartphone("花子", "080-0000-0000", "XXX@xxx.ne.jp"); // スマートフォン生成
		
		for (i = 0; i < 3; i++) { 					// ３回電話をかける
			she.call();
		}
		
		int price = she.getPrice();
		System.out.println("電話料金<クリア前>：" + price);
		
		she.clearPrice();
		
		price = she.getPrice();
		System.out.println("電話料金<クリア後>：" + price);
		
		for (i = 0; i < 5; i++) { 					// ５回メールをする
			she.mail();
		}
		
		price = she.getPacketPrice();
		System.out.println("パケット料金：" + price);
		
		String mailAddress = she.getMailAddress();
		System.out.println("メールアドレス<変更前>：" + mailAddress);
		
		she.setMailAddress("ZZZ@ZZZ.ne.jp");
		
		mailAddress = she.getMailAddress();
		System.out.println("メールアドレス<変更後>：" + mailAddress);
		
		String telNum = she.getTelNum();
		System.out.println("電話番号：" + telNum);
		
		System.out.println("会社名：" + she.MAKER);
		
		String model = she.getModel();
		System.out.println("機種：" + model);
		
		String contract = she.getContract();
		System.out.println("契約者：" + contract);
	}
}