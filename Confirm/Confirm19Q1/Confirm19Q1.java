public class Confirm19Q1 {
	
	public static void main(String[] args) {
		int total = 0;
		Fruit f1, f2, f3;
		
		f1 = new Fruit("ÇËÇÒÇ≤", 100);
		f2 = new Fruit("Ç›Ç©ÇÒ", 50);
		f3 = new Fruit("Ç‘Ç«Ç§", 200);
		
		total = f1.buy(3) + f2.buy(6) + f3.buy(2);
		System.out.println("çáåvÇÕ" + total + "â~Ç≈Ç∑ÅB");
	}
}