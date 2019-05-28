public class Confirm12Q1 {
	
	public static void main(String[] args) {
		VariableCheck instA, instB;
		int i;
		
		instA = new VariableCheck();
		instB = new VariableCheck();
		
		for (i = 0; i < 50; i++) {
			instA.plus();
			instB.minus();
		}
		
		System.out.println("プラス側のクラス変数　　　　　　：" + instA.classVariable);
		System.out.println("プラス側のインスタンス変数　　　：" + instA.instanceVariable);
		System.out.println("マイナス側のクラス変数　　　　　：" + instB.classVariable);
		System.out.println("マイナス側のインスタンス変数　　：" + instB.instanceVariable);
	}
}