public class Confirm11Q1 {
	
	public static void main(String[] args) {
		int result;
		CalcNomal instA;
		
		instA = new CalcNomal();
		
		result = instA.add(100, 50);
		System.out.println("Nomalの加算結果 ：" + result);
		
		result = CalcStatic.add(100, 50);
		System.out.println("Staticの加算結果：" + result);
		
		result = instA.subtract(100, 50);
		System.out.println("Nomalの減算結果 ：" + result);
		
		result = CalcStatic.subtract(100, 50);
		System.out.println("Staticの減算結果：" + result);
	}
}