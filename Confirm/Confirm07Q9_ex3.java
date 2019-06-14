public class Confirm07Q9_ex3 {
	public static void main(String[] args) {
		int[] score = { 57, 60, 89, 32, 66, 77, 92, 45 };
		int max = 0;
		int min = 100;
		
		for (int n : score) {
			if (max < n) {
				max = n;
			}
			if (min > n) {
				min = n;
			}
		}
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
	}
}