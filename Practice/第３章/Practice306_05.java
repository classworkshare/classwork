public class Practice306_05 {
	public static void main(String[] args) {
		int times;
		int total;
		
		times = 1;
		total = 0;
		
		while (times <= 100) {
			total = total + times;
			times++;
		}
		System.out.println(total);
	}
}