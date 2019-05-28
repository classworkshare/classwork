import pack1.SmartphoneGame1;
import pack1.SmartphoneGame2;

/**
 * @author You
 *
 *         架空の居住空間クラス（ゲーム付きスマートフォン対応）
 */
public class YourCityTest {
	/**
	 * mainメソッド
	 */
	public static void main(String[] args) {
		SmartphoneGame1	 he;
		SmartphoneGame2	 she;
		int				 i;
		
		he = new SmartphoneGame1("太郎", "080-0000-0000", "XXX@xxx.ne.jp"); // ゲーム付きスメートフォン生成
		she = new SmartphoneGame2("花子", "090-0000-0000", "ZZZ@zzz.ne.jp");
		
		for (i = 0; i < 2; i++) {
			he.call(); 								// heの電話を２回かける
		}
		
		for (i = 0; i < 2; i++) {
			he.mail(); 								// heのメールを２回実施
		}
		
		for (i = 0; i < 2; i++) {
			he.playGame(); 							// heのゲームで２回遊ぶ
		}
		
		for (i = 0; i < 3; i++) {
			she.call(); 							// sheの電話を３回かける
		}
		
		for (i = 0; i < 3; i++) {
			she.mail(); 							// sheのメールを３回実施
		}
		
		for (i = 0; i < 3; i++) {
			she.playGame(); 						// sheのゲームで３回遊ぶ
		}
		
		System.out.println("インスタンス[he]の情報 ： " + he.MAKER + " " + he.getModel() + " " + he.getContract() + " "
				+ he.getTelNum() + " " + he.getPrice() + " " + he.getMailAddress() + " " + he.getPacketPrice());
		System.out.println("インスタンス[she]の情報： " + she.MAKER + " " + she.getModel() + " " + she.getContract() + " "
				+ she.getTelNum() + " " + she.getPrice() + " " + she.getMailAddress() + " " + she.getPacketPrice());
	}
}