public class SelectionSort implements DataSort {
	
	int[] data;
	
	public void sort(int[] data) {
		int i, j; 		//添え字
		int tmp; 		//swap用変数
		
		//並べ替え（選択法）
		for (i = 0; i < data.length - 1; i++) {
			for (j = i; j < data.length; j++) {
				//swap
				if (data[i] > data[j]) {
					tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		
		//フィールドに格納
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