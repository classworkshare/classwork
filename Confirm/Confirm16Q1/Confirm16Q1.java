public class Confirm16Q1 {
	
	public static void main(String[] args) {
		GasStation instA = new GasStation();
		Convenience instB = new Convenience();
		CDshop instC = new CDshop();
		
		instA.calculate(3);
		instA.display();
		instB.calculate(4);
		instB.display();
		instC.calculate(2);
		instC.display();
	}
}