public class Confirm10Q1 {
	public static void main(String[] args) {
		int result;
		int num = 100;
		Confirm10Q1 instA;
		
		instA = new Confirm10Q1();
		
		result = instA.duplicate(num);
		System.out.println("渡した数値[" + num + "]の倍数は" + result);
	}
	
	public int duplicate(int num) {
		return (num * 2);
	}
}