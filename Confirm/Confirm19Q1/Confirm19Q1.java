public class Confirm19Q1 {
	
	public static void main(String[] args) {
		int total = 0;
		Fruit f1, f2, f3;
		
		f1 = new Fruit("りんご", 100);
		f2 = new Fruit("みかん", 50);
		f3 = new Fruit("ぶどう", 200);
		
		total = f1.buy(3) + f2.buy(6) + f3.buy(2);
		System.out.println("合計は" + total + "円です。");
	}
}