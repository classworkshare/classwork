/**
 * @author You
 *
 *         電話機クラス
 */
class Phone {
	String model; 							// 機種
	String contract; 						// 契約者
	String telNum; 							// 番号
	int price; 								// 料金
	static final String MAKER = "(株)ABC"; 	// 製造会社名 (株)ABC
	static final int AT_APRICE = 10; 		// 単位時間当たりの加算額

	/**
	 * コンストラクタ 契約者名と番号を受け取り、フィールドに設定し 機種を設定する
	 * 
	 * @param contract 契約者名
	 * @param telNum   番号
	 */
	Phone(String contract, String telNum) {
		this.contract = contract; 			// 契約者を設定
		this.telNum = telNum; 				// 番号を初期設定
		price = 0; 							// 初期料金を0に設定
		model = "PHONE-001"; 				// 機種をPHONE-001に設定
	}

	/**
	 * 「電話する」メソッド
	 * 
	 * @return void
	 */
	public void call() {
		System.out.println("もしもし － はいはい");
		price = price + AT_APRICE; 			// 料金に単価を加算
	}
}