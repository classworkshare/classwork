public class Confirm08Q2 {
	public static void main(String[] args) {
		Confirm08Q2 instA, instB, instC;
		
		instA = new Confirm08Q2();
		instB = new Confirm08Q2();
		instC = new Confirm08Q2();
		
		instA.morningGreet();
		instB.daytimeGreet();
		instC.nightGreet();
	}

	public void morningGreet() {
		System.out.println("おはようございます！");
	}

	public void daytimeGreet() {
		System.out.println("こんにちは！");
	}

	public void nightGreet() {
		System.out.println("こんばんは！");
	}
}