/**
 * @author You
 *
 *         電話クラス（アクセッサ追加）
 */
class Phone {
	protected String model; // 機種
	private String contract; // 契約者
	private String telNum; // 番号
	private int price; // 料金
	public static final String MAKER = "(株)ABC"; // 会社名 (株)ABC
	public static final int AT_APRICE = 10; // 単位時間当たりの加算額

	/**
	 * コンストラクタ 契約者名と番号を受け取り、フィールドに設定し 機種を設定する
	 * 
	 * @param contract 契約者名
	 * @param telNum   番号
	 */
	Phone(String contract, String telNum) {
		this.contract = contract; // 契約者を設定
		this.telNum = telNum; // 番号を初期設定
		price = 0; // 初期料金を0に設定
		model = "PHONE-001"; // 機種をPHONE-001に設定
	}

	/**
	 * 「電話する」メソッド
	 * 
	 * @return void
	 */
	void call() {
		System.out.println("もしもし － はいはい");
		price = price + AT_APRICE; // 料金に単価を加算
	}

	/**
	 * 機種GETメソッド
	 * 
	 * @return 機種
	 */
	String getModel() {
		return model;
	}

	/**
	 * 番号GETメソッド
	 * 
	 * @return 番号
	 */
	String getTelNum() {
		return telNum;
	}

	/**
	 * 番号SETメソッド
	 * 
	 * @param telNum 設定する番号
	 * @return void
	 */
	void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	/**
	 * 契約者GETメソッド
	 * 
	 * @return 契約者
	 */
	String getContract() {
		return contract;
	}

	/**
	 * 契約者SETメソッド
	 * 
	 * @param contract 契約者名
	 * @return void
	 */
	void setContract(String contract) {
		this.contract = contract;
	}

	/**
	 * 料金GETメソッド
	 * 
	 * @return 料金
	 */
	int getPrice() {
		return price;
	}

	/**
	 * 料金CLEARメソッド
	 * 
	 * @return void
	 */
	void clearPrice() {
		price = 0;
	}
}