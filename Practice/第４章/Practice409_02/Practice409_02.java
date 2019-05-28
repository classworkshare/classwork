public class Practice409_02 {
	public static void main(String[] args) {
		
		String clothWash = "シャツ";
		Laundry1 inst1;
		Laundry2 inst2;
		
		inst1 = new Laundry1();
		inst2 = new Laundry2();
		
		System.out.println("Lundry1で洗濯します。");
		inst1.wash(clothWash);
		
		System.out.println("Lundry2で洗濯します。");
		inst2.wash(clothWash);
	}
}