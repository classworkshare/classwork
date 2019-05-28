public class Confirm24Q2 {
	
	public static void main(String[] args) {
		GreetThread2 thread1, thread2;
		
		thread1 = new GreetThread2("‚¨‚Í‚æ‚¤Thread@");
		thread2 = new GreetThread2("‚±‚ñ‚É‚¿‚ÍThread");
		
		thread1.start();
		thread2.start();
	}
}