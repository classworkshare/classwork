public class Practice306_07 {
	public static void main(String[] args) {
		int[] src = {1,2,3,4,5,6,7,8,9,10};
		
		int total = 0;
		//ˆê”Ê“I‚Èfor•¶‚ğ—˜—p‚µ‚½ê‡
		for (int i = 0; i < 10; i++) {
			int n = src[i];
			total = total + n;
		}
		System.out.println(total);
		
		total = 0;
		//Šg’£for•¶‚ğ—˜—p‚µ‚½ê‡
		for (int n: src) {
			total = total + n;
		}
		System.out.println(total);
	}
}