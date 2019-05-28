public class Practice306_06 {
	public static void main(String[] args) {
		int times;
		int total;
		
		times = 1;
		total = 0;
		
		do {
			total = total + times;
			times++;
		} while (times <= 100);
		System.out.println(total);
	}
}