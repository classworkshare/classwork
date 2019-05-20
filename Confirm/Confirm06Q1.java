
public class Confirm06Q1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println("入れ替え後のx　：" + x);
		System.out.println("入れ替え後のy　：" + y);

	}

}
