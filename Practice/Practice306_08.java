
public class Practice306_08 {

	public static void main(String[] args) {
		int times;
		int total;
		
		total = 0;
		
		for(times = 1 ; times <= 100 ; times++) {
			if(times > 50) {
				break;
			}
			
			total += times;
		}
		System.out.println(total);
	}

}
