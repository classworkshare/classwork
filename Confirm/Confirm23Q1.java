public class Confirm23Q1 {
	
	public static void main(String[] args) {
		Confirm23Q1 instA;
		int result;
		
		instA = new Confirm23Q1();
		
		result = instA.multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		
		System.out.println("”’l‚P[" + args[0] + "]");
		System.out.println("”’l‚Q[" + args[1] + "]");
		System.out.println("æZŒ‹‰Ê[" + result + "]");
	}

	private int multiply(int no1, int no2) {
		return (no1 * no2);
	}
}