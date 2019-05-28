public class Practice404_02 {
	public static void main(String[] args) {
		
		int val1, val2, result;
		char arithm;
		FourArithm instA;
		
		val1 = Integer.parseInt(args[0]);
		val2 = Integer.parseInt(args[1]);
		arithm = args[2].charAt(0);
		
		instA = new FourArithm();
		
		result = instA.calc(val1, val2, arithm);
		System.out.println("“š‚¦‚Í" + result);
	}
}