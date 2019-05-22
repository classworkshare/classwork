public class Confirm17Q1 {
	
	public static void main(String[] args) {
		int[] data = {95,66,39,85,60,28,58,19,18,29,77,33,24};
		SelectionSort sort1 = new SelectionSort();
		BubbleSort sort2 = new BubbleSort();
		
		System.out.println("‘I‘ğ–@");
		sort1.sort(data);
		sort1.display();
		
		System.out.println("—×ÚŒğŠ·–@");
		sort2.sort(data);
		sort2.display();
	}
}