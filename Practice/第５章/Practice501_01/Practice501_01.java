package package1;

public class Practice501_01 {
	public static void main(String[] args) {

		int val1, val2;
		int result;
		package1.package2.Addition inst;
		
		val1 = 10;
		val2 = 20;
		inst = new package1.package2.Addition();
		
		result = inst.calc(val1, val2);
		System.out.println("“š‚¦‚Í " + result);
	}
}
