public class Practice306_09 {
	public static void main(String[] args) {
		int times;
		int totall;
		
		totall = 0;
		for (times = 1; times <= 100; times++) {
			if (times % 2 == 1) {
				continue;
			}
			totall = totall + times;
		}
		System.out.println(totall);
	}
}