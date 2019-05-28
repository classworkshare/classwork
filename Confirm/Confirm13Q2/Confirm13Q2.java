public class Confirm13Q2 {
	
	public static void main(String[] args) {
		Arithmetic instA;
		
		instA = new Arithmetic();
		
		System.out.println("数値を１つ[5]渡した結果　　　：" + instA.calculate(5));
		System.out.println("数値を２つ[8,5]渡した結果　　：" + instA.calculate(8, 5));
		System.out.println("数値を３つ[11,8,5]渡した結果 ：" + instA.calculate(11, 8, 5));
	}
}