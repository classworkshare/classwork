public class Confirm24Q2 {
	
	public static void main(String[] args) {
		GreetThread2 thread1, thread2;
		
		thread1 = new GreetThread2("おはようThread　");
		thread2 = new GreetThread2("こんにちはThread");
		
		thread1.start();
		thread2.start();
	}
}