public class Practice413_02 {
	public static void main(String[] args) {
		
		System.out.println("２ずつ足す");
		Cumulation cumulation_2 = new Cumulation(2);
		cumulation_2.add();
		cumulation_2.add();
		cumulation_2.add();
		
		System.out.println("３ずつ足す");
		Cumulation cumulation_3 = new Cumulation(3);
		cumulation_3.add();
		cumulation_3.add();
		cumulation_3.add();
	}
}