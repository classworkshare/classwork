public class Confirm07Q9_ex1 {
	public static void main(String[] args) {
		int[] score = { 57, 60, 89, 32, 66, 77, 92, 45 };
		int max = 0;
		int min = 100;
		int i = 0;
		
		while (i < score.length) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}
			i++;
		}
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");
	}
}