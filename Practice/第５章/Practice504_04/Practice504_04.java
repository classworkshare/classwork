public class Practice504_04 {
	public static void main(String[] args) {
		int i, result;
		
		for (i = 2; i >= -2; i--) {
			try {
				result = 100 / i;
				System.out.println(result);
			} catch (ArithmeticException excep1) {
				System.out.println("‰‰ZƒGƒ‰[‚Å‚·");
			}
		}
	}
}