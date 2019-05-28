public class Confirm19Q2 {
	
	public static void main(String args[]) {
		Country inst1, inst2, inst3;
		
		inst1 = new Country();
		inst2 = new Country("’†‘", 13.2);
		inst3 = new Country("ƒCƒ“ƒh", 11.0);
		
		inst1.show();
		inst2.show();
		inst3.show();
	}
}