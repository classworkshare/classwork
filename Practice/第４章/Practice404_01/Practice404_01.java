public class Practice404_01 {
	public static void main(String[] args) {
		
		int val1, val2, result;
		char arithm;
		FourArithm instA;
		
		val1 = 10;
		val2 = 20;
		arithm = 'æ';
		
		instA = new FourArithm();
		
		result = instA.calc(val1, val2, arithm);
		System.out.println("“š‚¦‚Í " + result);
	}
}