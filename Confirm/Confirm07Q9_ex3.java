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
		System.out.println("�ō��_��" + max + "�_�ł��B");
		System.out.println("�Œ�_��" + min + "�_�ł��B");
	}
}