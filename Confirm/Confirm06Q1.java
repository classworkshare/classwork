
public class Confirm06Q1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println("����ւ����x�@�F" + x);
		System.out.println("����ւ����y�@�F" + y);

	}

}
