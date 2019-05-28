public class Practice410_01 {
	public static void main(String[] args) {
		
		Triangle inst1;
		Square inst2;
		
		inst1 = new Triangle();
		inst2 = new Square();
		
		System.out.println("éOäpå`");
		inst1.apexes = 3;
		inst1.showApexes();
		inst1.showArea(8, 4);
		
		System.out.println("éläpå`");
		inst2.apexes = 4;
		inst2.showApexes();
		inst2.showArea(8, 4);
	}
}