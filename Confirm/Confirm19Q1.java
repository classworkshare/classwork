public class Confirm19Q1 {
	
	public static void main(String[] args) {
		int total = 0;
		Fruit f1, f2, f3;
		
		f1 = new Fruit("���", 100);
		f2 = new Fruit("�݂���", 50);
		f3 = new Fruit("�Ԃǂ�", 200);
		
		total = f1.buy(3) + f2.buy(6) + f3.buy(2);
		System.out.println("���v��" + total + "�~�ł��B");
	}
}