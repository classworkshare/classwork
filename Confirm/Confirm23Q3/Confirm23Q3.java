public class Confirm23Q3 {
	
	public static void main(String[] args) {
		Confirm23Q3 instA;
		int result = 0;
		
		instA = new Confirm23Q3();
		
		try {
			result = instA.multiply(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		} catch (Exception e) {
			System.out.println("数字ではない値が渡されました");
		}
		
		System.out.println("数値１[" + args[0] + "]");
		System.out.println("数値２[" + args[1] + "]");
		System.out.println("乗算結果[" + result + "]");
	}

	private int multiply(int no1, int no2) {
		return (no1 * no2);
	}
}