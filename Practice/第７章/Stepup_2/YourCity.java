/**
 * @author You
 *
 *         架空の居住空間を表現したクラス
 */
class YourCity {
	/**
	 * mainメソッド
	 */
	public static void main(String[] args) {
		Phone he, she;
		
		he = new Phone("太郎", "000-000-0000"); 	// heの電話生成
		she = new Phone("花子", "111-111-1111"); 	// sheの電話生成
		
		System.out.println(
				"インスタンス[he]の情報 ： " + he.MAKER + " " + he.model + " " + he.contract + " " + he.telNum + " " + he.price);
		System.out.println("インスタンス[she]の情報： " + she.MAKER + " " + she.model + " " + she.contract + " " + she.telNum
				+ " " + she.price);
		
		he.call(); 									// heの電話を２回かける
		he.call();
		
		she.call(); 								// sheの電話を３回かける
		she.call();
		she.call();
		
		System.out.println("インスタンス[he]の契約者名は  " + he.contract + "です");
		System.out.println("インスタンス[he]の電話料金は  " + he.price + "です");
		System.out.println("インスタンス[she]の契約者名は " + she.contract + "です");
		System.out.println("インスタンス[she]の電話料金は " + she.price + "です");
	}
}