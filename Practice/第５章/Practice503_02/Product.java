public class Product {
	private int itemNo;
	private String name;
	private int price;

	public void display() {
		System.out.println("商品番号は：" + itemNo);
		System.out.println("商品名は　：" + name);
		System.out.println("商品価格は：" + price);
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getItemNo() {
		return this.itemNo;
	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}
}