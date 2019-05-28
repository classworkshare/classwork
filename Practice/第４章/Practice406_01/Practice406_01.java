public class Practice406_01 {
	public static void main(String[] args) {
		
		int result1, result2;
		Mult m1, m2;
		
		m1 = new Mult(10);
		m2 = new Mult(100);
		
		result1 = m1.calc(5);
		System.out.println("‚P‚O”{‚µ‚½“š‚¦‚Í " + result1);
		m1.display();
		
		result2 = m2.calc(5);
		System.out.println("‚P‚O‚O”{‚µ‚½“š‚¦‚Í " + result2);
		m2.display();
	}
}