
public class Confirm10Q1 {

	public static void main(String[] args) {
		Confirm10Q1 c = new Confirm10Q1();
		int n = 2;
		System.out.print("渡した数値[");
		System.out.print(n);
		System.out.print("]の倍数は");
		System.out.println(c.duplicate(n));
		

	}
	
	public int duplicate(int num) {
		return num * 2;
	}
	
}
