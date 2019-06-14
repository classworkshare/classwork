public class GreetThread1 extends Thread {
	
	GreetThread1(String name) {
		super(name);
	}

	public void run() {
		int i;
		
		for (i = 0; i < 20; i++) {
			System.out.println(this.getName() + "F" + i);
		}
	}
}