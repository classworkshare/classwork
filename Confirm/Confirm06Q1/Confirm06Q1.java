public class Confirm06Q1 {
	public static void main(String[] args) {
		int x = 5, y = 10, z;
		z = x;
		x = y;
		y = z;
		
		System.out.println("入れ替え後のx：" + x);
		System.out.println("入れ替え後のy：" + y);
	}
}