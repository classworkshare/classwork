public class Confirm11Q1 {
	
	public static void main(String[] args) {
		int result;
		CalcNomal instA;
		
		instA = new CalcNomal();
		
		result = instA.add(100, 50);
		System.out.println("Nomal�̉��Z���� �F" + result);
		
		result = CalcStatic.add(100, 50);
		System.out.println("Static�̉��Z���ʁF" + result);
		
		result = instA.subtract(100, 50);
		System.out.println("Nomal�̌��Z���� �F" + result);
		
		result = CalcStatic.subtract(100, 50);
		System.out.println("Static�̌��Z���ʁF" + result);
	}
}