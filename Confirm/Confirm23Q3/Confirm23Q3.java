public class Confirm23Q3 {
	
	public static void main(String[] args) {
		Confirm23Q3 instA;
		int result = 0;
		
		instA = new Confirm23Q3();
		
		try {
			result = instA.multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		} catch (Exception e) {
			System.out.println("”š‚Å‚Í‚È‚¢’l‚ª“n‚³‚ê‚Ü‚µ‚½");
		}
		
		System.out.println("”’l‚P[" + args[0] + "]");
		System.out.println("”’l‚Q[" + args[1] + "]");
		System.out.println("æZŒ‹‰Ê[" + result + "]");
	}

	private int multiply(int no1, int no2) {
		return (no1 * no2);
	}
}