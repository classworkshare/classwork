public class Practice505_01 {
	public static void main(String[] args) {
		Greet1 instA, instB;
		
		instA = new Greet1("こんにちは");
		instB = new Greet1("さようなら");
		
		instA.start();
		instB.start();
	}
}