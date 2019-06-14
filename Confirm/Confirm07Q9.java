
public class Confirm07Q9 {

	public static void main(String[] args) {
		int[] score = {57, 60, 89, 32, 66, 77, 92, 45};
		int max, min;
		
		max = 0;
		min = 100;
		for(int num : score) {
			if(num < min) {
				min = num;
			}
			if(num > max) {
				max = num;
			}
		}
		
	}

}
