public class Confirm10Q1 {
	public static void main(String[] args) {
		int result;
		int num = 100;
		Confirm10Q1 instA;
		
		instA = new Confirm10Q1();
		
		result = instA.duplicate(num);
		System.out.println("“n‚µ‚½”’l[" + num + "]‚Ì”{”‚Í" + result);
	}
	
	public int duplicate(int num) {
		return (num * 2);
	}
}