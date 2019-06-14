public class GreetThread2 extends Thread {
	
	GreetThread2(String name) {
		super(name);
	}

	public void run() {
		int i;
		
		for (i = 0; i < 20; i++) {
			System.out.println(this.getName() + "F" + i);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
		}
	}
}