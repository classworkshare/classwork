public class Practice505_02 {
	public static void main(String[] args) {
		Greet2 instA, instB;
		Thread threadA, threadB;
		
		instA = new Greet2("‚±‚ñ‚É‚¿‚Í");
		instB = new Greet2("‚³‚æ‚¤‚È‚ç");
		threadA = new Thread(instA);
		threadB = new Thread(instB);
		
		threadA.start();
		threadB.start();
	}
}