/**
 * @author You
 *
 *         架空の居住空間を表現したクラス（アクセッサ対応）
 */
class YourCity {
	/**
	 * mainメソッド
	 */
	public static void main(String[] args) {
		Phone he;
		int i;
		he = new Phone("太郎", "000-000-0000"); // heの電話生成
		for (i = 0; i < 3; i++) { // heの電話を３回かける
			he.call();
		}
		int price = he.getPrice(); // 電話料金取得
		System.out.println("電話料金<クリア前>：" + price);
		he.clearPrice(); // 電話料金クリア
		price = he.getPrice();
		System.out.println("電話料金<クリア後>：" + price);
		String telNum = he.getTelNum(); // 電話番号取得
		System.out.println("電話番号<変更前>：" + telNum);
		he.setTelNum("222-222-2222"); // 電話番号設定
		telNum = he.getTelNum();
		System.out.println("電話番号<変更後>：" + telNum);
		System.out.println("会社名：" + he.MAKER); // 会社名表示
		String model = he.getModel(); // 機種取得・表示
		System.out.println("機種：" + model);
		String contract = he.getContract(); // 契約者取得・表示
		System.out.println("契約者：" + contract);
	}
}