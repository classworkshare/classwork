public class Confirm24Q3 {
	
	public static void main(String[] args) {
		MorningThread thread1;
		DaytimeThread instA;
		Thread thread2;
		
		thread1 = new MorningThread("おはようThread　");
		instA = new DaytimeThread("こんにちはThread");
		thread2 = new Thread(instA);
		
		thread1.start();
		thread2.start();
	}
}