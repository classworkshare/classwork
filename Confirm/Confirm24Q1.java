public class Confirm24Q1 {
	
	public static void main(String[] args) {
		GreetThread1 thread1, thread2;
		
		thread1 = new GreetThread1("���͂悤Thread�@");
		thread2 = new GreetThread1("����ɂ���Thread");
		
		thread1.start();
		thread2.start();
	}
}