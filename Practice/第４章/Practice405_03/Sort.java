public class Sort {
	int i, j, tmp;
	public void exchange(int[] array) {
		
		System.out.println("Before SORT !");
		for (i = 1; i < 6; i++) {
			System.out.print(i + "�ԖځF" + array[i - 1] + "  ");
		}
		
		System.out.println();
		for (i = 4; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (array[j] != Math.min(array[j], array[j + 1])) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
		
		System.out.println("After SORT !");
		for (i = 1; i < 6; i++) {
			System.out.print(i + "�ԖځF" + array[i - 1] + "  ");
		}
		
		System.out.println();
	}
}