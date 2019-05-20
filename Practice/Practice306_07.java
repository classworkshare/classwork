
public class Practice306_07 {

	public static void main(String[] args) {
		int[] src = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int total = 0;
		
		//1 一般的なfor文を利用した場合
		for(int i = 0 ; i < 10 ; i++) {
			int n = src[i];
			total += n;
		}
		System.out.println(total);
		
		total = 0;
		//2 拡張for文を利用した場合
		for(int n : src) {
			total += n;
		}
		System.out.println(total);
		
	}

}
