public class Fruit {
	
	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int buy(int cnt) {
		return price * cnt;
	}
}