public class Product {
	public int itemNo;
	public String name;
	public int price;

	public void display() {
		System.out.println("商品番号は：" + itemNo);
		System.out.println("商品名は　：" + name);
		System.out.println("商品価格は：" + price);
	}
}