public class SelectionSort implements DataSort {
	
	int[] data;
	
	public void sort(int[] data) {
		int i, j; 		//Y¦
		int tmp; 		//swappÏ
		
		//À×Ö¦iIð@j
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
		
		//tB[hÉi[
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