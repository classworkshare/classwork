public class BubbleSort implements DataSort {
	
	int[] data;
	
	public void sort(int[] data) {
		int i, j; 		// 添え字
		int tmp; 		// swap用変数
		
		// 並べ替え（隣接変換法）
		for (i = data.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				// swap
				if (data[j] > data[j + 1]) {
					tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}
		
		// フィールドに格納
		this.data = new int[data.length];
		for (i = 0; i < data.length; i++) {
			this.data[i] = data[i];
		}
	}

	public void display() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "	");
		}
		System.out.println();
	}
}