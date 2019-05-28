import pack1.Handset;

/**
 * @author You
 *
 *         架空の居住空間を表現したクラス（子機付き固定電話対応）
 */
class YourCity {
	/**
	 * mainメソッド
	 */
	public static void main(String[] args) {
		Handset he;
		int i;
		
		he = new Handset("太郎", "000-000-0000", 3);// 子機が３つの電話生成
		
		for (i = 0; i < 3; i++) { 					// ３回電話
			he.call();
		}
		
		int price = he.getPrice(); 					// 電話料金取得
		System.out.println("電話料金<クリア前>：" + price);
		
		he.clearPrice(); 							// 電話料金クリア
		
		price = he.getPrice();
		System.out.println("電話料金<クリア後>：" + price);
		
		String telNum = he.getTelNum(); 			// 電話番号取得
		System.out.println("電話番号<変更前>：" + telNum);
		
		he.setTelNum("222-222-2222"); 				// 電話番号設定
		
		telNum = he.getTelNum();
		System.out.println("電話番号<変更後>：" + telNum);
		
		for (i = 1; i < 6; i++) { 					// ５回の内線通話
			he.extens(i);
		}
		
		int handsetNo = he.getHandsetNo(); 			// 子機数取得
		System.out.println("子機数<変更前>  ：" + handsetNo);
		
		he.setHandsetNo(5); 						// 子機数を５台に変更
		
		handsetNo = he.getHandsetNo(); 				// 子機数取得
		System.out.println("子機数<変更後>  ：" + handsetNo);
		
		System.out.println("会社名：" + he.MAKER); 	// 会社名表示
		
		String model = he.getModel(); 				// 機種取得・表示
		System.out.println("機種：" + model);
		
		String contract = he.getContract(); 		// 契約者取得・表示
		System.out.println("契約者：" + contract);
	}
}