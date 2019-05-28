package package1;

import package1.package2.Addition;

public class Practice502_01 {
	public static void main(String[] args) {
		int val1, val2;
		int result;
		Addition inst;
		
		val1 = 10;
		val2 = 20;
		inst = new Addition();
		
		result = inst.calc(val1, val2);
		System.out.println("“š‚¦‚Í " + result);
	}
}